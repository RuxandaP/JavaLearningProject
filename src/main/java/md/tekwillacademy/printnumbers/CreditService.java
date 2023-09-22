package md.tekwillacademy.printnumbers;

public class CreditService {

    public static void main(String[] args) {

        int requestAmount = 100;
        double rate1 = 1.05;
        double rate2 = 1.045;
        double rate3 = 1.03;
        double amountToReturn = 0;
        if ((requestAmount > 0) && (requestAmount <= 20000)) {
            amountToReturn = requestAmount * rate1;
            System.out.println(amountToReturn);
        }else if (requestAmount <= 40000){
            amountToReturn = requestAmount * rate2;
        }else {
            amountToReturn = requestAmount * rate3;
        }

        System.out.println(amountToReturn);


    }
}
