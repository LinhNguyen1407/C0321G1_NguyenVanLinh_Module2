package bai10_stack_queue.exercise;
import java.util.Queue;
import java.util.LinkedList;

public class DataOrganization {
    public static void main(String[] args) {
        class Staff {
            private String name;
            private String gender;
            private String birthday;

            public Staff() {
            }

            public Staff(String name, String gender, String birthday) {
                this.name = name;
                this.gender = gender;
                this.birthday = birthday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }
        }

        Queue<Staff> maleQueue = new LinkedList<>();
        Queue<Staff> femaleQueue = new LinkedList<>();
        Staff staff1 = new Staff("An", "Nam", "20000101");
        Staff staff2 = new Staff("Binh", "Nu", "19900101");
        Staff staff3 = new Staff("Ha", "Nu", "19880401");
        Staff staff4 = new Staff("Hai", "Nam", "19880301");
        Staff staff5 = new Staff("Duc", "Nam", "19880201");

        Staff[] staffList = {staff1, staff2, staff3, staff4, staff5};
        for (Staff element : staffList) {
            String gender = element.getGender();
            if (gender.equals("Nam")) {
                maleQueue.offer(element);
            } else {
                femaleQueue.offer(element);
            }
        }

        Staff[] maleArray = new Staff[maleQueue.size()];
        Staff[] femaleArray = new Staff[femaleQueue.size()];
        int numMales = maleQueue.size();
        int numFemales = femaleQueue.size();
        for (int i = 0; i < numMales; i++) {
            maleArray[i] = maleQueue.remove();
        }
        for (int j = 0; j < numFemales; j++) {
            femaleArray[j] = femaleQueue.remove();
        }

        System.out.println("Display staff list by gender");
        for (Staff person : maleArray) {
            System.out.println(person.getName() + "\t" + person.getGender() + "\t" + person.getBirthday());
        }
        for (Staff person : femaleArray) {
            System.out.println(person.getName() + "\t" + person.getGender() + "\t" + person.getBirthday());
        }
    }
}

