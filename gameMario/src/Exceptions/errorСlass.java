package Exceptions;
import java.util.Scanner;

class UserException extends Exception{
    public UserException(){
        super();
    }
    public UserException(String descr){
        super(descr);
    }
}



public class errorСlass {
public static void main(String[] args) throws UserException{
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int j = s.nextInt();
        if(j == 0) {
        throw new UserException();
        }
        System.out.println(i/j);
        }
        }
