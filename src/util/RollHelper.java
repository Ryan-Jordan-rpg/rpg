package util;

public class RollHelper {
    public static int getRoll(){
        return (int) Math.floor(Math.random() * 30 + 1);
    }

    public static boolean isHigherRoll(int char1Roll, int char2Roll){
        return char1Roll > char2Roll;
    }
}
