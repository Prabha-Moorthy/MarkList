import java.util.*;
class StudentMark
{
    String name[];
    String rollno[];
    int mark[][];
    int std[];
    public StudentMark(){}
    public StudentMark(String name[],String rollno[],int mark[][],int std[])
    {
        this.name=name;
        this.rollno=rollno;
        this.mark=mark;
        this.std=std;
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Student: ");
        int Student=sc.nextInt();
        String name[]=new String[Student];
        String rollno[]=new String[Student];
        int mark[][]=new int[Student][];
        float avg[]=new float[Student];
        int std[]=new int[Student];
        int subjects;
        int index=0;
        StudentMark s=new StudentMark(name,rollno,mark,std);
        for(int i=0;i<Student;i++)
        {
            sc.nextLine();
            System.out.println((i+1)+" Student Detials");
            System.out.print("Name:");
            name[i]=sc.nextLine();
            System.out.print("Roll No:");
            rollno[i]=sc.nextLine();
            System.out.print("standard:");
            std[i]=sc.nextInt();
            subjects=(std[i]==10?5:6);
            System.out.println("Enter the marks");
            mark[i]=new int[subjects];
            for(int j=0;j<subjects;j++)
            {
                mark[i][j]=sc.nextInt();
            }
            int total=s.calculateTotal(mark[i]);
            System.out.println("Total:"+total);
            avg[index++]=s.averageCalculation(total,subjects,std[i]);
            System.out.println("Average:"+avg[i]);
            String FailedSubjects=s.findFailedSubjects(mark[i],std[i]);                
            System.out.println(FailedSubjects);
        }
        s.highestMark(avg,name,rollno);
    }
    public static void main(String args[])
    {
        StudentMark s=new StudentMark();
        s.main();
    }
      
    public int calculateTotal(int mark[])       
    {
        int total=0;
        for(int i=0;i<mark.length;i++)
        {
            total=total+mark[i];
        }
        return total;
    }
    public float averageCalculation(int total,int subjects,int std)
    {
        if(std==10)
        {
            return total/subjects;
        }
        else
        {
            return (total*100)/1200;
        }
    }
    public float highestMark(float avg[],String name[],String rollno[])
    {
        int max=0;
        for(int i=1;i<avg.length;i++)
        {
            if(avg[i]>avg[max])
            {
                max=i;
            }
        }
        System.out.println("...!!HighestMark!!...");
        System.out.println("Name: "+name[max]+" "+"Roll no: "+name[max]);
        return 0;
    }
    public String findFailedSubjects(int mark[],int std)
    {
        int failCount=0;
        if(std==10)
        {
            for(int i=0;i<mark.length;i++)
            {
                if(mark[i]<35)
                {
                    failCount++;
                    switch(i)
                    {
                        case 0:
                            System.out.println("Failed in Tamil");
                            break;
                        case 1:
                            System.out.println("Failed in English");
                            break;
                        case 2:
                            System.out.println("Failed in Maths");
                            break;
                        case 3:
                            System.out.println("Failed in Science");
                            break;
                        case 4:
                            System.out.println("Failed in Scocial");
                            break;
                    }
                }
            }
            System.out.println("Number of Failed subjects: "+failCount);
            return "";
        }
        else
        {
            for(int i=0;i<mark.length;i++)
            {
                if(mark[i]<70)
                {
                    failCount++;
                    switch(i)
                    {
                        case 0:
                            System.out.println("Failed in Tamil");
                            break;
                        case 1:
                            System.out.println("Failed in English");
                            break;
                        case 2:
                            System.out.println("Failed in Maths");
                            break;
                        case 3:
                            System.out.println("Failed in Physis");
                            break;
                        case 4:
                            System.out.println("Failed in Chemistry");
                            break;
                        case 5:
                            System.out.println("Failed in Computer Science");
                            break;
                    }
                }
            }
            System.out.println("Number of Failed subjects: "+failCount);
            return "";   
        }
    }
}
