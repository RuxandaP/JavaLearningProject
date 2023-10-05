package md.tekwillacademy.exceptionsservicetask;

public class ExceptionMicroservice {

    public static void main(String[] args) {

        String controlVariable = null;

        System.out.println("The string legth it is = " + TextManager.getTheTextLengthWithTryAndCatch(controlVariable));
        System.out.println("The string legth it is = " + TextManager.getTheTextLength("Ruxanda"));
        System.out.println("The string legth it is = " + TextManager.getTheTextLengthWithIf(controlVariable));

        System.out.println(ArithmeticOperationService.divideWithoutExceptionHandling(0,2));
        System.out.println(ArithmeticOperationService.divideWithExceptionHandling(0,0));

        System.out.println("The show must go on");
    }
}
