package ch1_base;
public class ex01 {
    public static void main(String[] args) {
    int hour = 3;
    int minute = 5;
    System.err.println(hour + "시간" + minute + "분");
    
    int totalMinutes = (hour * 60) + minute;
    System.out.println("총" + totalMinutes + "분");

    }
}
