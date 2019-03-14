package colldemo;

import java.util.ArrayList;
import java.util.Scanner;

public class CollOne {
public static void main(String[] args) {

        ArrayList<String> students=new ArrayList<String>();
        
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println("Enter Name ");
            String name=sc.next();
            if(name.equals("end")){
                break;
            }
            students.add(name);
        }
        System.out.println("___________________________");
        System.out.println("Students Attending Class");
        System.out.println("___________________________");
        
        for(String st:students){
            System.out.println(st);
        }
        
        
        
    }    
}
