import java.util.*;


public class sixth {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = sc.nextInt();


        for(i=2; i<n; i++){
            if(n%i==0){
                System.out.println("non prime");
                break;

            }
        }
        if (i==n){
            System.out.println("prime");
            
        }




    }
    }


