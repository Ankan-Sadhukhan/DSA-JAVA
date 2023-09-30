public class mergeSort {

    public static int[] merge(int[] arr1,int[] arr2){
        int i=0,j=0,k=0;
        int[] ans = new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            }
            else{
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }

        while(i<arr1.length){
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            ans[k]=arr2[j];
            k++;
            j++;
        }
        return ans;
    }

    public static int[] f(int[] arr,int s,int e){

        if(s==e){
            int[] ans=new int[1];
            ans[0]=arr[s];
            return ans;
        }
        int mid=(s+e)/2;

        int[] arr1=f(arr, s, mid);
        int[] arr2=f(arr, mid+1, e);
        return merge(arr1,arr2);
       
    }
    public static void mergesort(int[] arr){
        int[] ans=f(arr,0,arr.length-1);
        for(int i=0;i<ans.length;i++){
            arr[i]=ans[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={2,-1,8,9,1,12,6,0};
        mergesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
