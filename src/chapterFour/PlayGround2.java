package chapterFour;

public class PlayGround2 {

     public static double maxClass(double x, double y, double z) {
         double maxNum = x;
         if(y > maxNum)
             maxNum = y;
         if(z > maxNum)
             maxNum = z;
         return maxNum;
     }


}
