//배열의 활용(3) - 섞기(shuffle)

import java.util.Arrays;

public class ex11 {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < 100; i++ ) {
            int n = (int)(Math.random() *  10); // 0~9 중의 한 값을 임의로 얻는다
            int tmp = numArr[0]; // 배열 첫번째 값을 tmp에 넣음
            numArr[0] = numArr[n]; // 배열 첫번째에 무작위 배열 n 번째 값을 넣음
            numArr[n] = tmp; // 배열 n번째에 tmp(기존 배열 첫번째 값) 값을 넣는다
        }
        System.out.println(Arrays.toString(numArr));
    } // main의 끝  
}
