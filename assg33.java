
import java.util.*;



public class assg33 {
    private double sales;
    // constructor

    public assg33(double sales){
        if(sales<0){
            throw new Illegalargumentexception("sales cannot be negative");

        }
        this.sales= sales;

    }

    //method to calculate commisions 
    public double commision(){
        return sales = 0.10; // assuming a 10% commision rate
    }
}
public class commisiondemo{

    public static void main ( String[]args){

        scanner sc= new scanner(system.in);
        System.out.println("enter the sales amount ");
        double sales= scanner.nextdouble();
        try{

            commision commisionObj= new commision(sales);
            double commision= commisionObj.commision();
            System.out.println("the commision is:"+commision);
        }
        catch (Illegalargumentexception e){
            System.out.println("sales cannot be negative");
        }

        scanner.close();

    }
}


    
