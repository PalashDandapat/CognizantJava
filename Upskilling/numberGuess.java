import java.util.*;
class numberGuess{
    public static void main(String args[]){
        Random rd=new Random();
        int num=rd.nextInt(100);
        int guess=-1;
        Scanner sc=new Scanner(System.in);
        while(guess!=num){
            guess=sc.nextInt();
            if(guess<num){
                System.out.println("guess is low");
            }else if(guess>num){
                System.out.println("Guess is high");
            }
        }
        System.out.println("found");
    }
}