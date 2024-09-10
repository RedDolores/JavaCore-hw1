package hw5;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriterToFile {
    public void writeToFile(int[] array) throws IOException {
        String fileName = "./file.txt";
        FileOutputStream fos = new FileOutputStream(fileName);
        for (int i = 0; i < 3; i++) {
            byte wr = 0;
            for (int j = 0; j < 3; j++) {
                wr += (byte) (array[3 * i + j] << (j * 2));
            }
            fos.write(wr);
        }
        fos.flush();
        fos.close();
    }
}
