package Chapter_Eight;

import java.util.Timer;
import java.util.TimerTask;

public enum TrafficLight {

    RED (schedule(5000)),
    GREEN(schedule(5000)),
    YELLOW(schedule(5000));

    private static Timer schedule(int time) {
        return RED.duration;
    }

    private final Timer duration;

   TrafficLight(Timer duration){
        this.duration = duration;
    }

    public static class TrafficDuration extends TimerTask {

        @Override
        public void run() {
            System.out.println(TrafficLight.RED);
//            System.out.println(TrafficLight.GREEN);
//            System.out.println(TrafficLight.YELLOW);
        }
    }
}
