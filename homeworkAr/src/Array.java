
import java.util.Random;

public class Array {

    public int[] array1;

    // Default constructor

    public Array() {
    }

    // Constructor that accepts array values

    public Array(int[] array1) {

        this.array1 = array1;
    }

    // Method for creating and filling an array

    public int[] setArray(int k) {
        this.array1 = new int[k];
        System.out.print("Array is filled by next numbers: ");
        // create instance of Random class
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            int rand_int = rand.nextInt(1000);
            array1[i] = rand_int;
            System.out.print(array1[i] + ", ");
        }
        System.out.println(" ");
        return array1;
    }


    // Method that lead out keys of even numbers

    public void Keys() {
        System.out.print("Summ of odd keys: ");
        int summ = 0;
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 != 0) {
                summ = summ + i;
            }
        }
        System.out.println(summ);
    }

    // Method that lead out array

    public void printAllArray() {
        System.out.print("All numbers in given array: ");
        System.out.print("{");
        for (int i : array1) {
            System.out.print(i + ", ");
        }
        System.out.println("}");
    }

}
