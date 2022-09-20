import java.util.Scanner;

public class For {
    public static void main(String[] args) {

//        for : 가장 많이 사용되는 반복문
//        while문과의 차이점
//        1. 초기화 변수와 초기화 변수 카운트를 for문의 설정 부분에 입력
//        2. 초기화 변수가 for문의 설정 부분에 입력되면서 for문의 지역변수로 사용되어서 같은 변수를 계속 사용할 수 있음
//        3. 초기화 변수 카운트가 항상 마지막에 동작함

        System.out.println("\n ----- for문 ----- \n");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n ----- while문 ----- \n");

        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

//        문제 1. 아래의 while문을 for문으로 변환하여 출력하세요.
//        ------ while문 ------
/*        int hit = 0;

        while (hit < 10) {
            hit++;
            System.out.println("나무를 " + hit + "번 찍었습니다.");

            if (hit == 10) {
                System.out.println("나무가 넘어갑니다.");
            }
        }*/
//        ------ for문 ------
        System.out.println("\n----- 문제 1 ----- \n");

        for (int i = 0; i < 11; i++) {
            System.out.println("나무를" + i + "번 찍었습니다.");

            if (i == 10) {
                System.out.println("나무가 넘어갑니다.");
            }
        }


//        문제 2) 원하는 단수의 구구단을 출력하는 프로그램을 for문을 사용하여 출력하세요
//        출력형태 : 5 * 1 = 5  ~  5 * 9 = 45
//        ------ while문 ------
/*        int num = 1;
        while(num<11) {
            System.out.println(num);
            num++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하세요 ");
        int nnd = scanner.nextInt();
        int count1 = 1;
        while(count1 <= 10){
            System.out.println(nnd + "*" + count1 + "=" + nnd*count1);
            count1++;
        }*/
//        ------ for문 ------
        System.out.println("\n----- 문제 2 ----- \n");
        System.out.print("1~9 사이의 정수를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int scannum2 = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(scannum2 + "*" + i + "=" + (scannum2 * i));
        }


//        문제3) 사용자 입력을 통해서 데이터를 5개 입력받은 값의 총합을 구하는 프로그램을 for문을 사용하여 작성하세요.
        System.out.println("\n----- 문제 3 ----- \n");
//        System.out.print("5개의 정수를 입력하세요. : ");

//        int scannum3 = scanner.nextInt();


//        문제4) for문을 사용하여 아래의 모양과 동일한 모양이 출력되도록 프로그래밍을 하세요.
//        *
//        **
//        ***
//        ****
//        *****

        for (int i = 0; i < 6; i++) {
            System.out.print("\n");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }

        String star = "*";
        for (int i = 0; i < 5; i++) {
            star += "*";
//            star = star + "*";
            System.out.println(star);
        }

        System.out.println("\n----- 중첩 for문 -----\n");
//        for문 안에 for문 존재하는 형태의 for문
//        2차원 배열의 내용을 출력할때 많이 사용함

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i의 값 : " + i + "\tj의 값 : " + j);
            }
            System.out.println("--------------------");
        }
//        for문을 이용한 구구단
        for (int i = 2; i < 10; i++) {
            System.out.println("-----" + i + "단 -----");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }

//        변수의 카운트 부분을 ++를 사용한 단항 연산자가 아닌 산술 대입 연산차를 사용시 원하는 크기만큼 카운트 값을 변경할 수 있음.
        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }


    }
}
