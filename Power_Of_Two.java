import java.util.*;
public class Power_Of_Two {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N for checking if it is power of two:");
        int n = sc.nextInt();
        System.out.println((n&(n-1))==0?"Yes":"No");
    }    
}
