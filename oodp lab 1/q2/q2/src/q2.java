import java.util.*;

public class q2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int again = 1;

        while(again == 1){

            System.out.println("Enter employee salary:");
            int salary = sc.nextInt();
            System.out.println("Enter employee merit: ");
            int merit = sc.nextInt();

            System.out.println("Employee grade is:" + grade(salary,merit));
            System.out.println("Next employee?: ");
            System.out.println("Press 1 for yes.");   
            again = sc.nextInt();

        }
     
    }

        public static char grade(int salary, int merit){
            
            if(salary >= 600 && salary <= 649){
                if(merit < 10){
                    return 'C';
                }
                else{
                    return 'B';
                }
            }

            else if(salary >= 700 && salary <= 799){
                if(merit < 20){
                    return 'B';
                }
                else{
                    return 'A';
                }

            }
            else if(salary >= 800){
                return 'A';
            }
            else{
                return 'C';
            }

        }
    }

