package bai17_io_binary_file_serialization.practice.read_write_list_student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));

        StudentManager.writeToFile("D:\\CodeGym\\Intellij_IDEA_Module_02\\src\\bai17_io_binary_file_serialization\\practice\\read_write_list_student\\students.txt", students);
        List<Student> studentDataFromFile = StudentManager.readDataFromFile("D:\\CodeGym\\Intellij_IDEA_Module_02\\src\\bai17_io_binary_file_serialization\\practice\\read_write_list_student\\students.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
}
