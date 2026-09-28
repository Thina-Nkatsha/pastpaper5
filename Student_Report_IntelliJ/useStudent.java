import java.util.Scanner;

public class useStudent
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student number: ");
        String studentNumber = input.nextLine();

        System.out.print("Enter test result: ");
        double testResult = input.nextDouble();

        System.out.print("Enter assignment result: ");
        double assignmentResult = input.nextDouble();

        System.out.print("Enter exam result: ");
        double examResult = input.nextDouble();

        Student_Report student = new Student_Report(
                studentNumber,
                testResult,
                assignmentResult,
                examResult
        );

        student.print_report();
    }
}
