import java.util.Scanner;

public class StudentGradeCalculater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sub : ");
        int numOfSub = sc.nextInt();

        if(numOfSub<=0){
            System.out.println("Enter a valid number of subjects");
            return;
        }
        int totalMarks = 0;
        int maxMarksPerSub = 100;

        for(int i=1;i<=numOfSub;i++)
        {
            System.out.println("Enter marks obtained in sub " +i+ " (out of 100 : )");
            int marks = sc.nextInt();

            if(marks<0 || marks>maxMarksPerSub){
                System.out.println("Marks should be in between 0 to 100 : ");
                i--;
            }
            else {
                totalMarks+=marks;
            }
        }

        double avgPercentage = (double) totalMarks /(numOfSub*maxMarksPerSub)*100;
        System.out.println("Total Marks : " +totalMarks);
        System.out.println("Average Percentage :" +avgPercentage+ "%");

        String grade ;

        if (avgPercentage>= 90){
            grade = "A+";
        } else if (avgPercentage>= 70){
            grade = "B";

        } else if (avgPercentage>=60) {
            grade = "C";

        }
        else {
            grade = "Fail";
        }
        System.out.println("Grade :" + grade);
    }
}
