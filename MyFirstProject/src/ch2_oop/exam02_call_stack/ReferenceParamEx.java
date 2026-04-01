package ch2_oop.exam02_call_stack;

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d); 
        // 여기서 d는 main 메서드의 lv(지역변수, 참조형)
        // d는 객체의 주소값(참조값)을 저장하는 참조변수이므로
        // change()에는 그 참조값의 복사본이 전달됨
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    
    }

    static void change(Data2 d) {
        // 여기서 d는 change 메서드의 lv(지역변수), 참조형
        // 두 d는 다르지만 main메서드의 d의 주소를 복사해오므로 같은 객체 참조함
        // 이 메서드는 단순히 Data2 객체의 iv(인스턴스 변수)를 변경하는 메서드
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}


//<Method Area>
// ReferenceParamEx.class
// Data2.class

//<Stack> *출력할때 println() 메서드도 잠깐 생김
// change() -> change() 실행 중에만 존재
//      d (지역변수, 참조형)
// main()
//      d (지역변수, 참조형)


//<Heap>
//  Data2 객체
//      x = 0 (처음)
//      x = 10 (d.x = 10 실행 후)
//      x = 1000 (change(d) 실행 후)