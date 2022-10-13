//    사용자 정의 예외
public class BalanceInsufficientException extends Exception { // 상속받음
//    사용자 정의 예외

    public BalanceInsufficientException(){} //기본생성자

    public BalanceInsufficientException(String message){ //생성자 오버로딩으로 여러 개 사용가능
        super(message); //상속을 받았을 때 부모 클래스의 생성자를 가져오는 것. 받은 메세지를 exception에 넘겨줌
    }
}