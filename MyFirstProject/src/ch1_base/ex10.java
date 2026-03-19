package ch1_base;
// 배열의 활용 (2) - 최댓값과 최소값 찾기

public class ex10 {
    public static void main(String[] args) {
        int[] score = {79,88,91,33,100,55,95};

        int max = score[0]; //배열의 첫번째 값으로 초기화
        int min = score[0];

        for(int i =1;i<score.length;i++) { // 두번째 요소부터 읽기
            if(score[i] >max) {
                max = score[i];
            } else if(score[i]<min) {
                min = score[i];
            } // end of if
        } // end of for

        System.out.println("최댓값 :" + max);
        System.out.println("최소값 :" + min);        
    } // end of main
} // end of class
 