package JavaFeatures;

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class Bank{

    public void checkBalance(Integer balance) throws CustomException{

            if(balance <= 0){
                throw new CustomException("Insufficient Balance");
            }else{
                System.out.println("Balance is " + balance);
            }
    }

    public static void main(String args[]) throws CustomException {
        Bank bank = new Bank();
        bank.checkBalance(10);
        bank.checkBalance(0);
    }
}
