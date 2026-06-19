import java.util.*;
class Car{
    String make;
    String model;
    int year;
    Car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    void display(){
        System.out.println(make+" "+model+" "+year);

    }
}

class class_car{
    public static void main(String args[]){
        Car c;
        c=new Car("Suzuki","Etriga",2016);
        c.display();
    }
}