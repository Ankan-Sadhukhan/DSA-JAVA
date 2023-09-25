public class pr1_subsequence{


    public static void substring(String str,int idx,String output){
        if(idx== str.length()){
            System.out.println(output);
            return;
        }

        substring(str,idx+1,output+str.charAt(idx));
        substring(str,idx+1,output);

    }
    public static void main(String[] args) {
        String str="abc";
        substring(str, 0, "");
    }
}