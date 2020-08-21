import java.util.*;

public class q1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a letter from A to D: ");
        
        char user = sc.next().charAt(0);

        switch(user) {
            case 'a' :
            case 'A' : 
                System.out.println("Action movie fan");
                break;
            case 'c' :
            case 'C' :
                System.out.println("Comedy movie fan");
                break;
            case 'd' :
            case 'D' :
                System.out.println("Drama movie fan");
                break;
            default :
                System.out.println("Invalid choice");
                

        }



       
    }
}
