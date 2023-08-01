package ARRAY;

public class rotateArray {

    public static void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
        for(int i=1;i<=k;i++){
            int temp=nums[len-1];
            for(int j=len-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,9};
        for(int val:arr){
            System.out.print(val +" ");
        }
        rotate(arr,2);
        for(int val:arr){
            System.out.print(val +" ");
        }
    }
}
