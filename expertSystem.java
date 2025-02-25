import java.util.*;
public class expertSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you have Python course work? (y/n)");
        boolean hasPythonCW = scanner.nextLine().equalsIgnoreCase("y");

        System.out.println("Do you have Software Engineering course work? (y/n)");
        boolean hasSoftwareEngineeringCW = scanner.nextLine().equalsIgnoreCase("y");

        System.out.println("Do you have Agile course work? (y/n)");
        boolean hasAgileCW = scanner.nextLine().equalsIgnoreCase("y");

        System.out.println("Do you have a Bachelor's in CS? (y/n)");
        boolean hasBachelors = scanner.nextLine().equalsIgnoreCase("y");

        System.out.println("How many years of Python Development experience do you have?");
        int pythonYears = Integer.parseInt(scanner.nextLine());

        System.out.println("How many years of data development experience do you have?");
        int dataYears = Integer.parseInt(scanner.nextLine());

        System.out.println("Do you have experience in Agile projects? (y/n)");
        boolean hasAgileXP = scanner.nextLine().equalsIgnoreCase("y");

        System.out.println("Do you have experience using Git? (y/n)");
        boolean hasGitXP = scanner.nextLine().equalsIgnoreCase("y");

        System.out.println("How many years of managing software projects experience do you have?");
        int pmYears = Integer.parseInt(scanner.nextLine());

        System.out.println("Do you have a PMI Lean Project Management Certification? (y/n)");
        boolean hasPMICertification = scanner.nextLine().equalsIgnoreCase("y");

        System.out.println("How many years of experience do you have using Python to develop Expert Systems?");
        int expertSystemYears = Integer.parseInt(scanner.nextLine());

        System.out.println("Do you have a Master's in CS? (y/n)");
        boolean hasMasters = scanner.nextLine().equalsIgnoreCase("y");

        if (hasPythonCW && hasSoftwareEngineeringCW && hasBachelors) {
            System.out.println("Congratulations! You qualify for the Entry-Level Python Engineer position... Your application has been accepted to be interviewed for the position qualified.");
            System.out.println("Reason: You have the required Python and Software Engineering course work, and a Bachelor's in CS.");
            if(hasAgileCW){
                System.out.println("You also have Agile course work which is a plus!");
            }
        }
        if (pythonYears >= 3 && dataYears >= 1 && hasAgileXP && hasBachelors) {
            System.out.println("Congratulations! You qualify for the Python Engineer position... Your application has been accepted to be interviewed for the position qualified.");
            System.out.println("Reason: You meet the experience requirements in Python and data development, have Agile experience, and a Bachelor's in CS.");
            if(hasGitXP){
                System.out.println("You also have Git experience which is a plus!");
            }
        }
        if (pmYears >= 3 && hasAgileXP) {
            System.out.println("Congratulations! You qualify for the Project Manager position... Your application has been accepted to be interviewed for the position qualified.");
            System.out.println("Reason: You have the required years of experience in managing software projects and Agile experience.");
            if (hasPMICertification) {
                System.out.println("You also have the desired PMI Lean Project Management Certification, which is a plus!");
            }
        }
        if (expertSystemYears >= 3 && dataYears >= 2 && hasMasters) {
            System.out.println("Congratulations! You qualify for the Senior Knowledge Engineer position... Your application has been accepted to be interviewed for the position qualified.");
            System.out.println("Reason: You have the required experience in Python Expert Systems and data architecture, and a Master's in CS.");
        }
        else {
            System.out.println("We're sorry, but you don't currently qualify for any of the available positions... Your application has unfortunately been rejected.");
            System.out.println("Reason: Your qualifications don't meet the minimum requirements for the open positions.");
        }

        scanner.close();
    }
}
