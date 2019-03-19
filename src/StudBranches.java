
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class StudBranches {

    public static void main(String args[]) {

        Stud s1 = new Stud(111, "AAA", "CS", 5);
        Stud s2 = new Stud(222, "BBB", "IT", 3);
        Stud s3 = new Stud(333, "CCC", "IT", 4);
        Stud s4 = new Stud(444, "DDD", "CS", 6);
        Stud s5 = new Stud(555, "EEE", "CS", 7);
        
        
        
        ArrayList<Stud> csList=new ArrayList<Stud>();
        csList.add(s1); csList.add(s4); csList.add(s5);
        
        ArrayList<Stud> itList=new ArrayList<Stud>();
        itList.add(s2); itList.add(s3); 
        
        HashMap<String,ArrayList<Stud>> map=new HashMap();
        map.put("cs", csList);
        map.put("it", itList);
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Branch To View : ");
        String branch=sc.next();
        ArrayList<Stud> list=map.get(branch);
        
        for(Stud st:list){
            st.show();
        }
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
