import java.util.*;
class StudentMarkList
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Student: ");
        int STUDENT=sc.nextInt();
        String name[]=new String[STUDENT];
        String rollno[]=new String[STUDENT];
        int m1[]=new int[STUDENT];
        int m2[]=new int[STUDENT];
        int m3[]=new int[STUDENT];
        int m4[]=new int[STUDENT];
        int m5[]=new int[STUDENT];
        int m6[]=new int[STUDENT];
        int t[]=new int[STUDENT];
        int avg[]=new int[STUDENT];
        System.out.println("Enter the Standard");
        int standard=sc.nextInt();
            
        if(standard==10)
        {
            for(int i=0;i<STUDENT;i++)
            {
                sc.nextLine();
                System.out.println((i+1)+" Student Detials");
                System.out.print("Name:");
                name[i]=sc.nextLine();
                System.out.print("Roll No:");
                rollno[i]=sc.nextLine();
                System.out.print("Mark1:");
                m1[i]=sc.nextInt();
                System.out.print("Mark2:");
                m2[i]=sc.nextInt();
                System.out.print("Mark3:");
                m3[i]=sc.nextInt();
                System.out.print("mark4:");
                m4[i]=sc.nextInt();
                System.out.print("Mark5:");
                m5[i]=sc.nextInt();
                    
                t[i]=m1[i]+m2[i]+m3[i]+m4[i]+m5[i];
                avg[i]=t[i]/5;
            }
        }
        else
        {
           for(int i=0;i<STUDENT;i++)
            {
                sc.nextLine();
                System.out.println((i+1)+" Student Detials");
                System.out.print("Name:");
                name[i]=sc.nextLine();
                System.out.print("Roll No:");
                rollno[i]=sc.nextLine();
                System.out.print("Mark1:");
                m1[i]=sc.nextInt();
                System.out.print("Mark2:");
                m2[i]=sc.nextInt();
                System.out.print("Mark3:");
                m3[i]=sc.nextInt();
                System.out.print("mark4:");
                m4[i]=sc.nextInt();
                System.out.print("Mark5:");
                m5[i]=sc.nextInt();
                System.out.print("Mark6:");
                m6[i]=sc.nextInt();
                    
                t[i]=m1[i]+m2[i]+m3[i]+m4[i]+m5[i]+m6[i];
                avg[i]=t[i]/6;
            } 
        }
        System.out.println("\nName"+"\t"+"Roll No"+"\t"+"Total"+"\t"+"Average"+"\t");
        for(int i=0;i<STUDENT;i++)
        {
            System.out.println(name[i]+"\t"+rollno[i]+"\t"+t[i]+"\t"+avg[i]+"\t");
        }
        int max=0;
        for(int i=0;i<avg.length;i++)
        {
            if(avg[i]>avg[max])
            max=i;
        }
        System.out.println("Highest Mark");
        System.out.println("Name:"+name[max]+"\nRoll No:"+rollno[max]+"\nTotal:"+t[max]+"\nAverage:"+avg[max]);   
    }
}
