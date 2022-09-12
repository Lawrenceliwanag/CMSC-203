import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Name: ");
        String name = scanner.nextLine();
        
        System.out.println("Age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("GPA: ");
        double GPA = scanner.nextDouble();
        
        System.out.println("Bloodtype: ");
        String bloodType = scanner.nextLine();
        
        System.out.println("Hi, My name is "+name);
        System.out.println("I am "+age+" Years old");
        System.out.println("My GPA is "+GPA);
        System.out.println("My Blood type is "+bloodType);
        
    }
}
