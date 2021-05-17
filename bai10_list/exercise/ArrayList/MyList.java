package bai10_list.exercise.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int DEFAULT_CAPACITY) {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        this.size++;
    }

    public E remove(int index) {
        Object temp = elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        this.size--;
        return (E) temp;
    }

    public int size() {
        return this.size;
    }

    public MyList<E> clone(MyList myList) {
        if (myList.size() == 0) {
            throw new NullPointerException("Not any elements");
        }
        MyList<E> returnMyList = new MyList<>();
        for (int i = 0; i < size; i++) {
            returnMyList.add(i, (E) myList.elements[i]);
        }
        return returnMyList;
    }

    public boolean contains(E element) {
        return indexOfE(element) != -1;
    }

    public int indexOfE(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        this.size = 0;
    }
}
