
public class variable_argument {
   static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to my code hub");
        System.out.println("The sum is 4 and 5 is:" + sum(4,5));
        System.out.println("The sum is 4 and 5 is:" + sum(4, 5,6));
    }
}
