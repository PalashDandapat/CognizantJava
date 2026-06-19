import java.util.*;
class dynamicArray{
    public static void main(String args[]){
        List<String> al=new ArrayList();
        Scanner sc=new Scanner(System.in);
        String str;
        while(true){
            System.out.println("Enter name : ");
            str=sc.nextLine();
            al.add(str);
            System.out.println("Enter Yes if you want to add Another name: ");
            str=sc.nextLine();
            if(str.equalsIgnoreCase("yes")){
                continue;
            }else{
                break;
            }
        }
        System.out.println(al);
    }
}