class Employee{
    int salary;
    String name;
    
    public int getSalary(){
        return salary;
        
}
    public String getName(){
        return name;
    }
    public void  setName(String n){
        name=n;
    }


}
public class ch8_quistion1 {
    public static void main(String[] args) {
        //problem:
        Employee sachin=new Employee();
        sachin.salary=884;
        sachin.setName("sachin is a good boy");
        System.out.println(sachin.getName());
        System.out.println(sachin.getSalary());
    }
}
