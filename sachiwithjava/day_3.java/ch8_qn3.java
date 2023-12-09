class square{
    int side;

    public int area(){
        return side*side;

    }
    public int parimeter(){
        return 4*side;
        
    }
}

public class ch8_qn3 {
    public static void main(String[] args) {
        //problem:
        square sq=new square();
        sq.side=3;
        System.out.println(sq.area());
        System.out.println(sq.parimeter());
    }
}
