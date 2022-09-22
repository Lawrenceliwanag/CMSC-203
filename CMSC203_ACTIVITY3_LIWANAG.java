import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner scan = new Scanner(System.in);

        System.out.print("number of test(s): ");
        int testCasesCount = scan.nextInt();

        int[][] testCases = new int[testCasesCount][2];

        for (int i=0;i<testCases.length;i++){

            System.out.println("test " + (i+1));
            
            System.out.print("uber: ");
            testCases[i][0] = scan.nextInt();

            System.out.print("grab: ");
            testCases[i][1] = scan.nextInt();
        }

        scan.close();

        System.out.println("Result:");

        for (int i=0;i<testCases.length;i++){

            if(testCases[i][0]<testCases[i][1]){
                System.out.println("first");
            }
            else if(testCases[i][0]>testCases[i][1]){
                System.out.println("second");
            }
            else{
                System.out.println("any");
            }
        
        }
        
    }
}
