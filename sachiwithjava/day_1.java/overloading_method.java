public class overloading_method {
    static void change(int a){
        a=98;
    }
     static void change2(int [] arr){
        arr[0]=98;
    }
    static void tusharjoke(){
        System.out.println("I invented a new word!\n" + "plagiarism!");
    }
    public static void main(String[] args) {
        //tusharjoke();
        
        // Case 1 changing the integer:
        //int x=45;
        //change(x);
       // System.out.println("The value of X after change is: " + x);
        // Case 2 changing the array:
        int [] marks = {52, 78, 89, 98, 65};
        change2(marks);
        System.out.println("The value of X after change is: "+ marks[0]);


        
    }
}
