import java.util.*;
public class factorial {
   public void factorial(int n){
        int fact = 1;
        for(int i = 1; i <=n; i++){
            fact = fact * i;
        }
        System.out.println("value is :" + n + " factorial is : " + fact);
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        factorial obj = new factorial();
        System.out.print("Enter the value of n :");
        int n = sc.nextInt();
        
        if( n > 4){
            obj.factorial(n);
        }
        else{
            System.out.println("pls enter grether then value .Try again");
        }
        
     }
    }