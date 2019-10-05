
//*public class spisok {

    static class Noda {
        Noda (String ref, int date) {
            this.ref = ref;
            this.date = date;
        }
          Noda ref;
          int data;
           }
     class list {
        String head;
         void add(String ref, int date) {
         }

         void print(Noda head){
             Noda kursor = head;
             while (kursor.ref != null) {
                 System.out.println(kursor.date);
                 kursor = kursor.ref;
             }
             System.out.println(kursor.date);
         }
     }



    public static void main(String[] args) {
        Noda head;
        Noda n1 = new Noda(null, 35);
        Noda n2 = new Noda(null, 48);
        n1.ref = n2;
        Noda n3 = new Noda(null, 54);
        n2.ref = n3;
        Noda n4 = new Noda(null, 0);
        n3.ref = n4;

    }
}
