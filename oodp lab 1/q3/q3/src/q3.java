import java.util.*;

public class q3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int again = 1;

        while(again == 1){
        System.out.println("Enter starting value: ");
        int start = sc.nextInt();
        System.out.println("Enter ending value: ");
        int end = sc.nextInt();
        System.out.println("Enter increment value: ");
        int incre = sc.nextInt();

        if(start >= end || incre < 0){
            System.out.println("Error input!!!");
            System.out.println("Try again.");
            continue;
        }
        
        forTable(start,end,incre);
        whileTable(start,end,incre);
        doWhileTable(start,end,incre);

        System.out.println("Again?(press 1 to repeat): ");
        again = sc.nextInt();
        }

    }

    public static void forTable(int start, int end, int incre){
        double rate = 1.82;
        double result;

        System.out.println("starting : " + start + ", ending : " + end + ", increment : " + incre);
        System.out.println("US$         s$");
        System.out.println("--------------");

        for(int i = start; i<=end;i+=incre){
            result = i * rate;

            System.out.println(i + "          " + result);
;

        }
    }

    public static void whileTable(int start, int end, int incre){
        double rate = 1.82;
        double result;
        int i = 0;

        System.out.println("starting : " + start + ", ending : " + end + ", increment : " + incre);
        System.out.println("US$         s$");
        System.out.println("--------------");

        while(start<=end){
            result = start * rate;

            System.out.println(start + "          " + result);

            start += incre;

        }

    }

    public static void doWhileTable(int start, int end, int incre){
        double rate = 1.82;
        double result;
        int i= 0;

        System.out.println("starting : " + start + ", ending : " + end + ", increment : " + incre);
        System.out.println("US$         s$");
        System.out.println("--------------");

        do{
            result = start * rate;

            System.out.println(start + "          " + result);

            start += incre;

        }while(start<=end);
    }
}
