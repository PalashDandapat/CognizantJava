import java.util.*;
class l1{
    public static void main(String args[]){
        List<String> l=new ArrayList<>();

        l.add("palash");
        l.add("chandan");
        l.add("transformer");
        Collections.sort(l,(a,b)->a.compareTo(b));
        System.out.println(l);
    }
}