import java.util.Scanner;

public class StudentGradeCal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int numSubjects = sc.nextInt();

        if(numSubjects <=0){
            System.out.println("please enter a valid number");
            return ;
        }
        int totalMarks =0;

        for(int i=1;i<=numSubjects;i++){
            System.out.print("Enter marks obtained in subjects"+ i +":");
            int marks=sc.nextInt();
            totalMarks+=marks;
        }
        int average=totalMarks/numSubjects;
        char grade;
        if(average>=90)
        {
            grade='O';
        }else if (average>=80 ) {
            grade='A';
            
        }
        else if (average>=70) {
            grade='B';
            
        }
        else if (average>=60) {
            grade='C';
            
        }else if(average>=50){
            grade='D';

        }
        else if(average>=40){
        grade='E';


         }
       else{
        grade='F';
       }
       System.out.println("totalMarks : "+ totalMarks);
        System.out.println("average : " + average);
        System.out.println("Grade is : " + grade);

        }
    }

    

