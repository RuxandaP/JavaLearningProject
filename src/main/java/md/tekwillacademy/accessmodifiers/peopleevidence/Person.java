package md.tekwillacademy.accessmodifiers.peopleevidence;

public class Person {

    // Static class variable
    public static boolean hasHeart = true;

    // Instance variable because it defines the objects of person class
    private long idnp;

    //Default - Instance variable
    String maritalStatus;

    //Protected - instance variable
    protected String name;

    //Public- instance variable
    public boolean isRetired;

    public Person() {

        System.out.println("This is a defined constructor without params");
    }

    public Person(long idnp, String name) {

        this.idnp = idnp;
        this.name = name;
        System.out.println("This is a defined constructor with 2 params");
    }

    public Person(long idnp, String name, String maritalStatus, boolean isRetired) {

        this.idnp = idnp;
        this.maritalStatus = maritalStatus;
        this.name = name;
        this.isRetired = isRetired;

        System.out.println("This is a defined constructor will all params");

    }
}
