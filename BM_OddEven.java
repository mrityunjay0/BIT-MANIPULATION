import java.util.*;
public class BM_OddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER N:");
        int n = sc.nextInt();
        System.out.println((n&1)==0?"even":"odd");
    }
}
