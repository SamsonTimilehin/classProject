package chapterFour;

import java.util.Timer;
import java.util.TimerTask;

public class PlayGround2 extends TimerTask {

    public void run(){
        System.out.println("Nice work");
    }

    public static void main(String[] args) throws InterruptedException {

       PlayGround2 task = new PlayGround2();
       Timer timer = new Timer();
       timer.schedule(task,5000);

    }
}