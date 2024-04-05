class MarkCalculation 
{
    int[] marks;
    int Subjects;

    // Constructor to initialize marks and number of subjects
    public MarkCalculation(int[] marks) 
    {
        this.marks = marks;
        this.Subjects = marks.length;
    }

    // Method to calculate and display various statistics
    public void calculateMarks() 
    {
        int total = 0;
        int failCount = 0;
        int max = marks[0];

        for (int mark : marks) 
        {
            total += mark;
            if (mark < 35) 
            {
                failCount++;
            }
            if (mark > max) 
            {
                max = mark;
            }
        }

        int average = total / Subjects;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Maximum Mark: " + max);
        System.out.println("Number of Subjects Failed: " + failCount);
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<35)
            {
                failCount++;
                switch(i)
                {
                    case 0:
                    System.out.println("Failed in Tamil ");
                    break;
                    case 1:
                    System.out.println("Failed in English ");
                    break;
                    case 2:
                    System.out.println("Failed in Maths ");
                    break;
                    case 3:
                    System.out.println("Failed in Science ");
                    break;
                    case 4:
                    System.out.println("Failed in Social ");
                    break;
                }
            }
        }
    }
    public void highestMark()
    {
        int maxMark=marks[0];
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]>maxMark)
            {
                maxMark=marks[i];
            }
        }
        for(int i=0;i<marks.length;i++)
        {
            if(maxMark==marks[i])
            {
                switch(i)
                {
                    case 0:
                    System.out.println("Highest mark in Tamil: "+maxMark);
                    break;
                    case 1:
                    System.out.println("Highest mark in English: "+maxMark);
                    break;
                    case 2:
                    System.out.println("Highest mark in Maths: "+maxMark);
                    break;
                    case 3:
                    System.out.println("Highest mark in Science: "+maxMark);
                    break;
                    case 4:
                    System.out.println("Highest mark in Social: "+maxMark);
                    break;
                }
            }
        }
    }
}
