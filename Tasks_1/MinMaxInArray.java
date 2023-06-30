public class MinMaxInArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 4, 4, 5, 6, 7, 9, 8, 4, 3, 2, 0, 1, 2 };
        int min = array[0], max = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index])
            {
                min = array[index];
            }
            if (max < array[index])
            {
                max = array[index];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
