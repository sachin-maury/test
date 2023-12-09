class Cylinder{
    private int radius;
    private int height;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;

    }
    public int getHeight(){
        return height;

    }
    public void setHeight(int height){
        this.height=height;

    }
     
}

public class practice_set9 {
    public static void main(String[] args) {
        Cylinder Mycylinder=new Cylinder();
        Mycylinder.setHeight(15);
        System.out.println(Mycylinder.getHeight());
        Mycylinder.setRadius(12);
        System.out.println(Mycylinder.getRadius());
       
        
    }
}
