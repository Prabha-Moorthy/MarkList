import java.util.*;
public class MainMark
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the standard 10 or 12");
        int standard=input.nextInt();
        
		String tenthSubjects[] = {"Tamil", "English", "Maths", "Science", "Social-science"};
		String twelthSubjects[] = {"Tamil", "English", "Maths", "Chemistry", "Physics","Biology"};
				
		int[] marks ;
		int totalmarks;
				
		if(standard == 10)
		{
			marks = new int[5];
			totalmarks = 500;
			for(int i = 0; i < 5; i++)
			{
				System.out.print("Enter the "+tenthSubjects [i] + " mark ");
				marks[i] = input.nextInt();
			}
						
			Student Student1=new Student(marks,tenthSubjects,totalmarks);
		}
		else
		{
			marks = new int[6];
			totalmarks = 1200;
			for(int i = 0; i < 6; i++)
			{
				System.out.print("Enter the "+twelthSubjects [i] + " mark ");
				marks[i] = input.nextInt();
			}
			Student Student2=new Student(marks,twelthSubjects,totalmarks);
		}
	}
}
