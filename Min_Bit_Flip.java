import java.util.*;
public class Min_Bit_Flip {

    public static int count(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N and Target Number:");
        int n = sc.nextInt();
        int t = sc.nextInt();
        int res = n^t;
        System.out.println(count(res));
    }    
}
