// String 클래스 메서드

class ex18 {
    public static void main(String[] args) {
        String str = "ABCDE";
        String str1 = "ABCDE";

        char ch = str.charAt(3); // 문자열 str의 4번째 문자 'D'를 ch에 저장
        System.err.println(ch);

        int len = str.length(); // 정수 len에 String 클래스의 길이 3을 저장
        System.err.println(len);

        String tmp = str.substring(0,2); 
        System.err.println(tmp);

        // 문자열 tmp에 str에서 index 범위 0~2에 해당되는 "AB" 저장, to는 미포함
        boolean result = str.equals(str1); // true
        System.err.println(result);
        
        char[] chr = str.toCharArray(); // chr = { 'A', 'B', ~ }
        System.err.println(chr); //println 안에 char[] 전용 처리기 활용 -> ABCDE 출력

    }
}
