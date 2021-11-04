public class Calculate {

    public void calculate(String[] commands) {
        switch (commands[commands.length - 1]) {

            case "+":
                System.out.println("Your result is:");
                System.out.println(Integer.parseInt(commands[1]) + Integer.parseInt(commands[2]));
                break;

            case "-":
                System.out.println("Your result is:");
                System.out.println(Integer.parseInt(commands[1]) - Integer.parseInt(commands[2]));
                break;

            case "*":
                System.out.println("Your result is:");
                System.out.println(Integer.parseInt(commands[1]) * Integer.parseInt(commands[2]));
                break;

            case "/":
                System.out.println("Your result is:");
                System.out.println(Integer.parseInt(commands[1]) / Integer.parseInt(commands[2]));
                break;
        }
    }
}
