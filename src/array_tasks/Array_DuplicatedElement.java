package array_tasks;

public class Array_DuplicatedElement {


//    write a program that can find the first duplicated element from the array

public static int findDupElement(int[] arr){

        int firstDuplicated=0;
    for (int i = 0; i < arr.length; i++) {
        int frequency=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[i]==arr[j])
                frequency++;
        }
        if(frequency>1) {
            firstDuplicated=arr[i];
            break;
        }
    }


return firstDuplicated;
}

    public static void main(String[] args) {
        int array [] = {1,2,3,4,2,5,6};
        System.out.println(findDupElement(array));
    }


}
