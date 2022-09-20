import java.sql.SQLOutput;
import java.util.Scanner;

// While문 : 가장 기본적인 반복문
// while문 실행 시 while문 밖에 초기화 변수를 선언하고, while 안엥서 초기화 변수의 카운트가 필요함
public class While {
    public static void main(String[] args) {
        System.out.println("\n ----- While 문 ----- \n");

        int hit = 0;

        while (hit < 100) {
            hit++;
            System.out.println("나무를 " + hit + "번 찍었습니다.");

            if (hit == 100) {
                System.out.println("나무가 넘어갑니다.");
            }
        }

//        While 사용 시 주의할 점
//        1. 초기화 변수의 카운트부분의 위치에 따라 결과가 달라짐
//        1-1. 프로그래밍이 익숙하지 않을 경우 변수의 카운트 부분을 고정해서 사용하는것이 좋음(제일 끝에 두는걸 추천함)
//        2. while문을 탈출할 수 있는 조건을 반드시 명시해줘야함( 무한 루프에 빠질 수 있음)
//        2-1. break 문을 사용하여 탈출
        System.out.println("\n ----- while 문 사용 시 주의점 -----\n");
        hit = 1;

        while (hit < 5) {
//            hit++;
            System.out.println("나무를 " + hit + "번 찍었습니다.");

//            hit++;
            if (hit == 5) {
                System.out.println("나무가 넘어갑니다.");
            }
            hit++;
        }

//        문제 2) while문을 사용하여 1~10까지 화면에 출력하는 프로그램을 작성하세요
        int num = 1;
        while(num<11) {
            System.out.println(num);
            num++;
        }

//        문제 2 풀이
        int count = 1;
        while(count <= 10) {
            System.out.println(" " + count);
            count ++;
        }


//        문제 3) while문을 사용하여 1~10까지의 총합을 구하는 프로그램을 작성하세요
        int num1 = 1;
        int sum = 0;
        while(num1<11) {
            sum = sum + num1;
            num1++;
        }
        System.out.println("총 합계는" + sum + "입니다.");

//        -- 문제 3 풀이 --
        count = 1;
        int total = 0;

        while (count <= 10) {
            total = total + count;
            System.out.println("count : " + count + "\ttotal : " + total);

            count++;
        }
        System.out.println("\n ----- 책 예제 ----- \n");
        Scanner scanner = new Scanner(System.in);

        count = 0;
        int n = 0;  // 정수입력부분
        double sum1 = 0.0;  // 전체 값

        System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
//        while문의 조건식에 탈출 조건까지 함께 지정
//        키보드 입력을 통한 데이터가 0이 아닐 경우 아래의 while문 실행, 0이면 while문 종료
        while ((n = scanner.nextInt()) != 0) {
            sum1 = sum1 + n;
            count++;
        }
        System.out.println("수의 개수는 " + count + "개이며, ");
//        총합이 저장된 변수 sum은 double 형
//        입력된 데이터의 수가 저장된 변수 count는 int형
//        double형과 int형의 연산이 수행되면 자동형변환이 발생하여 double형으로 데이터가 만들어짐.
        System.out.println("평균은" + sum1 / count + "입니다.");


//        문제 4) while문을 사용하여 지정한 단수의 구구단을 출력하세요.
//        출력형태 : 5 * 1 = 5  ~  5 * 9 = 45
        System.out.print("1~99 사이의 정수를 입력하세요 ");
        int nnd = scanner.nextInt();
        int count1 = 1;
        while(count1 <= 10){
            System.out.println(nnd + "*" + count1 + "=" + nnd*count1);
            count1++;
        }


//        다중 while문 : 하나의 while 문 안에 또 다른 while문이 있는 형태의 while문을 뜻함
        System.out.println("\n ----- 다중 while문 -----\n");

//      다중 while문 예시
       int a = 0;
        int j = 0;

        while (a < 5) {
            while (j < 5) {
                System.out.println("a: " + a + "\tj: " + j);
                j++;
            }
            a++;
            j = 0;
        }


//        다중 while문 더 쉽게 만들기
        int i = 0;

        while (i < 5) {
            int t = 0;
            while (t < 5) {
                System.out.println("a: " + i + "\tj: " + t);
                t++;
            }
            i++;
        }

//        문제 5) while문을 사용하여 2 ~ 9단까지의 구구단을 모두 출력하는 프로그램을 작성하세요(중첩 while문 이용)
//        출력형태 : 5*1 = 5 ~ 5*9 = 45

        int i1 = 2;

        while (i1 < 10) {
            int kkk = 1;
            while (kkk < 10) {
                System.out.println(i1 + " * " + kkk + " = " + (i1 * kkk));
                kkk++;
            }
            i1++;
        }

//      문제 5 풀이
        i = 2;
        while (i < 10) {
            System.out.println("------" + i + "단 ------");
            int k3 = 1;
            while(k3 < 10) {
                System.out.println(i + " * " + k3 + " = " + (i * k3));
                k3++;
            }
            i++;
        }
//        do ~ while : 기본적으로 while문과 동일한 반복문, 무조건 1번은 실행이 되는 while문, 반복 조건을 나중에 확인함
        System.out.println("\n ----- do while 문 -----\n");

        System.out.println("\n ----- 일반 while 문 -----\n");
        int c1 = 0;

        while (c1 < 5) {    // 조건 먼저 확인
            System.out.println(c1);
            c1++;
        }

        System.out.println("\n ----- do ~ while 문 -----\n");
        int c2 = 0;

        do {        // 일단 실행 먼저
            System.out.println(c2);
            c2++;
        } while (c2 < 5);   // 조건을 나중에 확인


    }
}
