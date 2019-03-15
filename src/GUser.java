public class GUser {
public static void main(String args[]){
    GOne<String> ob1=new GOne<String>();
    ob1.show("hello");
    
    GOne<Integer> ob2=new GOne<Integer>();
    ob2.show(10);
    
    GOne ob3=new GOne();
    ob3.show(15);
    ob3.show("ab");
    
}    
}
