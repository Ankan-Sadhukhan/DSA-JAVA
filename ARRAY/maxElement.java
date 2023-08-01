package ARRAY;

public class maxElement {

    public static int Max(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,31,5,7,9};
        int max=Max(arr);
        System.out.println(max);
    }
}
