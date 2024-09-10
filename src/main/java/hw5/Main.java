package hw5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,0,1,2,3,0};

        Backup backup = new Backup();
        WriterToFile writer = new WriterToFile();
        try {
            backup.createBackup();
            writer.writeToFile(array);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
