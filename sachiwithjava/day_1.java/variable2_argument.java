public class variable2_argument {
    static int sum(int ...arr){
           //Available as int [] arr
           int result=0;
           for(int a: arr){
            result+=a;
           }
           return result;
 
    }
    public static void main(String[] args) {
        System.out.println("Welcome to my code hub");
        System.out.println("The sum is 4 and 5 is:" + sum(4,5));
        System.out.println("The sum is 4 and 5 is:" + sum(4, 5,6));
        System.out.println("Welcome to my code hub2:");
        System.out.println("The sum is 4 and 5 is:" + sum(8,5));
        System.out.println("The sum is 4 and 5 is:" + sum(4, 9,6));

    }
}
