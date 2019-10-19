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
        int position;
        int comparisonCount = 1;
        int first = 0;
        int last = mas.length-1;
        int index = -1;
        position = (first + last) / 2;

        while ((mas[position] != x) && (first <= last)) {
            comparisonCount++;
            if (mas[position] > x) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(x+ " является " + ++position + " элементом в массиве");
            System.out.println("Метод бинарного поиска нашел число после " + comparisonCount +
                    " сравнений");
        } else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
                    + comparisonCount + " сравнений");
        }
        System.out.println("искомая позиция " + index);
        return index;
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
        mas[7] = 1;

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

        int x = 1343;
        int ind = find(mas,x);

    }


}
