import java.util.*;
public class Get_bit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N and Index to get its value");
        int n = sc.nextInt();
        int index = sc.nextInt();
        System.out.println((n&(1<<index))==0?"0":"1");
    }
}