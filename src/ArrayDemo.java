
import java.util.Arrays;

public class ArrayDemo {
public static void main(String args[]){
    
    int ar[]={10,5,2,100,25,150,22,90};
    for(int tmp:ar){
        System.out.println(tmp);
    }
    System.out.println("Sorting Array");
    Arrays.sort(ar);
    for(int tmp:ar){
        System.out.println(tmp);
    }
    
    int pos=Arrays.binarySearch(ar, 55);
    System.out.println("Index of 55 : "+pos);
    
    
    
    
    
    
}    
}
