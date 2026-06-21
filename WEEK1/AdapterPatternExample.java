import java.util.*;
interface PaymentProcessor{
    void processPayment();
}
class paypal{
    public void doPayment(){
        System.out.println("Paypal payment Success");
    }
}
class razorpay{
    public void doPayment(){
        System.out.println("Razorpay payment Success");
    }
}
class paypalAdapater implements PaymentProcessor{
    private paypal obj=new paypal();
    @Override
            public void processPayment(){
            obj.doPayment();
            }
}

class razorpayAdapater implements PaymentProcessor{
    private razorpay obj=new razorpay();
    @Override
            public void processPayment(){
            obj.doPayment();
            }
}

public class AdapterPatternExample {
    static void PAYMENT(PaymentProcessor obj){
        obj.processPayment();
    }
    public static void main(String[] args) {
        //rzor
        razorpayAdapater r1=new razorpayAdapater();
        PAYMENT(r1);
        paypalAdapater p1=new paypalAdapater();
        PAYMENT(p1);

    }
    
}
