import java.util.*;
public class Set_bit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N and Index to set it to 1:");
        int n = sc.nextInt();
        int index = sc.nextInt();   // Indexing from 0;
        System.out.println((n|(1<<index)));
    }
}