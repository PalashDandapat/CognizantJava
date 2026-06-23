import java.util.*;

public class FinancialForecaster {
    static double sum(ArrayList<Integer> captialsList){
        if(captialsList.size()==1){
            return 0;
        }else{
            double r=(captialsList.get(1)-captialsList.get(0))/(double)captialsList.get(0);
            captialsList.remove(0);
            return r+sum(captialsList);
        }
    }
    public static void main(String args[]){
        
        ArrayList<Integer> captialsList=new ArrayList<>(Arrays.asList(11000,11780,13700,15000,17100));
        
        int s=captialsList.size();
        int last=captialsList.get(s-1);
        double avgROR=0.0;
        double sum1=sum(captialsList);
        avgROR=(sum1/s);
        System.out.println("Prediction Captial : "+Math.ceil(last*(1.0+avgROR))+" Intrest: "+Math.ceil(last*avgROR));

    }
}

