package md.tekwillacademy.operationsandciclicfunctions;

public class LogicalOperations {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = a&&b;

        System.out.println(c);
        System.out.println(!c);

        boolean d = !((a && b) && (a || b));
        System.out.println(d);
    }
}
