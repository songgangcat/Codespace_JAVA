package ch2_oop.exam02_call_stack;

public class PrimitiveParamEx { // 기본형 매개변수 예제
    public static void main(String[] args) {
        Data d = new Data(); 
        // 참조변수 d 선언(d -> stack 영역, lv:지역변수)
        // Data 객체 생성(인스턴스 변수 int x 있음 + x는 기본값 0 가짐, Data.java 참고)
        // 객체와 참조변수 d 연결됨 -> d에 객체의 주소 들어감
        d.x = 10; // 참조변수 d를 통해 객체의 iv x를 변경 
        System.out.println("main() : x = " + d.x); // x 출력

        change(d.x); // change 메서드 호출(입력 d.x) + 호출스택 main() 위에 change() 쌓임
        System.out.println("After change(d.x)"); 
        System.out.println("main() : x = " + d.x); // x 출력
    }

    static void change(int x) {
        x = 1000; 
        // 입력받은 정수 x(위 코드에서 d.x 입력받음)를 1000으로 변경
        // 입력받은 것은 d.x의 값의 복사본이므로, 객체 Data의 인스턴스 변수 x의 값이 변하지는 X
        System.out.println("change() : x = " + x);
    }
}

//<Method Area>
// PrimitiveParamEx.class
// Data.class

//<Stack>
// change() -> change() 실행 중에만 존재
//      x (지역변수, 기본형)
// main()
//      d (지역변수, 참조형)


//<Heap>
//  Data 객체
//      x = 0 (처음)
//      x = 10 (d.x = 10 실행 후)
