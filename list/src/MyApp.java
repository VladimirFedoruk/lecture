
class Noda {
    Noda ref;
    int data;


    Noda(Noda ref, int data) {

        this.ref = ref;
        this.data = data;

    }


}

class List {

    Noda head = null;

    void add(int data) {


        if (head == null) {
            head = new Noda(null, data);
        } else {
            Noda kursor = head;
            while (kursor.ref != null) {
                kursor = kursor.ref;
            }
            Noda temp = new Noda(null, data);
            kursor.ref = temp;
        }
    }

    boolean add(int data, int insert) {

        Noda kursor = head;
        if (insert > length()+1 || insert < 0) {
            System.out.println("You out for border list");
            return false;
        }

        if (insert == 0) {
            Noda n = new Noda(null, data);
            n.ref = head;
            n.data = data;
            head = n;
        } else {
            int i = 0;
            while (i < insert - 1) {
                i++;
                kursor = kursor.ref;
            }
            Noda n = new Noda(null, data);

            n.ref = kursor.ref;
            n.data = data;
            kursor.ref = n;
        }
        return true;
    }

    boolean remove() {

        Noda kursor = head;
        int insert=0;
        if (insert > length()+1 || insert < 0) {
            System.out.println("You out for border list");
            return false;
        }

        if (insert == length()) {
            kursor.ref = null;
                    }
        return true;
    }

    boolean remove(int data, int insert) {

        Noda kursor = head;
        if (insert > length()+1 || insert < 0) {
            System.out.println("You out for border list");
            return false;
        }

        if (insert == 0) {
            Noda n = new Noda(null, data);
            n.ref = head;
            n.data = data;
            head = n;
        } else {
            int i = 0;
            while (i < insert - 1) {
                i++;
                kursor = kursor.ref;
            }
            Noda n = new Noda(null, data);

            n.ref = kursor.ref;
            n.data = data;
            kursor.ref = n;
        }
        return true;
    }

    void print() {
        Noda kursor = head;
        while (kursor.ref != null) {
            System.out.println(kursor.data);
            kursor = kursor.ref;
        }
        System.out.println(kursor.data);
    }

    int length() {
        Noda kursor = head;
        int i = 0;
        while (kursor.ref != null) {
            kursor = kursor.ref;
            i++;
        }

        return i;
    }
}

public class MyApp {
    public static void main(String[] args) {

        List list = new List();
        list.add(54);
        list.add(54);
        list.add(54);
        list.add(2, 4);

        System.out.println(list.length());
        list.print();
    }
}
