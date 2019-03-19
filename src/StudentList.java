
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
public static void main(String args[]){
    
    Stud s1=new Stud(111,"AAA","CS",5);
    Stud s2=new Stud(222,"BBB","EX",3);
    Stud s3=new Stud(333,"CCC","IT",4);
    Stud s4=new Stud(444,"DDD","Mech",6);
    Stud s5=new Stud(555,"EEE","Civil",7);
    
    ArrayList<Stud> list=new ArrayList<Stud>();
    list.add(s1); list.add(s2);
    list.add(s3); list.add(s4);
    list.add(s5);
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Roll No. : ");
    int n=sc.nextInt();
    
    for(Stud st:list){
        if(st.getRno()==n){
            st.show();
            break;
        }
    }
    
    
    
    
    
    
    
    
}    
}
