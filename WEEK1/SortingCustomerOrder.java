import java.util.*;
class Order{
    int orderId;
    String customerName;
    int totalPrice;
}

public class SortingCustomerOrder{
    public static void add(ArrayList<Order> orderlist){
        Order o1=new Order();
        o1.orderId=1000;
        o1.customerName="Rahul";
        o1.totalPrice=6890;
        orderlist.add(o1);
        o1=new Order();
        o1.orderId=2000;
        o1.customerName="Parul";
        o1.totalPrice=8000;
        orderlist.add(o1);
        o1=new Order();
        o1.orderId=3000;
        o1.customerName="Takul";
        o1.totalPrice=3990;
        orderlist.add(o1);
        o1=new Order();
        o1.orderId=4000;
        o1.customerName="Sohan";
        o1.totalPrice=2990;
        orderlist.add(o1);
    }
    static int times=0;
    public static void bubblesort(ArrayList<Order> orderlist){
        
        for(int i=0;i<orderlist.size();i++){
            for(int j=1;j<orderlist.size()-i;j++){
                times++;
                if(orderlist.get(j).totalPrice>orderlist.get(j-1).totalPrice){
                    Order temp=orderlist.get(j);
                    orderlist.set(j,orderlist.get(j-1));
                    orderlist.set(j-1,temp);
                }
            }
        }
        System.out.println("Time took to BubbleSort: "+times);
    }
    public static void print(ArrayList<Order> orderlist){
        for(Order o:orderlist){
            System.out.println("Coustmer Name: "+o.customerName+" Order Id: "+o.orderId+" Order Cost: "+ o.totalPrice);
        }
    }
    public static int partition(ArrayList<Order> orderlist,int low,int high){
        int pivot=orderlist.get(high).totalPrice;
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(orderlist.get(j).totalPrice<pivot){
                i++;
                Order temp=orderlist.get(j);
                orderlist.set(j,orderlist.get(i));
                orderlist.set(i,temp);
                
            }
        }
        Order temp=orderlist.get(high);
                orderlist.set(high,orderlist.get(i+1));
                orderlist.set(i+1,temp);
                return i+1;

    }
    static int reccall=0;
    public static void quicksort(ArrayList<Order> orderlist,int low,int high){
       reccall++;
        if(low<high){
            int pi=partition(orderlist,low,high);
            quicksort(orderlist, low, pi-1);
            quicksort(orderlist, pi+1, high);

        }
    }
    public static void main(String args[]){
        ArrayList<Order> orderlist=new ArrayList<>();
        add(orderlist);
        bubblesort(orderlist);
        print(orderlist);
        System.out.println("");
        orderlist=new ArrayList<>();
        add(orderlist);
        quicksort(orderlist,0,orderlist.size()-1);
        print(orderlist);
        System.out.println("Time taken by Quicksort: "+reccall);
        System.out.println("Time taken by Bubblesort: "+times);
        if(times<reccall){
            System.out.println("Bubble sort is better");
        }else{
            System.out.println(" Quick sort is better");
        }
    }
}