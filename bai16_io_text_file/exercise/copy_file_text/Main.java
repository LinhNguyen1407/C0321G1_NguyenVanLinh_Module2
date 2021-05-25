package bai16_io_text_file.exercise.copy_file_text;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        ArrayList<Integer> list = readAndWriteFile.readFile("D:\\CodeGym\\Intellij_IDEA_Module_02\\src\\bai16_io_text_file\\exercise\\copy_file_text\\input.txt");
        System.out.println("Số ký tự trong file: " + readAndWriteFile.countCharacter(list));
        readAndWriteFile.writeFile(list);
    }
}
