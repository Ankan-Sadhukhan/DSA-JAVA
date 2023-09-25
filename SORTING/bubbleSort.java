public class bubbleSort{

    public static void bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean isSwap=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwap=true;
                }
            }
            if(!isSwap) return ;
        }
    }

    public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={2,5,1,7,5,8,3};
        bubblesort(arr);
        printArray(arr);
    }
}