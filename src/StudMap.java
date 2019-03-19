
import java.util.HashMap;
import java.util.Scanner;


public class StudMap {

    public static void main(String args[]) {

        Stud s1 = new Stud(111, "AAA", "CS", 5);
        Stud s2 = new Stud(222, "BBB", "EX", 3);
        Stud s3 = new Stud(333, "CCC", "IT", 4);
        Stud s4 = new Stud(444, "DDD", "Mech", 6);
        Stud s5 = new Stud(555, "EEE", "Civil", 7);
        
        HashMap<String,Stud> map=new HashMap<String,Stud>();
        map.put("111", s1);
        map.put("222", s2);
        map.put("333", s3);
        map.put("444", s4);
        map.put("55511", s5);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rno : ");
        String id=sc.next();
        
        Stud s=map.get(id);
        s.show();
        
        
        
        
        
       
        
        
    }
}
