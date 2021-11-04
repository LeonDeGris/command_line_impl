import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, user!");
        System.out.println("Enter your action:");
        System.out.println(" 1. print message;\n 2. calculate num1, num2;\n 3. timer set seconds;");

        Scanner scan = new Scanner(System.in);
        String action = scan.nextLine();
        action = action.trim();
        String[] commands = action.split(" ");

        switch (commands[0]) {

            case "print":
                System.out.println("print accepted");
                Print print = new Print();
                print.print(commands);
                break;

            case "calculate":
                System.out.println("calculate accepted");
                Calculate calculate = new Calculate();
                calculate.calculate(commands);
                break;

            case "timer":
                System.out.println("timer set accepted");
                TimerSet timerSet = new TimerSet();
                timerSet.timerSet(commands);
                break;
        }
    }

}



