
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
    void add(int data, int insert) {


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

    void print() {
        Noda kursor = head;
        while (kursor.ref != null) {
            System.out.println(kursor.data);
            kursor = kursor.ref;
        }
        System.out.println(kursor.data);
    }
    int length(){
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

        System.out.println(list.length());
        list.print();
    }
}
