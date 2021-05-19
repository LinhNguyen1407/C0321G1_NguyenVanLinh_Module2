package bai11_stack_queue.exercise;
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
        Queue<Staff> staffQueue = new LinkedList<>();
        Queue<Staff> maleQueue = new LinkedList<>();
        Queue<Staff> femaleQueue = new LinkedList<>();
        Queue<Staff> resultQueue = new LinkedList<>();

        Staff staff1 = new Staff("An", "Nam", "2000/01/01");
        Staff staff2 = new Staff("Binh", "Nu", "1990/01/01");
        Staff staff3 = new Staff("Ha", "Nu", "1988/04/01");
        Staff staff4 = new Staff("Hai", "Nam", "1988/03/01");
        Staff staff5 = new Staff("Duc", "Nam", "1988/02/01");
        staffQueue.add(staff1);
        staffQueue.add(staff2);
        staffQueue.add(staff3);
        staffQueue.add(staff4);
        staffQueue.add(staff5);

        for (Staff element : staffQueue) {
            String gender = element.getGender();
            if (gender.equals("Nam")) {
                maleQueue.offer(element);
            } else {
                femaleQueue.offer(element);
            }
        }

        while (!maleQueue.isEmpty()) {
            resultQueue.add(maleQueue.remove());
        }
        while (!femaleQueue.isEmpty()) {
            resultQueue.add(femaleQueue.remove());
        }

        System.out.println("Display staff list by gender");
        for (Staff person : resultQueue) {
            System.out.println(person.getName() + "\t" + person.getGender() + "\t" + person.getBirthday());
        }
    }
}

