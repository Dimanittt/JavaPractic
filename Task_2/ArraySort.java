public class ArraySort {
    public static void main(String[] args) {
        int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int i = 0;
        int j = 0;
        int min = array[0];
        int temp = 0;
        while (i < array.length) {
            min = array[i];
            while (j < array.length) {
                if (array[j] < min) {
                    array[i] = array[j];
                    array[j] = min;
                    min = array[i];
                }
                j++;
            }
            i++;
            j = i; // if this string put before i++ then it will be a max -> min sort
        }
        ArraySort arraySort = new ArraySort();
        arraySort.getArray(array);
    }

    void getArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
