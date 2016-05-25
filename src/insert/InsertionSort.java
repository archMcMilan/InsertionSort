package insert;

/**
 * Created by Артем on 25.05.2016.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] mass = { 1, 3, 4, 9, 2, 6, 5, 8, 7, 0 };
        mass = sortInsert(mass, 0);
        print(mass, 0);
    }

    public static int[] sortInsert(int[] mas, int i) {
        i++;
        insert(mas, i);
        if (i <  mas.length) {
            mas = sortInsert(mas, i);
        }
        return mas;
    }

    private static int[] insert(int[] mas, int j) {
        j--;
        if (j > 0) {
            if (mas[j - 1] > mas[j]) {
                mas[j] = mas[j - 1] + mas[j];
                mas[j - 1] = mas[j] - mas[j - 1];
                mas[j] = mas[j] - mas[j - 1];
                mas = insert(mas, j);
            }
        }
        return mas;
    }

    private static void print(int[] mas, int i) {
        if (i < mas.length) {
            System.out.println(mas[i]);
            i++;
            print(mas, i);
        }
    }
}
