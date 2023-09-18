package md.tekwillacademy.classesandobjects.autoservicetask;

public class Car {

    public String vinCode;

    public String mark;

    public Person owner;

    public Car(String vinCodeInput, String mark, Person owner)

    {
        vinCode = vinCodeInput;
        this.mark = mark;
        this.owner = owner;
        System.out.println( "Now is a car un the service of type" + mark );
    }
}
