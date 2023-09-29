package md.tekwillacademy.methodstask;

public class ExecutionService {

    public static void main(String[] args) {
        System.out.println(DataGeneratorUtil.getRandomInt(20,100));
        System.out.println(DataGeneratorUtil.getRandomInt(100,120));
        System.out.println(DataGeneratorUtil.getRandomInt(120,100));

        int randomInt = DataGeneratorUtil.getRandomInt(50);
        System.out.println(randomInt);

        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));


        Customer customer1 = new Customer("Fat Frumos", "masculin", 658254);

        String infoAboutCustomer1 = customer1.toString();
        System.out.println(infoAboutCustomer1);

        customer1.setAge(95);
        System.out.println(customer1.toString());

        customer1.setName("Fat Cosanzeana");
        System.out.println(customer1.toString());

        System.out.println("Farsta lui Fat este:" + customer1.getAge());
        System.out.println("Varsta lui fat este:" + customer1.getName());

        Customer customer2 = new Customer ("Elena Cosanzeana", "F", 18);
        System.out.println(customer2.toString());


        System.out.println(DataGeneratorUtil.getRandomEmail(15, "mailinator.com"));



    }
}
