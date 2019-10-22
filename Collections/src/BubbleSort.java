import java.util.Arrays;
import java.util.Collections;
import java.lang.reflect.Array;

public class BubbleSort {
    public static int[] sort(int[] mas) {
        int i = 0;
        int goodPairsCounter = 0;
        while (true) {
            if (mas[i] > mas[i + 1]) {
                int q = mas[i];
                mas[i] = mas[i + 1];
                mas[i + 1] = q;
                goodPairsCounter = 0;
            } else {
                goodPairsCounter++;
            }
            i++;
            if (i == mas.length - 1) {
                i = 0;
            }
            if (goodPairsCounter == mas.length - 1) break;
        }
        return mas;
    }

    public static int find(int[] mas, int x) {
        int a = Arrays.binarySearch(mas,x);
        System.out.println(Arrays.binarySearch(mas,x));
        int position;
        if(a>0){
            position = (a-1);
        }
        else position=-(a+1);
        System.out.println(position);
        return position;
    }


    public static void main(String[] args) {
        int[] mas = new int[8];

        mas[0] = 163;
        mas[1] = 123;
        mas[2] = 567;
        mas[3] = 134;
        mas[4] = 132;
        mas[5] = 1675;
        mas[6] = 1343;
        mas[7] = 2;

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
            System.out.println("");
        }
        System.out.println("----Окончание вывода массива до сортировки----");

        sort(mas);

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
            System.out.println("");
        }
        System.out.println("----Окончание вывода массива после сортировки----");

        int x = 1;
        int ind = find(mas,x);
        System.out.println("----Место вставки  = " + ind);


        int u [] = new int[mas.length + 1];

        for(int i = 0; i<mas.length;i++){
            if(i<ind){
                u[i] = mas[i];
            } else {
                u[i+1] = mas[i];
            }

        }
        u[ind] = x;

        for(int i : u)
            System.out.print(i+", ");
    }


}
