package Chapter_Eight;

import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class TrafficLightTest {





        public static void main(String[] args) {
            Timer timer = new Timer();
            TimerTask workOnTask = new TimerTask() {
                @Override
                public void run() {
                    for(int i = 0; i < TrafficLight.values().length; i++){
                        if(i < 3){
                            System.out.println(TrafficLight.values()[i]);
                        }else timer.cancel();
                    }
                }
            };

            timer.scheduleAtFixedRate(workOnTask,0, 1000);


    }
}