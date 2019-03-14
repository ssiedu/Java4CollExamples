package colldemo;

import java.util.Stack;

public class CollFour {
    public static void main(String args[]){
        
        Stack stk=new Stack();

        stk.push("one");
        stk.push("two");
        stk.push(3);
        stk.push(4.1);
        
        Double d1=(Double) stk.pop();
        //System.out.println(d1.doubleValue()*2);
        System.out.println(d1*2);
        Integer i1=(Integer)stk.pop();
        //System.out.println(i1.intValue()+2);
        System.out.println(i1+2);
        
        
        
        
        
        
        
    }
}
