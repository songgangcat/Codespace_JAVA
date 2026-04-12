package ch2_oop.exam03_method;

public class TestClass {
    void instanceMethod() {} // 인스턴스 메서드
    static void staticMethod() {} // static 메서드

    void instanceMethod2() { // 인스턴스 메서드
        instanceMethod(); // 다른 인스턴스 메서드 호출
        staticMethod(); // static 메서드 호출
    }

    static void staticMethod2() { // static 메서드
      //instanceMethod(); // 에러 -> 인스턴스 메서드 호출 불가
        staticMethod(); // static 메서드 호출
    }
}
