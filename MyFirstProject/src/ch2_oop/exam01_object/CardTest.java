package ch2_oop.exam01_object;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card(); // c1 객체 생성, 참조변수 선언
        c1.Kind = "Heart"; // 각 객체 인스턴스 변수 값 변경하기
        c1.number = 7;
        Card c2 = new Card(); // c2 객체 생성, 참조변수 선언
        c2.Kind = "Spade"; 
        c2.number = 4;

        System.out.println("c1은 "+c1.Kind+","+c1.number+"이며, 크기는 ("+Card.width +","+Card.height+")"); // 인스턴스 변수 kind, number는 "참조변수.변수이름"으로 사용
        System.out.println("c2는 "+c2.Kind+","+c2.number+"이며, 크기는 ("+Card.width +","+Card.height+")"); // 클래스 static 변수 width, height는 "클래스이름.변수이름"으로 사용

        Card.width = 50; // 클래스 변수 변경
        Card.height = 50;

        System.out.println("c1은 "+c1.Kind+","+c1.number+"이며, 크기는 ("+Card.width +","+Card.height+")"); // 인스턴스 변수 kind, number는 "참조변수.변수이름"으로 사용
        System.out.println("c2는 "+c2.Kind+","+c2.number+"이며, 크기는 ("+Card.width +","+Card.height+")"); // 클래스 static 변수 width, height는 "클래스이름.변수이름"으로 사용
    }

}
