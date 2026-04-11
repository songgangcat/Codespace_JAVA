package ch2_oop.exam02_call_stack;

public class MainEx {
    public static void main(String[] args) {
        main(null); // 재귀 호출, 자기 자신을 다시 호출
                        // if문이 없어 StackOverflowError
    }
}
