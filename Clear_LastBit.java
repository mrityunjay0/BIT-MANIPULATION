import java.util.*;
public class Clear_LastBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        System.out.println((n&(n-1)));
    }
}