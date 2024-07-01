import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EXERCISE_1 {
    public static void main(String[] args) {
        System.out.println("Enter your marks in respective subjects : ");

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Maths: ");
        float a = sc.nextFloat();

        System.out.println("2. English: ");
        float b = sc.nextFloat();

        System.out.println("3. Hindi: ");
        float c = sc.nextFloat();

        System.out.println("4. Physics: ");
        float d = sc.nextFloat();

        System.out.println("5. Chemistry: ");
        float e = sc.nextFloat();

        System.out.println("Enter maximum marks in one subject : ");
        float max = sc.nextFloat();

        float sum = a+b+c+d+e;
        float total= max+max+max+max+max;
        int t = 100 ;
        float percent = (sum/total)*t;

        System.out.println("FINAL PERCENTAGE IS : "+ percent);
        System.out.println("Thank You for calculating percentage !!");
    }
}
