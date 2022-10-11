import java.util.InputMismatchException;
import java.util.Scanner;


public class App {

    public static final String colorReset = "\u001B[0m";
    public static final String colorRed = "\u001B[31m";
    public static Scanner scanner = new Scanner(System.in);

    static void printError(String argument){
    System.out.println(colorRed + argument + colorReset);
    scanner.nextLine();
    }

    static double firstValue(){
        System.out.print("\nfirst value: ");
        double input = scanner.nextDouble();
        return input;
    }

    static double secondValue(){
        System.out.print("\nsecond value: ");
        double input = scanner.nextDouble();
        return input;
    }

    static double addition(double firstValue){    
        System.out.println("\nAddition has been selected");
        return firstValue+secondValue();
    }

    static double subtraction(double firstValue){       
        System.out.println("\nSubtraction has been selected"); 
        return firstValue-secondValue();
    }

    static double multiplication(double firstValue){
        System.out.println("\nMultiplication has been selected");
        return firstValue*secondValue();
    }

    static double division(double firstValue){
        System.out.println("\nDivision has been selected");

        while(Double.isNaN(firstValue/secondValue())){
            printError("cannot divide 0 to 0");
        }
        return firstValue;
    }

    public static double compute(){

        double firstValueInput = firstValue();

        System.out.print("\narithmetic operator selection\n 1  2  3  4  5\n[+][-][x][/][√]: ");
        byte operator = scanner.nextByte();
        
        switch(operator){
            case 1:
                return addition(firstValueInput);

            case 2:
                return subtraction(firstValueInput);

            case 3:
                return multiplication(firstValueInput);

            case 4:
                return division(firstValueInput);

            case 5:
                return Math.sqrt(firstValueInput);
            
            default:
               printError("follow the instruction pls...");
               return 0;
        }
    }
    public static void main(String[] args) throws Exception {

        System.out.println("welcome to my calkulahtohr\nPress any key to start...");
       

        while(true){
                       
            try {
                System.out.println("\nanswer: " + compute());
                break;
            }
            catch (InputMismatchException e) {
                printError("follow instruction pls...");
            }
        }

        scanner.close();
    
    }
}
