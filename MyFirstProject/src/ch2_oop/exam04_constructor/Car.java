package ch2_oop.exam04_constructor;

public class Car {
    String color; // 색상
    String gearType; // 변속기 종류 - auto, manual
    int door; // 문의 개수

    Car() {} // 기본 생성자
    Car(String c, String g, int d) { // 매개변수가 있는 생성자
        color = c;
        gearType = g;
        door = d;
    }
}
