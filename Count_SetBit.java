import java.util.*;
public class Count_SetBit {

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
        System.out.println("Enter N:");
        int n = sc.nextInt();
        System.out.println(count(n));
    }    
}
