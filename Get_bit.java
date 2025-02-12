import java.util.*;
public class Get_bit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N and Index to get its value");
        int n = sc.nextInt();
        int index = sc.nextInt();
        int bitmask = 1<<index;
        System.out.println((n&bitmask)==0?"0":"1");
    }
}