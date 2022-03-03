import java.util.Random;
import  java.util.Scanner;

public class EmployeeData {
    public static void main (String[] args){
        Random random =new Random();
        Scanner sc = new Scanner(System.in);

        int K= random.nextInt()%2;
        if(K==0){
            System.out.println("Employee Is Present");
            Random v =new Random();
            int n=v.nextInt()%2;
            if(n==0)
            {
                int Wages=100;
                System.out.println("Salary="+Wages);

            }
            else{
                int Wages=40;
                System.out.println("Salary="+Wages);
            }

        }
        else{
            System.out.println("Employee is Absent");
        }
    }
}

