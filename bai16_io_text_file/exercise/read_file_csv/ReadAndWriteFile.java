package bai16_io_text_file.exercise.read_file_csv;

import java.io.*;

public class ReadAndWriteFile {
    public void readFile(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                Country country = new Country(Integer.parseInt(strings[0]), strings[1], strings[2]);
                System.out.println(country);
            }
        } catch (IOException e) {
            System.err.println("File không tồn tại");
        }
    }
}
