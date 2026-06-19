class MyThread extends Thread{
    String msg;
    MyThread(String msg){
        this.msg=msg;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(msg+" "+i);
        }
    }
}
class t1{
    public static void main(String args[]){
        MyThread a1=new MyThread("Thread 1");
        MyThread a2=new MyThread("Thread 2");
        a1.start();
        a2.start();
    }
}