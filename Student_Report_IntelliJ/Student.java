public abstract class Student implements iReport
{
    // Variables to store student assessment results
    protected String studentNumber;
    protected double testResult;
    protected double assignmentResult;
    protected double examResult;

    // Constructor
    public Student(String studentNumber, double testResult, double assignmentResult, double examResult)
    {
        this.studentNumber = studentNumber;
        this.testResult = testResult;
        this.assignmentResult = assignmentResult;
        this.examResult = examResult;
    }

    // Get student number
    public String getStudentNumber()
    {
        return studentNumber;
    }

    // Get test result
    public double getTestResult()
    {
        return testResult;
    }

    // Get assignment result
    public double getAssignmentResult()
    {
        return assignmentResult;
    }

    // Get exam result
    public double getExamResult()
    {
        return examResult;
    }
}
