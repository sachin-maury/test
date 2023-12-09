class MyEmployee{
   private int id;
   private String name;
   public String getName(String n){
    return name;

   }
   public void setName(String n){
    name = n;
   }
   public int getId(){
    return id;
   }
   public void setId(int i){
    id=i;
   }
}
public class ch9_modifirs {
    public static void main(String[] args) {
        MyEmployee shakti=new MyEmployee();
     /*  p1.id=8;
      p1.name="shakti"; */
      shakti.setName("hello how are you");
      System.out.println(shakti.getName(null));
}
}