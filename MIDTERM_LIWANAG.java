import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //{6,7,13,14,20,21,27,28}
        System.out.print("number(s) of test case: ");
        int testCases = scan.nextInt();
        scan.nextLine();

        String[] result = new String[testCases];

        for(int i = 0; i<testCases; i++){

            LinkedHashSet<Integer> holidays = new LinkedHashSet<>();

            holidays.add(6);  holidays.add(7);
            holidays.add(13); holidays.add(14);
            holidays.add(20); holidays.add(21);
            holidays.add(27); holidays.add(28);

            System.out.println("\ntest#"+(i+1));
            System.out.print("\nnumber(s) of holiday: ");
            int holidayCount = scan.nextInt();
    
            System.out.print("\nday(s) of holiday: "); 
            for(int j = 0; j < holidayCount; j++){
                holidays.add(scan.nextInt());
            }
    
            ArrayList<Integer> array = new ArrayList<Integer>(holidays);
            Collections.sort(array);

            result[i] = Integer.toString(array.size())+" (";

            for (int integer : array) {
                result[i] = result[i]+integer+",";
            }

            StringBuilder formatresult = new StringBuilder(result[i]);
            formatresult.setCharAt(result[i].length()-1, ')');

            result[i] = formatresult.toString();
        }
       

        for(int i = 0; i < testCases; i++){
            System.out.println(result[i]);
        }

        scan.close();
    }
   
}

