import java.util.*;

public class Practice_1 {
    public static void main(String[] args){
        //1. Program to sum1 3 numbers

        /*float a = 45;
        float b = 46;
        float c = 49;

        float sum1 = a+b+c;

        System.out.println("SUM OF 3 NUMBERS 45 , 46 , 49 IS : ");
        System.out.println(sum1);*/

        //2. PROGRAM TO CALCULATE CGPA OF THREE SUBJECTS USING MARKS (OUT OF 100)

        /*Scanner sc2 = new Scanner(System.in);

        int grade = 0;

        int grade_sum = 0;

        for (int i =0; i <3 ; i++) {

            int j=i+1;
            System.out.println("Print marks in subject " + j + " : ");
            int marks = sc2.nextInt();

            switch (marks/10){//divided by 10 so that case 10 handles 100 marks ; case 9 handles 90 to 99 ; 8 handles 80 to 89 so on
                case 10 :
                    grade=10;
                    break;
                case 9 :
                    grade=10;
                    break;
                case 8 :
                    grade=9;
                    break;
                case 7 :
                    grade=8;
                    break;
                case 6 :
                    grade=7;
                    break;
                case 5 :
                    grade=6;
                    break;
                case 4 :
                    grade=5;
                    break;
                default:
                    grade=0;
            }

        System.out.println("Your grade in this subject : " + grade);
        grade_sum = grade_sum + grade ;

        }

    //System.out.println(grade_sum);
    int cgpa = grade_sum/3;
    System.out.println(" CONGRATULATIONS !! YOUR CGPA IS : " + cgpa);
    System.out.println("THANK YOU FOR CALCULATING YOUR CGPA !!");*/

   //3. TO CHECK IF A ENTERED NO BY USER IS INTEGER OR NOT
    Scanner sc3 = new Scanner(System.in);

        System.out.println("ENTER SOME NUMBER TO CHECK IF IT IS INTEGER OR NOT : ");

        if  (sc3.hasNextInt()) {
            int no = sc3.nextInt();
            System.out.println( no + " IS AN INTEGER !!");
        }
        else {
            System.out.println("ENTERED VALUE IS NOT AN INTEGER");
        }
    }
}
