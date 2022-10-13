public class Account {
    private long balance; //예금 금액들어가는 곳

    public Account() {
    } //있으나 없으나 동일

    public long getBalance() { //저장되어 있는 예금금액 가져오는 부분
        return balance;
    }

    public void deposit(int money) { // 기존 금액, 새로 받은 금액 더해줌
        balance += money; // 이름이 다르니까 this붙일 필요 없다.
    }

    public void withdraw(int money) throws BalanceInsufficientException{ //매개 변수로 받아온 값 처리(돈)
        if(balance < money){
//            예외처리가 없을 경우
//            System.out.println("출금 금액이 총 예금 금액보다 큽니다."); // 이렇게 하지 않아도 아래처럼 하면됨.

//            사용자 정의 예외를 사용함.
            throw new BalanceInsufficientException("잔고 부족 : " + (money - balance) + "원 모자람");
//            throw로 강제로 예외발생 -> new 매개변수로 메세지 발생.
//            원래 이곳에 try catch 해야함.
        }
        balance -= money;

//    try{
//        public void withdraw ( int money) throws BalanceInsufficientException { //매개 변수로 받아온 값 처리(돈)
//        if (balance < money) {
//            throw new BalanceInsufficientException("잔고 부족 : " + (money - balance) + "원 모자람");
////            throw로 강제로 예외발생 -> new 매개변수로 메세지 발생.
////            원래 이곳에 try catch 해야함.
//        }
//        balance -= money;
//    }
//    catch(Exception e) {
//        System.out.println("dd");
//    }
    }
}