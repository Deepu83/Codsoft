import java.util.*;
public class student {
    public static void main(String[] argu){
        Scanner sr=new Scanner(System.in);
        System.out.println("Enter number of subjects  marks(out of 100)");
        int n=sr.nextInt();
        int marks[]=new int[n];
        for(int i=0;  i<n; i++){
            System.out.print("Enter each subject marks of student "+ (i+1)+" ");
            marks[i]=sr.nextInt();

        }
        //calculate total marks of subject
        int sum=0;
        for(int j:marks){
            sum+=j;
        }
        double averagePercentage = (double) sum / n;

        // Grade Calculation based on percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Total Marks: " + sum); //total marks
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

    }

}
