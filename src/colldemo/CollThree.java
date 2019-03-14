package colldemo;

import java.io.File;
import java.util.Stack;

public class CollThree {
    public static void main(String args[]){
        
        Stack stk=new Stack();

        stk.push("one");
        stk.push("two");
        stk.push(new Integer(3));
        stk.push(new Double(4.1));
        
        Double d1=(Double) stk.pop();
        double d2=d1.doubleValue();
        System.out.println(d2*2);
        
        Integer i1=(Integer)stk.pop();
        int i2=i1.intValue();
        System.out.println(i2+2);
        
        
        
        
        
        
        
    }
}
