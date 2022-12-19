package array_tasks;

public class Array_FindMin {

     /*
    Write a function that can find the maximum number from an int Array
     */


    public static int findMin(int []arr){
    int min= arr[0];
        for (int i = 0; i < arr.length; i++) {
        if(min > arr[i])
            min=arr[i];

    }
        return min;
}

    public static void main(String[] args) {
        int array[]= {3,4,2,3,5,6,8,9};

        System.out.println(findMin(array));

    }
}
