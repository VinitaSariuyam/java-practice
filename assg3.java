
import java.util.*;



public class assg3 {

    public static void main(String[]args){

        Scanner Sc = new Scanner(System.in);

        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();


        if(a>b){
            if(a>c) {
                System.out.println(a);
            }
        }else if (b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }




    }
    
}
