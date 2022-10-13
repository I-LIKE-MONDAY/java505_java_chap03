public class TryWithResourceEx {
    public static void main(String[] args) {

//        try-with-resources
        try (FileInputStream fis = new FileInputStream("file.txt")) {   // 선언과 동시에 객체 생성(try 구문 안에서만 사용되고 끝나면 삭제됨)
            fis.read();
            throw new Exception();  // 예외 강제 발생 ->
                                    // FileInputStream가 AutoCloseable에서 상속받아 오버라이드한 close가 실행이 됨.
                                    // finally를 사용하지 않아도 콘솔창에 file.txt을 닫습니다. 가 뜸.
        }
        catch (Exception e) {
            System.out.println("예외처리 코드가 실행되었습니다.");
        }
    }
}
