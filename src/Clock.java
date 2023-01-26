
public class Clock {

    public static void main(String[] args) {
        int seconds = ClockSeconds(18, 32, 47);
        System.out.println(seconds);
    }

    public static int ClockSeconds(int num1, int num2, int num3) {
        int result = 3600 * num1 + 60 * num2 + num3;
        return result;
    }

}
