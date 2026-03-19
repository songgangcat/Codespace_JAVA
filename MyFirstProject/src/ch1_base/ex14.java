package ch1_base;
// 명령 라인 입력받기 -> 입력받은 변수들 하나씩 출력
 

class ex14 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수:" + args.length);
        for(int i=0;i < args.length;i++){
            System.out.println("args[" + i + "] = \""+ args[i] + "\"");
        }
    }
}