public class substring {
    
    public static void main(String[] args) {
        
        print1substring("code");
    }


    public static void print1substring(String str) {
        int n=str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(str.substring(i, j));
            }
        }
        
    }

}
