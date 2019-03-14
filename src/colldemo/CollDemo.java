package colldemo;

import java.util.Scanner;

public class CollDemo {
    public static void main(String[] args) {

        String s[]=new String[5];
        
        Scanner sc=new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            System.out.println("Enter Name of Student - "+(i+1));
            s[i]=sc.next();
        }
        
        System.out.println("Students Attending Class");
        for(String tmp:s){
            System.out.println(tmp);
        }
        
        
        
        
    }
    
}
