//배열의 활용(4) - 로또번호 뽑기

public class ex12 {
    public static void main(String[] args) {
        //45개의 정수값을 저장할 수 있는 배열 만들기
        int[] ball = new int[45];

        for(int i =0; i<ball.length; i++) {
            ball[i] = i+1; //ball 배열에 1~45 저장하기 
        }

        int tmp = 0; // 두 값을 바꾸는데 사용할 임시변수
        int j = 0;  // 임의의 값을 얻어서 저장할 변수

        for(int i = 0; i < 6; i++) { // 앞에 6개만 인덱스 0~44에서 바꾸기
            j = (int)(Math.random() * 45); // j에 0~44 중 랜덤의 수 넣기
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp; // 
        }

        //배열 앞에서부터 6개만 출력
        for(int i = 0; i < 6; i++) {
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
    
        }
  
    }
}