package md.tekwillacademy.operationsandciclicfunctions;

public class AssignmentOperations {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        a = a + 1;
        System.out.println(a);

        b = b % a;
        System.out.println(b);

        a %= b;
        // a = a % B; a = 11 % 4;
        System.out.println(a);

// Calculate the sum of the numbers till x

        int x = 5;
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        System.out.println(sum);

        int c = 45;
        double d = 5;
        d /= c;
        double result = d /c;
        System.out.println(d);
    }
}
