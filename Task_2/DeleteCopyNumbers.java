public class DeleteCopyNumbers {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 1, 2, 3, 4, 6, 4, 2, 1, 3, 6, 7, 4, 4, 2, 7, 8, 3, 3, 2 };
        DeleteCopyNumbers transit = new DeleteCopyNumbers();
        transit.toZeroCopyNumbers(array);
        transit.sortArray(array);
        int count = transit.countZero(array);
        array = transit.deleteZero(array, count);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    int[] toZeroCopyNumbers(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            for (int j = 0; j < array.length - 1; j++) {
                if (temp == array[j + 1] && temp != 0 && j + 1 != i) {
                    array[j + 1] = 0;
                }
            }
        }
        return array;
    }

    int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i; j < array.length; j++) {
                    if (array[j] != 0) {
                        array[i] = array[j];
                        array[j] = 0;
                        break;
                    }
                }
            }
        }
        return array;
    }

    int countZero(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        return count;
    }

    int[] deleteZero(int[] array, int count) {
        int[] newArray = new int[array.length - count];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
