import java.util.*;
public class Student
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of 10th subjects");
        int subject=sc.nextInt();
        int mark[]=new int[subject];
        System.out.println("Enter the marks");
        for(int i=0;i<mark.length;i++)
        {
            mark[i]=sc.nextInt();
        }
        System.out.println("Enter the Number of 12th subjects");
        int subjects=sc.nextInt();
        int marks[]=new int[subjects];
        System.out.println("Enter the Marks:");
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=sc.nextInt();
        }
        Student s=new Student();
            s.calculateMark(mark,subject);
            s.calculateHscMark(marks,subjects);
    }
        int total=0,failCount=0;
        for(int i=0;i<mark.length;i++)
        {
            total=total+mark[i];
        }
        int average=total/mark.length;
        System.out.println("The total is: "+total);
        System.out.println("The average is: "+average);
        public String calculateMark(int mark[],int subject)
        {
        int max=mark[0];
        for(int i=0;i<mark.length;i++)
        {
            if(mark[i]>max)
            {
                max=mark[i];
            }
            if(mark[i]<35)
            {
                failCount++;
            }
        }
        System.out.println("The Maximum mark is: "+max);
        System.out.println("Number of subject failed: "+failCount);
        for(int i=0;i<mark.length;i++)
        {
            if(mark[i]<35)
            {
                failCount++;
                switch(i)
                {
                    case 0:
                    System.out.println("Failed in Tamil: "+mark[i]);
                    break;
                    case 1:
                    System.out.println("Failed in English: "+mark[i]);
                    break;
                    case 2:
                    System.out.println("Failed in Maths: "+mark[i]);
                    break;
                    case 3:
                    System.out.println("Failed in Science: "+mark[i]);
                    break;
                    case 4:
                    System.out.println("Failed in Social: "+mark[i]);
                    break;
                }
            }
        }
        return " ";
    }
    public String calculateHscMark(int marks[],int subjects)
    {
        int total=0,failCount=0;
        for(int i=0;i<marks.length;i++)
        {
            total=total+marks[i];
        }
        int average=((total*100)/1200);
        System.out.println("The total is: "+total);
        System.out.println("The average is: "+average);
        int max=marks[0];
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]>max)
            {
                max=marks[i];
            }
            if(marks[i]<70)
            {
                failCount++;
            }
        }
        System.out.println("The Maximum mark is: "+max);
        System.out.println("Number of subject failed: "+failCount);
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<70)
            {
                failCount++;
                switch(i)
                {
                    case 0:
                    System.out.println("Failed in Tamil: "+marks[i]);
                    break;
                    case 1:
                    System.out.println("Failed in English: "+marks[i]);
                    break;
                    case 2:
                    System.out.println("Failed in Maths: "+marks[i]);
                    break;
                    case 3:
                    System.out.println("Failed in Chemistry: "+marks[i]);
                    break;
                    case 4:
                    System.out.println("Failed in Pysics: "+marks[i]);
                    break;
                    case 5:
                    System.out.println("Failed in Computer SCience: "+marks[i]);
                    break;
                }
            }
        }
        return " ";
    }
}
