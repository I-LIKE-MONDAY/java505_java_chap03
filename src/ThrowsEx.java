public class ThrowsEx {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        try {
            cal.sum("10a", "20");
            cal.sub("10a", "20");   // 실제 오류가 발생하는곳 : Calculator 클래스의 sub() 메소드
                                         // sub() 메소드 뒤에 붙은 throws Exception: 오류 발생시 실행부로 가서 오류처리를 하라는 의미.
        }
        catch (Exception e) {
            System.out.println("실행 시 오류가 발생했습니다.");
        }



    }
}
