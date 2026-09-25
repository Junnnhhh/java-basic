package ch03.practice;

public class OperatorEx9 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000; // 이건 이미 int * int 로 계산이 먼저 실행되기 때문에 오버플로우가 발생한걸 저장
        long b = 1_000_000 * 1_000_000L;

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
