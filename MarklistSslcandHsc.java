import java.util.*;
public class MarklistSslcandHsc
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
	    System.out.println("Enter the standard 10 or 12");
		int standard = input.nextInt();
				
		String[] tenthSubjects = {"Tamil", "English", "Maths", "Science", "Social-science"};
		String[] twelthSubjects = {"Tamil", "English", "Maths", "Chemistry", "Physics","Biology"};
				
		float[] marks ;
		int totalmarks;
				
		if(standard == 10)
		{
			marks = new float[5];
			totalmarks = 500;
			for(int i = 0; i < 5; i++)
			{
				System.out.print("Enter the "+tenthSubjects [i] + " mark ");
				marks[i] = input.nextFloat();
			}
						
			System.out.println("Total Mark : " +findTotalmark(marks));
			System.out.println("Average Mark : "+findAverage(marks,totalmarks));
			markSort(marks,tenthSubjects);
			failCount(standard,marks,tenthSubjects);
		}
		else
		{
			marks = new float[6];
			totalmarks = 1200;
			for(int i = 0; i < 6; i++)
			{
				System.out.print("Enter the "+twelthSubjects [i] + " mark ");
				marks[i] = input.nextFloat();
			}
			System.out.println("Total Mark : " +findTotalmark(marks));
			System.out.println("Average Mark : "+findAverage(marks,totalmarks));
			markSort(marks,twelthSubjects);
			failCount(standard,marks,twelthSubjects);
		}
	}
	static float findTotalmark(float[] marks)
	{
		float total = 0.0f;
		for(int i = 0; i < marks.length; i++)
		{
			total += marks[i];
		}
				return total;
	}
	static float findAverage(float[] marks,int totalMark)
	{
		float average = (findTotalmark(marks) * 100) / totalMark;
		return average;
	}
	static void failCount(int standard,float[] marks, String[] subjects)
	{
		int failCount = 0;
		boolean[] isFail = new boolean[subjects.length];
		if(standard==10)
		{
		    for(int i = 0; i < marks.length; i++)
		    {
			    if(marks[i] < 35)
			    {
				    failCount++;
				    isFail[i] = true;
			    }
		    }
		}
		else
		{
		    for(int i=0;i<marks.length;i++)
		    {
		        if(marks[i]<70)
		        {
		            failCount++;
		            isFail[i]=true;
		        }
		    }
	   	}
		System.out.println("Total fails : "+failCount);
				
		for(int i = 0; i < isFail.length; i++)
		{
		    if(isFail[i] == true)
		    {
				System.out.println(subjects[i] + " : Fail ");
		    }
		}
	}
	static void markSort(float[] marks, String[] subjects)
	{
	    sort(marks,subjects);
		for(int i = 0; i < marks.length; i++)
		{
			System.out.println("The "+(i + 1)+" highest mark : "+marks[i] + " : "+subjects[i]);
		}
	}
	static void sort(float[] arr,String[] str)
	{
    		for(int i = 0; i < arr.length; i++)
    		{
	        	for(int j = 1; j < arr.length; j++)
	        	{
	            		if(arr[j] > arr[j - 1])
	           	 	{
	                		float temp = arr[j];
	                		arr[j] = arr[j - 1];
	                		arr[j - 1] = temp;
	                
	                		String str2 = str[j];
	                		str[j] = str[j - 1];
	               		 str[j - 1] = str2;
	           	 	}
	        	}
		}
	}
}
