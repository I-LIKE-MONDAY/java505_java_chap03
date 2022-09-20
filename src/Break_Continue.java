import java.util.Scanner;

public class Break_Continue {
    public static void main(String[] args) {

//        break : 반복문 내에서 break를 만나면 해당 반복문 즉시 중단
        System.out.println("\n ----- break ----- \n");
        for (int i=0; i<10; i++) {
            if(i == 5) {
                break;
            }
            System.out.println("break문 사용 시 현재 i의 값 : " + i);
        }
//        continue : 반복문 내에서 continue를 만나면 해당 루프만 중단하고 다음 루프로 넘어감
        System.out.println("\n ----- continue ----- \n");
        for (int i=0; i<10; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println("continue문 사용 시 현재 i의 값 : " + i);
        }


//        문제 4) 구구단 전체를 출력하는 프로그램을 작성하세요.
//          - 조건1 : 사용자 입력으로 2 ~ 9 까지의 숫자를 하나 입력받기
//          - 조건2 : 사용자 입력으로 입력받은 단수에 break와 continue를 사용하는 구구단을 작성하세요.

        System.out.println("\n ----- break ----- \n");
        System.out.print("2~9 사이의 정수를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int scannum4_1 = scanner.nextInt();


        for (int i = 2; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            if(i == scannum4_1) {
                break;
            }
        }
//        -------- break 풀이 --------
        System.out.print("2~9 사이의 정수를 입력하세요 : ");
        int num = scanner.nextInt();

        for (int i=2; i<10; i++) {
            if(i == num) {
                break;
            }
            System.out.println("\n ----- " + i + "단 ----- \n");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }

        System.out.println("\n ----- continue ----- \n");
        System.out.print("2~9 사이의 정수를 입력하세요 : ");
        int scannum4_2 = scanner.nextInt();
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            if(i == scannum4_2) {
                continue;
            }
        }

//        ------- continue 풀이 -------
        System.out.print("2~9 사이의 정수를 입력하세요 : ");
        int num2 = scanner.nextInt();

        for (int i=2; i<10; i++) {
            if(i == num2) {
                continue;
            }
            System.out.println("\n ----- " + i + "단 ----- \n");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }
}
