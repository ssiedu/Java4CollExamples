
import java.util.ArrayList;
import java.util.Iterator;

public class CollMethods {
public static void main(String args[]){
    ArrayList<String> list1=new ArrayList<String>();
    list1.add("java"); list1.add("oracle");
    list1.add("php");
    
    Iterator<String> it=list1.iterator();
    while(it.hasNext()){
    System.out.println(it.next());
    }
    
    /*
    //iterating using foreach
    for(String s:list1){
        System.out.println(s);
    }
    */
    
    
    /*
    ArrayList<String> list2=new ArrayList<String>();
    list2.add("linux"); list2.add("solaries"); list2.add("mac");
    //System.out.println(list1.size());
    //System.out.println(list1.isEmpty());
    //System.out.println(list1.contains("oracle"));
    System.out.println(list1);
    System.out.println(list2);
    //list1.remove("php");
    //System.out.println(list1);
    System.out.println("___________________________________________________");
    list2.addAll(list1);
    System.out.println(list1);
    System.out.println(list2);
    System.out.println("___________________________________________________");
    //list2.removeAll(list1);
    //list2.retainAll(list1);
    list2.clear();
    System.out.println(list1);
    System.out.println(list2);
    System.out.println("___________________________________________________");
*/
}    
}
