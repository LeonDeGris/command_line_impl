public class Print {
    public void print(String[] commands) {


        StringBuilder result = new StringBuilder();
        switch (commands[commands.length - 1]) {

            case "-u":
                System.out.println("-u accepted".toUpperCase());

                for (int i = 1; i < commands.length - 1; i++) {
                    result.append(commands[i])
                            .append(" ");
                }
                System.out.println(result.toString().toUpperCase());
                break;

            case "-l":
                System.out.println("-l accepted".toLowerCase());

                for (int i = 1; i < commands.length - 1; i++) {
                    result.append(commands[i])
                            .append(" ");
                }
                System.out.println(result.toString().toLowerCase());
                break;

            default:

                for (int i = 1; i < commands.length; i++) {
                    result.append(commands[i])
                            .append(" ");
                }
                System.out.println(result.toString());
                break;
        }
    }
}
