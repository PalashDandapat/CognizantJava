import java.util.*;
class simpleCalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int num1=sc.nextInt();
        System.out.println("Enter Number2: ");
        int num2=sc.nextInt();
        System.out.println("Enter Operation : ");
        String operation=sc.next();
        switch (operation){
            case "+":System.out.println(num1+num2);
            break;
            case "-":System.out.println(num1-num2);
            break;
            case "*":System.out.println(num1*num2);
            break;
            case "/":System.out.println(num1/num2);
            break;
            default :System.out.println("Invalid Operations");
            break;
        }
        sc.close();
        
    }
}