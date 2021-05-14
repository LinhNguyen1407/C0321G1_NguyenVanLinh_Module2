package bai9_list.exercise.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(0, 10);
        myList.add(1, 11);
        myList.add(2, 12);
        myList.add(3, 13);
        myList.add(4, 14);

        System.out.println("Size: " + myList.size());

        myList.remove(2);
        System.out.println("Size after delete element 2: " + myList.size());

        System.out.println("New element 2: " + myList.get(2));

        System.out.println(myList.contains(11));
        System.out.println(myList.contains(12));

        myList.clone();
        System.out.println("Size after clone: " + myList.size());

        myList.clear();
        System.out.println("Size after clear: " + myList.size());
    }
}
