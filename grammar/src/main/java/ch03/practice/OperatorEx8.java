package ch03.practice;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b; // 이미 int int 계산에서 오버플로우가 발생하여 원하는 값이 나오지 않는다.

        System.out.println(c);
    }
}
