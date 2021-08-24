package Chapter_Eight;


public enum TrafficLight {

    RED ("5m"),
    GREEN("5m"),
    YELLOW("5m");


    private final String duration;

     TrafficLight(String duration){
        this.duration = duration;
    }

    public String getDuration(){
         return duration;
    }
}
