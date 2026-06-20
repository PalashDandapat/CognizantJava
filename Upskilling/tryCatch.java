import java.util.*;
class tryCatch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int r=a/b;
            System.out.println(r);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}