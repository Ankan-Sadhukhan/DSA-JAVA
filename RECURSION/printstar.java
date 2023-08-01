public class printstar{

    public static void print(int n,int i){
        if(i==n){
            return;
        }
        System.out.print("******");
        System.out.println();
        print(n,i+1);
    }
    public static void main(String[] args) {
        print(6,0);
    }
}