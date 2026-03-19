package ch1_base;
// 배열의 활용 (1) - 총합과 평균

public class ex09 {
    public static void main(String[] args) {
        int sum = 0; // 총합 저장 변수
        float average = 0f; // 평균 저장 변수
    
    int[] score = {100, 88, 100, 100, 90};

    for(int i=0;i<score.length;i++) {
        sum += score[i];
    } // end of for
    average = sum / (float)score.length; // 계산결과를 float로 얻으려 형변환

    System.out.println("총합 : " + sum);
    System.out.println("평균 : " + average);
    }
}
