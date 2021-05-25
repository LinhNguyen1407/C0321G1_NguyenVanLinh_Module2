package bai16_io_text_file.exercise.copy_file_text;
import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteFile {
    public ArrayList<Integer> readFile(String filePath) {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int character;
            while ((character = bufferedReader.read()) != -1) {
                list.add(character);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại");
        }
        return list;
    }

    public int countCharacter(ArrayList<Integer> list) {
        return list.size();
    }

    public void writeFile(ArrayList<Integer> list) {
        try {
            File file = new File("D:\\CodeGym\\Intellij_IDEA_Module_02\\src\\bai16_io_text_file\\exercise\\copy_file_text\\result.txt");
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            while (!list.isEmpty()) {
                bufferedWriter.write(list.remove(0));
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
