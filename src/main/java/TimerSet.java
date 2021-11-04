import java.util.Timer;
import java.util.TimerTask;

public class TimerSet{
    private static int interval;
    private static Timer timer;

    public void timerSet(String[] commands) {

        int delay = 1000;
        int period = 1000;
        timer = new Timer();
        interval = Integer.parseInt(commands[2]);
        System.out.println(commands[2]);
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                System.out.println(setInterval());

            }
        }, delay, period);
    }

    private static int setInterval() {
        if (interval == 1)
            timer.cancel();
        return --interval;

    }
}
