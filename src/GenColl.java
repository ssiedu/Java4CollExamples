
import java.util.Stack;

public class GenColl {
    public static void main(String args[]){
        
        Stack<String> stk1=new Stack<String>();
        stk1.push("one"); stk1.push("two");
        //stk1.push(10); stk1.push(20);
        
        Stack<Integer> stk2=new Stack<Integer>();
        stk2.add(10); stk2.add(20);
        //stk2.add("three"); stk2.add("four");
        
        Stack stk3=new Stack();
        stk3.push("four"); stk3.push("five");
        stk3.push(56); stk3.push(65);
        
        String res1=stk1.pop();
        System.out.println(res1);

        Integer res2=stk2.pop();
        System.out.println(res2);
        
        Integer res3=(Integer)stk3.pop();
        System.out.println(res3);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
