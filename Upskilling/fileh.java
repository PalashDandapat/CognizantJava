import java.io.*;
import java.util.*;
class fileh{
    public static void main(String args[]){
        try{
            FileWriter w=new FileWriter("output.txt");
            System.out.println("Enter aString: ");
            Scanner sc=new Scanner(System.in);
            String c=sc.nextLine();
            w.write(c);
            w.close();

    }
    catch (Exception e){
        System.out.println(e);
    }
    }
}