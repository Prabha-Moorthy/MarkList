import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numSubjects = sc.nextInt();

        int[] marks = new int[numSubjects];
        System.out.println("Enter the marks for each subject:");

        for (int i = 0; i < numSubjects; i++) 
        {
            marks[i] = sc.nextInt();
        }

        MarkCalculation markCalculation = new MarkCalculation(marks);
        markCalculation.calculateMarks();
        markCalculation.highestMark();
    }
}
