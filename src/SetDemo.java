
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
public static void main(String args[]){
    
    //HashSet<String> set=new HashSet<String>();
    //LinkedHashSet<String> set=new LinkedHashSet<String>();
    TreeSet<String> set=new TreeSet<String>();
    set.add("java");
    set.add("php");
    set.add("oracle");
    set.add("python");
    set.add("hadoop");
    set.add("php");
    System.out.println(set);
}    
}
