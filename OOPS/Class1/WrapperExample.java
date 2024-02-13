public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Integer x =10; // not swapped - as in implementation final keyword has used
        Integer y = 20;
        swap(x, y);
        System.out.println(x+"+"+y);


        final A ankan = new A("ANkan");
        //ankan = new A("sadhu"); //gives error
        ankan.name = "name changed";

        // A obj = new A("adagag");

        // for(int i=0;i<1000000000;i++){
        //     obj = new A("random");
        // }

        System.out.println(ankan.name);
        
    }

    static void swap(int a,int b){ // value not swapped -- java premitive is always pass by value
        int temp = a;
        a = b;
        b = temp;
    }
}

class A{
    final int num = 100;
    String name;

    A(String name){
        // object is created
        this.name = name;
    }

    @Override
    protected void finalize(){
        System.out.println("Object is destroyed");
    }

}


