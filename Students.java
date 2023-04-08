import java.util.Scanner; // Importing the Scanner class to take input from the user
// Declaring a class named Students
public class Students { 
     // Declaring instance variables
    String USN; 
    String Name;
    String branch;
    int phone;
    
    // Method to insert student details into the object
    void insertRecord(String reg, String name, String brnch, int ph){ 
        USN=reg;
        Name=name;
        branch=brnch;
        phone=ph;
    }
     // Method to display the student details
    void displayRecord(){
        System.out.println("NAME OF STUDENTS: "+ Name);
        System.out.println("USN: " + USN);
        System.out.println("BRANCH: " +branch);
        System.out.println("PHONE NO: "+phone);
        
    }
    
    public static void main(String args[]){
        // Creating an array of objects of type Students
        Students s[]=new Students [100];
        // Creating an object of the Scanner class to take input from the user 
        Scanner sc=new Scanner(System.in); 
        // Asking the user to enter the number of students
        System.out.println("Enter the number of students"); 
         // Reading the number of students entered by the user
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            // Creating objects for each student
            s[i]=new Students();
        
        // Loop to read and insert the details of each student
        for(int j=0;j<n;j++){ 
            // Displaying the student number
            int no=j+1; 
            System.out.println("Enter the usn, name, branch, phone of " + no +" Student");
            String USN=sc.next();
            String Name=sc.next();
            String branch=sc.next();
            int phone=sc.nextInt();
            // Inserting the details of the student into the object
            s[j].insertRecord(USN,Name,branch,phone); 
        }
        
        // Loop to display the details of each student
        for(int m=0;m<n;m++){ 
            // Displaying the student number
            int no=m+1; 
            System.out.println();
            System.out.println("The details of "+no+" Student");
            s[m].displayRecord(); // Displaying the details of the student
            System.out.println("-----------------------------------------");
            
        }
    }
}
/*
Output
Enter the number of students
2
Enter the usn, name, branch, phone of 1 Student
1
Monika
cse
93411
Enter the usn, name, branch, phone of 2 Student
12
gowda
cse
9785

The details of 1 Student
NAME OF STUDENTS:Monika
USN: 1
BRANCH:cse
PHONE NO: 93411
-----------------------------------------

The details of 2 Student
NAME OF STUDENTS:gowda
USN: 12
BRANCH:cse
PHONE NO: 9785
-----------------------------------------*/



