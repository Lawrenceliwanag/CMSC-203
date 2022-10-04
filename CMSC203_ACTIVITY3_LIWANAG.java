import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner scan = new Scanner(System.in);

        System.out.println("number of test cases: ");
        int testCasesCount = scan.nextInt();

        int[][] testCases = new int[testCasesCount][2];

        System.out.println("number of test(s): "+testCasesCount+"\nuber - grab: ");

        for(int i = 0 ; i <testCases.length ; i++){
            scan.hasNextInt();
            testCases[i][0] = (scan.nextInt());
            testCases[i][1] = (scan.nextInt());
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
        //????????
    }
}
