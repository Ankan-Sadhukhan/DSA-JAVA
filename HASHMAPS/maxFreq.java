import java.util.ArrayList;
import java.util.HashMap;;
public class maxFreq{

    public static char maxFreqChar(String str){

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                int of=map.get(str.charAt(i));
                int nf=of+1;
                map.put(str.charAt(i),nf);
            }else{
                map.put(str.charAt(i),1);
            }
        }

        ArrayList<Character> list= new ArrayList<>(map.keySet());

        char maxchar=' ';
        int maxfreq=0;
        for(char ch:list){
            if(map.get(ch)>maxfreq){
                maxchar=ch;
                maxfreq=map.get(ch);
            }
        }


        return maxchar;
    }

    public static void main(String[] args) {
        String str="abbcdabbbd";
        System.out.println(maxFreqChar(str));
    }
}