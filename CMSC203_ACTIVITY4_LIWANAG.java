import java.util.Scanner;

public class App {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		byte[] maxDate = {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.print("Month: ");
        byte month = scan.nextByte();

        System.out.print("Day: ");
        byte day = scan.nextByte();

        System.out.print("Year: ");
        short year = scan.nextShort();

        if (year % 4 == 0){
            maxDate[1] = 29;
        }
        
        if(month<=12&&month>0){
            if(day<=maxDate[month-1]&&day>0){
                System.out.println(months[month-1]+" "+day+", "+year);
            }
            else{
                System.out.println("invalid day input");
            } 
        }
        else{
            System.out.println("invalid month input");
        }

    }
    
}
