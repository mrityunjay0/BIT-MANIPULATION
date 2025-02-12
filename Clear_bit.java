import java.util.*;
public class Clear_bit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N and Index to clear it to 0:");
        int n = sc.nextInt();
        int index = sc.nextInt();   //indexing from 0;
        int bitmask = ~(1<<index);
        System.out.println((n&bitmask));
    }
}
