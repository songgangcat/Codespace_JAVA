package ch2_oop.exam02_call_stack;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d); 
        // 참조변수 d2가 호출스택 main 메서드에 추가로 생김
        // copy(d) 실행, 호출스택 main 메서드의 참조변수 d가 갖고있는 객체 주소값의 복사본 입력됨

        //<메서드 실행 후>
        // copy(d)에 copy 메서드에서 생긴 새 객체의 주소가 넘어오게 됨 (메서드에서 tmp 반환)
        // 결론적으로 d2는 새 객체의 주소를 가지게 됨
        System.out.println("d.x = " + d.x); // 기존 객체의 x값 출력
        System.out.println("d2.x = " + d2.x); // copy 메서드에서 새로 생긴 객체의 x값 출력
    }

    static Data3 copy(Data3 d) { 
        // copy 메서드의 Data3 타입 참조변수 d 선언, 
        // 여기에 main 메서드 참조변수 d의 값(Data3 객체 주소)의 복사본 들어옴
        // 결론적으로 이 참조변수 d 또한 기존 Data3 객체의 주소를 가지고 있음
        Data3 tmp = new Data3(); 
        // 호출스택의 copy 메서드에 참조변수 tmp 선언되고, 
        // 이 tmp는 새로운 Data3 객체의 주소 가짐(이 객체 안의 x는 값이 0)
        tmp.x = d.x; 
        // tmp.x = 새로 생긴 객체의 x값 
        // d.x =  기존에 있던 객체의 x값
        // 결론적으로 기존 객체에 있던 x값이 새 객체의 x값에 복사됨 
        return tmp; // 새로 생긴 객체의 주소를 가지고 있는 tmp를 반환
    }
}

//<Method Area>
// ReferenceReturnEx.class
// Data3.class


//<Stack> *출력할 때 println() 메서드도 잠깐 생김
// copy() -> copy() 실행 중에만 존재
//      d   (지역변수, 참조형)  -> 기존 Data3 객체 참조
//      tmp (지역변수, 참조형)  -> 새 Data3 객체 참조
// main()
//      d   (지역변수, 참조형)  -> 기존 Data3 객체 참조
//      d2  (지역변수, 참조형)  -> copy()에서 반환된 새 Data3 객체 참조


//<Heap>
// Data3 객체 (기존 객체)
//      x = 0  (처음)
//      x = 10 (d.x = 10 실행 후)

// Data3 객체 (copy 메서드에서 새로 생성된 객체)
//      x = 0  (객체 생성 직후)
//      x = 10 (tmp.x = d.x 실행 후)