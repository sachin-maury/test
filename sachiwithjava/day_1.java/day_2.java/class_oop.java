 class employee{
    int  id ;
    String name;
    public void printDetails(){
        System.out.println("my id is:" + id);
        System.out.println("my name is:" + name);
    }
}
public class class_oop {
    public static void main(String[] args) {
        System.out.println("This is our life:");
        //setting properties :attributes
        employee sachin =new employee();
        sachin.id=12;
        sachin.name="this is my passion:";
        sachin.printDetails();
       // System.out.println(sachin.id);
       // System.out.println(sachin.name);
    }
}
