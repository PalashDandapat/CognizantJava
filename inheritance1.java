class Animal{
    void makeSound(){
        System.out.println();
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Barks");
    }
}
class inheritance1{
    public static void main(String args[]){
        Animal d=new Dog();
        d.makeSound();
    }
}