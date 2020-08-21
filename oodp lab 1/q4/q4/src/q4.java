import java.util.*;

public class q4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int height = 0;

        System.out.println("Enter height: ");
        height = sc.nextInt();

        if(height<=0){
            System.out.println("Error input!!");
        }

        printPattern(height);
    }

    public static void printPattern(int height){
        int i;
        int j;

        for(i=1;i<=height;i++){
            
            for(j=i;j>0;j--){

                if(j%2 == 0){
                    System.out.print("BB");

                }
                else{
                    System.out.print("AA");
                }
         }
        
        System.out.println();   
        }
    }
}

