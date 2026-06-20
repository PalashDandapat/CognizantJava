import java.util.*;
class AgeException extends Exception{
    public AgeException(String msg){
        super(msg);
    }
}
class custExcep2{
    static void Cage(int age) throws AgeException{
        if(age<18){
            throw new AgeException("UnderAge");
        }
        System.out.println("Eligible to vote");
    }
    public static void main(String args[]){
        try{
            Cage(27);
        }catch (AgeException e){
            System.out.println(e);
        }
    }
}