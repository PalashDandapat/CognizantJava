import java.util.*;

class Product{
    private int productId;
    private String productName;
    private String category;
    public Product(int id,String productName,String c){
        productId=id;
        this.productName=productName;
        category=c;
    }
    public int getId(){
        return this.productId;
    }
    public String getName(){
        return this.productName;
    }
     public String getCat(){
        return this.category;
    }
}
class Ecommerce_Platform_search{
    public static void linearSearchById(ArrayList<Product> p,int id){
        
        for(Product p1:p){
            if(p1.getId()==id){
                System.out.println("Item Found");
                break;
            }
        }
    }
     public static void linearSearchByCategory(ArrayList<Product> p,String cate){
        
        for(Product p1:p){
            if(p1.getCat().equals(cate)){
                System.out.println(p1.getId()+ "  "+p1.getName()+" "+p1.getCat());
            }
        }
    }
    public static void linearSearchByProductName(ArrayList<Product> p,String pName){
        boolean f=false;
        for(Product p1:p){
            if(p1.getName().equals(pName)){
                f=true;
                System.out.println("\n Product Found \n"+p1.getId()+ "  "+p1.getName()+" "+p1.getCat());
            }
        }
        if(!f){
            System.out.println("No Product Found");
        }
    }
    public static void BinarySearchById(ArrayList<Product> p,int id){
        
        int min=0;
        int max=p.size()-1;
       
        while(min<=max){
             int mid=(min+max)/2;
            if(p.get(mid).getId()==id){
                System.out.println("FOUND PRODUCT");
                return;
            }else if(p.get(mid).getId()>id){
                max=mid-1;
            }else{
                min=mid+1;
            }

        }
        System.out.println("No Product");

    }
     public static void BinarySearchByCategory(ArrayList<Product> p,String str){
        
        int min=0;
        int max=p.size()-1;
       
        while(min<=max){
             int mid=(min+max)/2;
            if(p.get(mid).getCat().equals(str)){
                System.out.println("FOUND PRODUCT "+p.get(mid).getName());
                for(int i=mid-1;i>=0;i--){
                    if(p.get(i).getCat().equals(str)){
                System.out.println("FOUND PRODUCT "+ p.get(i).getName());}
                }
                 for(int i=mid+1;i<p.size();i++){
                    if(p.get(i).getCat().equals(str)){
                System.out.println("FOUND PRODUCT "+ p.get(i).getName());}
                }
                return;
            }else if((p.get(mid).getCat().compareTo(str))<0){
                min=mid+1;
            }else{
                max=mid-1;
            }

        }
        System.out.println("No Product");

    }
     public static void BinarySearchByName(ArrayList<Product> p,String str){
        
        int min=0;
        int max=p.size()-1;
       
        while(min<=max){
            int mid=(min+max)/2;
            if(p.get(mid).getName().equalsIgnoreCase(str)){
                System.out.println("FOUND PRODUCT "+p.get(mid).getName());
                
                return;
            }
            else if((p.get(mid).getName().compareTo(str))<0){
                min=mid+1;
            }else{
                max=mid-1;
            }

        }
        System.out.println("No Product");

    }
    public static void main(String args[]){
        ArrayList<Product> product=new ArrayList<>();
        Product p1=new Product(100,"Chips","Snacks");
        product.add(p1);
        p1=new Product(101,"Popcorn","Snacks");
        
        product.add(p1);
        p1=new Product(102,"Kurkure","Snacks");
        product.add(p1);
        p1=new Product(103,"ThumbsUp","Drinks");
        product.add(p1);
        p1=new Product(104,"Sprite","Drinks");
        product.add(p1);
        p1=new Product(105,"Maaza","Drinks");
        product.add(p1);
        linearSearchById(product,103);
        linearSearchByCategory(product,"Drinks");
        linearSearchByProductName(product,"ThumbsUp");

        //bysorting and then
        //BY ID
         System.out.println("\n BinarySearchByID");
       Collections.sort(product, (a, b) -> Integer.compare(a.getId(), b.getId()));
       BinarySearchById(product,108);
        //category
        System.out.println("\n BinarySearchByCategory");
       Collections.sort(product, (a, b) -> a.getCat().compareTo(b.getCat()));
       BinarySearchByCategory(product,"Drinks");
        //Product Name
          System.out.println("\n BinarySearchByName");
       Collections.sort(product, (a, b) ->  a.getName().compareTo(b.getName()));

       BinarySearchByName(product,"Chips");
       
    }
}