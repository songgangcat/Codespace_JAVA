package ch2_oop.exam03_method;

public class MyMath2 {
    long a, b; // iv

    // iv a, b만을 활용하여 작업 -> 매개변수가 필요 X
    // 아래 4개는 인스턴스 메서드
    long add() {return a+b;} // a, b는 iv
    long subtrack() {return a-b;}
    long multiply() {return a*b;}
    double divide() {return a/b;}

    // 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
    // 아래 4개는 클래스 메서드
    static long add(long a, long b) { return a+b; } // a, b는 지역변수
    static long substract(long a, long b) { return a-b; }
    static long multiply(long a, long b) { return a*b; }
    static double divide(double a, double b) { return a/b; }

    
    public static void main(String[] args) {
        //클래스 메서드 호출 -> 인스턴스 생성 없이 호출 가능
        System.out.println(MyMath2.add(200L, 100L));
        //인스턴스 메서드 호출 -> 먼저 객체 생성 후
        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;
        System.out.println(mm.add());

    }
}
