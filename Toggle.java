import java.util.*;
public class Toggle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N and index to toggle it:");
        int n = sc.nextInt();
        int index = sc.nextInt();
        System.out.println((n^(1<<index)));
    }
}