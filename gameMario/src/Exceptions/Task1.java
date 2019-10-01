package Exceptions;
//Иерархия класов исключений.
// 1. Группа Eror  и все его наследники.
// 2. Группа Exception  и все его наследники.
// 3. Группа RuntimeException и его наследники.
class Goodoo{
    void doStuff(){
        doMore();
    }
    void doMore(){
        throw new ArithmeticException();
    }
}
public class Task1 {
    public static void main(String args[]){
        Goodoo goodOO= new Goodoo();
        try {
            goodOO.doStuff();
        } catch (Exception ex) {
            ex.printStackTrace();
//          Logger.getLogger(Task01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
