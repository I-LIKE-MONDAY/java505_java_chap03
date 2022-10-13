import java.io.*;
import java.util.Scanner;

public class TryCatchEx {
    public static void main(String[] args) {

//        NullPointerException 예외처리
        try {   // try 내부 :  에러가 발생할 수 있는 코드
            String data = null;
            System.out.println(data.toString());
        }
        catch (Exception e) {
            System.out.println("null인 빈 데이터에서는 toString() 메서드를 사용할 때 NullPointException 오류가 발생합니다.");
        }
        
//        ArrayIndexOutOfBoundsException 예외처리
        try {
            String data1 = args[0];
            String data2 = args[1];

            System.out.println("args[0] : " + data1);
            System.out.println("args[1] : " + data2);
        }
        catch (Exception e) {
            System.out.println("배열의 최대 index 범위를 넘어서 사용 :  ArrayIndexOutOfBoundsException 오류 발생");
        }

//       ㅡㅡㅡㅡㅡㅡㅡ[ 다중 catch ]ㅡㅡㅡㅡㅡㅡㅡ
        try {
//        NumberFormatException 발생
            String data1 = "100";
            String data2 = "a100";

            int value1 = Integer.parseInt(data1);   // 문자열 -> 정수로
            int value2 = Integer.parseInt(data2);   // 오류 발생부분

            int result = value1 + value2;
            System.out.println(data1 + " + " + data2 + " = " + result);
        }
//        예외처리를 하나로 모두 처리하면 Exception을 사용하면 됨(Exception e)
//        지정한 예외 상황만 처리하고자 하면 해당 예외클래스를 사용해야함.
        catch (NumberFormatException e) {
            System.out.println("정수로 변환할 수 없습니다.");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            // e.printStackTrace();
        }
//        다중 catch
//        하나의 try 구문에서 여러개의 지정된 예외처리를 하고자 하면 catch를 여러개 사용할 수 있음.
        catch (NullPointerException e) {
            System.out.println("null을 사용하여 진행할 수 없습니다.");
        }
//        Exception 클래스는 모든 예외 클래스의 최상위 클래스이므로 여러개의 catch문을 사용할 경우 가장 마지막에 입력해야 함
        catch (Exception e) {
            System.out.println("알 수 없는 오류가 발생했습니다.");
        }

        System.out.println();


//       ㅡㅡㅡㅡㅡㅡㅡ[ finally ]ㅡㅡㅡㅡㅡㅡㅡ

//        finally : try ~ catch 구문에서 예외가 발생하던 발생하지 않던, 무조건 실행되어야 하는 소스코드를 입력하는 부분을 finally라고 함
//                  주로 외부 리소스(파일, 네트워크 연결 등) 사용 시 해당 리소스를 해제하기 위한 목적으로 많이 사용함
//                  (외부 리소스에는 가비지 컬렉터;비사용 메모리 자동 해제 작동X)
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("문자를 입력해주세요 : ");
            String data = scanner.nextLine();

            if (data.equals("")) {
                data = null;
            }

            System.out.println("입력된 내용 : " + data.toString());
            System.out.println("여기는 정상 실행 완료 후 실행되는 부분입니다.");
        }
        catch (NullPointerException e) {
            System.out.println("여기는 예외 발생 시 실행되는 부분입니다.");
            System.out.println("예외 이유 : " + e.getMessage());
        }
        finally {
            System.out.println("여기는 무조건 실행되는 부분입니다.");
        }

        System.out.println("try ~ catch 가 완료된 후 실행되는 부분입니다.");

        System.out.println("\n\n");

//        파일 생성을 통해 finally 테스트
        File file = new File("c:\\test.txt");
        String str = "java file write test";

        try {   // 파일 생성
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(str);
            writer.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("파일 쓰기 사용 시 오류가 발생했습니다.");
        }


        System.out.println("파일 쓰기 완료");

        System.out.println("\n----- 파일 읽기 시작 -----\n");

        FileReader fr = null;
        BufferedReader reader = null;
        try {
            fr = new FileReader("c:\\test.txt");    // 파일 객체를 읽어옴
            reader = new BufferedReader(fr);                // 파일 내용을 읽음

            String tmp; // 글자 읽어오는부분이 저장됨

            while ((tmp = reader.readLine()) != null) { // 한줄씩 읽어와서 tmp에 저장하고 , 그 부분이 null과 같지않으면 while문 실행
                System.out.println("파일 내용 >> " + tmp);
            }
        }
        catch (IOException e) {
            System.out.println("파일 사용 시 오류가 발생했습니다.");
            System.out.println(e.getMessage());
        }

        finally {
            try {
                if (reader != null) reader.close();
                if (fr != null) fr.close();
            }
            catch (Exception e) {
            }
        }
        System.out.println("\n파일 읽기 완료\n");
    }
}
