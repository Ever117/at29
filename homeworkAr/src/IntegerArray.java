public class IntegerArray extends Array {

    public void SummInt() {

        int summ = 0;
        setArray(5);
        for (int i : array1) {
            //if (i % 2 != 0) {
            summ = summ + i;
        }
        System.out.println("The summ of all numbers: " + summ);
    }


//    // Method for determining Avarage value in array

    public void averageArray() {
        int len = array1.length;
        int sum = 0;
        for (int i : array1) {
            sum += i;
        }
        System.out.println("Average value is: " + sum / len);
    }

    public void summIntOdd() {

        int summ = 0;
        for (int i : array1) {
            if (i % 2 != 0) {
                summ = summ + i;
            }
        }
        System.out.println("Summ of odd numbers " + summ);
    }
}

