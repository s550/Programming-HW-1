import java.util.Scanner;

public class employeeForm {

    public static void printEmployee(Employee e){
        System.out.printf("%12s%13s%13s%13s\n",e.getName(),e.getIdNumber(),e.getDepartment(),e.getPosition());

    }

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("-- Employee Entry Form --");
        System.out.println("Enter name");
        String name1 = keyboard.nextLine();

        System.out.println("Enter ID");
        int employeeID1 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter department");
        String department1 = keyboard.nextLine();

        System.out.println("Enter position");
        String position1 = keyboard.nextLine();

        System.out.println("-- Employee Entry Form --");
        System.out.println("Enter name");
        String name2 = keyboard.nextLine();

        System.out.println("Enter ID");
        int employeeID2 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter department");
        String department2 = keyboard.nextLine();

        System.out.println("Enter position");
        String position2 = keyboard.nextLine();

        System.out.println("-- Employee Entry Form --");
        System.out.println("Enter name");
        String name3 = keyboard.nextLine();

        System.out.println("Enter ID");
        int employeeID3 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter department");
        String department3 = keyboard.nextLine();

        System.out.println("Enter position");
        String position3 = keyboard.nextLine();

        Employee e1 = new Employee(name1, employeeID1, department1, position1);
        Employee e2 = new Employee(name2, employeeID2, department2, position2);
        Employee e3 = new Employee(name3, employeeID3, department3, position3);


        System.out.printf("%12s%13s%13s%13s\n","Name","ID","Department","Position");
        printEmployee(e1);
        printEmployee(e2);
        printEmployee(e3);
    }
}
