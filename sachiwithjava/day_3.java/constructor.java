class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id =45;
        name="your-name-here";
    }
    
    public String getName(){return name;}
    public void setName(String n){this.name=n;}
    public void setId(int i){this.id=i;}
    public int getId(){return id;}
}
public class constructor {
    public static void main(String[] args) {
        MyMainEmployee sachin=new MyMainEmployee();
        sachin.setName("this is my personal perporty");
        sachin.getId();
        System.out.println(sachin.getId());
        System.out.println(sachin.getId());
    }
}
