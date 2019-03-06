import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int ave = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
            count++;
            ave = Math.round((float)sum/count);
        }
        System.out.println("SUM = " + sum + " AVG = " + ave);
    }
}
