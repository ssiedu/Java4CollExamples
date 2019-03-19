public class Stud {
    private int rno;
    private String name;
    private String branch;
    private int sem;

    public int getRno(){
        return rno;
    }
    public Stud(int rno,String name, String branch, int sem) {
        this.rno=rno;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
    }
   
    public void show(){
        System.out.println("RollNo  : "+rno);
        System.out.println("Name    : "+name);
        System.out.println("Branch  : "+branch);
        System.out.println("Sem     : "+sem);
        System.out.println("_______________________________");
    }
    
}
