//String 배열 - 가위 바위 보 중에 하나 랜덤으로 출력하기

import java.util.Arrays;

public class ex13 {
    public static void main(String[] args) {
        String[] strArr = {"가위", "바위", "보"};
        System.out.println(Arrays.toString(strArr));
        
        for(int i =0; i<10; i++) {
            int tmp = (int)(Math.random()*3); // 0~2
            System.out.println(strArr[tmp]);
        }   
    }
}
