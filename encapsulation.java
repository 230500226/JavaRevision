// sub class
public class GradeBook{
    private String courseName;

//  Setter 
    public void setCourseName( String name ){
        courseName = name;
    }
// Getter
    public String getCourseName(){
        return courseName;
    }

    public void displayMessage(){
        System.out.printf( "Welcome to the grade book for %s", getCourseName() );
    }
}

//main class
public class courseMan{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        GradeBook myGradeBook = new GradeBook();

        System.out.printf( "Initial course name is %s\n", myGradeBook.getCourseName());

        System.out.printf("Enter new course name:");
        String newCourseName = input.nextLine();
        myGradeBook.setCourseName(newCourseName);
        System.out.println();

        myGradeBook.displayMessage();
    }
}
