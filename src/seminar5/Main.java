package seminar5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.util.stream.DoubleStream;

public class Main {
    private static String backupDir = "./backup";
    private static String source = "./files";

    public static void main(String[] args) {
        Path dest = Paths.get(backupDir);
        Path src = Paths.get(source);

        if (!createDir(dest) || !existDir(src))
            return;

        try (DirectoryStream<Path> dir = Files.newDirectoryStream(src)) {
            for (Path file : dir) {
                if (!Files.isDirectory(file))
                    Files.copy(file, Path.of(backupDir + "/" + file.getFileName()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        task2();
    }

    public static boolean createDir(Path path) {
        try {
            Files.createDirectory(path);
        } catch (FileAlreadyExistsException e) {
            System.out.println("The directory exists!");
        } catch (IOException e) {
            System.out.println("Error creating the directory!");
            return false;
        }
        return true;
    }

    public static boolean existDir(Path path) {
        return Files.exists(path) && Files.isDirectory(path);
    }

    public static void task2(){
        String name = "save1.out";
        int[] ar2 = {0,1,2,3,0,1,2,3,0};

        try (FileOutputStream fos = new FileOutputStream(name)) {
            for (int b = 0; b < 3; b++) {
                byte wr = 0;
                for (int v = 0; v < 3; v++) {
                    wr += (byte) (ar2[3 * b + v] << (v * 2));
                }
                fos.write(wr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
