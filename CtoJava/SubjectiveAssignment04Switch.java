import java.util.Scanner;

public class SubjectiveAssignment04Switch {
    public static void main(String[] args) {
        //1
        Scanner mine = new Scanner(System.in);
        System.out.println("Please enter the day of the week 1-7: ");
        int week = mine.nextInt();
        switch(week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid day");
        }
        
    }
}
