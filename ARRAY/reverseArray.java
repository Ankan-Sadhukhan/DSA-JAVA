package ARRAY;

public class reverseArray {


    public static void reverseofArray(int[] arr){
        int start=0;
        int end =arr.length-1;
        while(end>=start){
            // swap(arr[start],arr[end]);
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr={10,20,30,40, 50};
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
        reverseofArray(arr);
        for(int val:arr){
            System.out.print(val +" ");
        }
    }
}
