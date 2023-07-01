//this programm removes only val value from array, and seemingly doesn't work))

public class DeleteCopyNumbersInternet {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 2, 1 };
        DeleteCopyNumbersInternet deleteCopyNumbersInternet = new DeleteCopyNumbersInternet();
        deleteCopyNumbersInternet.removeElement(array, 2);
        for (int i=0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == val){
                offset++;
            } else{
                nums[i - offset] = nums[i];
            }
        }

        int[] newArray = new int[nums.length - offset];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = nums[i];
        }
        return newArray;
    }
}
