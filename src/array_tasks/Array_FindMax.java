package array_tasks;

public class Array_FindMax {

    /*
        Write a function that can find the maximum number from an int Array
     */

    public static int findMax(int[] arr){

      int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])
                max=arr[i];

        }
        return max;
    }

    public static void main(String[] args) {
        int array[]= {3,4,2,3,5,6,8,9};

        System.out.println(findMax(array));

    }

}
