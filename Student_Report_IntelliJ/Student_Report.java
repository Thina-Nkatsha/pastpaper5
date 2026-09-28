public class Student_Report extends Student
{
    // Constructor
    public Student_Report(String studentNumber, double testResult, double assignmentResult, double examResult)
    {
        super(studentNumber, testResult, assignmentResult, examResult);
    }

    // Print the student report
    @Override
    public void print_report()
    {
        double testWeight = getTestResult() * 0.25;
        double assignmentWeight = getAssignmentResult() * 0.25;
        double examWeight = getExamResult() * 0.50;

        double finalResult = testWeight + assignmentWeight + examWeight;

        System.out.println();
        System.out.println("STUDENT REPORT");
        System.out.println("*****************************");
        System.out.println("STUDENT NUMBER: " + getStudentNumber());
        System.out.println("TEST RESULT: " + getTestResult() + "%");
        System.out.println("TEST WEIGHTING (25%): " + String.format("%.2f", testWeight) + "%");
        System.out.println("ASSIGNMENT RESULT: " + getAssignmentResult() + "%");
        System.out.println("ASSIGNMENT WEIGHTING (25%): " + String.format("%.2f", assignmentWeight) + "%");
        System.out.println("EXAM RESULT: " + getExamResult() + "%");
        System.out.println("EXAM WEIGHTING (50%): " + String.format("%.2f", examWeight) + "%");
        System.out.println("FINAL RESULT: " + String.format("%.2f", finalResult) + "%");
        System.out.println("*****************************");
    }
}
