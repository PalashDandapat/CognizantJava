class Logger{
    private static Logger logger;
    private Logger(){
        
    }
    public static Logger getInstance(){
        if(logger==null){
            logger=new Logger();
        }
        return logger;

    }
}
public class SingletonPatternExample{
    public static void main(String[] args) {
        Logger l1=Logger.getInstance();
        Logger l2=Logger.getInstance();
        if(l1==l2){
            System.out.println("SAME INSTANCE");

        }else{
            System.out.println("Different Instance");
        }
    }
}