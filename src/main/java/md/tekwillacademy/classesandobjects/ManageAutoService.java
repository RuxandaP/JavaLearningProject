package md.tekwillacademy.classesandobjects;

import md.tekwillacademy.classesandobjects.autoservicetask.Car;
import md.tekwillacademy.classesandobjects.autoservicetask.Garage;
import md.tekwillacademy.classesandobjects.autoservicetask.Person;
import md.tekwillacademy.classesandobjects.autoservicetask.Worker;

public class ManageAutoService {
    public static void main(String[] args) {

        Garage autoDocGarage;

        autoDocGarage = new Garage();

        autoDocGarage.address = "Stefan cel Mare nr 64";
        autoDocGarage.surfaceM2 = 450.0F;
        autoDocGarage.capacity = 50;

        System.out.println("Obiectul autoDocGarage are urmatoarele proprietati" + autoDocGarage.address + "   "
                + autoDocGarage.surfaceM2 + "   " + autoDocGarage.capacity);

        Garage garageIaloveni = new Garage();
        System.out.println("Obiectul garageIaloveni are urmatoarele proprietati" + garageIaloveni.address + "   "
                + garageIaloveni.surfaceM2 + "   " + garageIaloveni.capacity);

        Worker vasile = new Worker();

        vasile.name = "Vasile";
        vasile.age = 54;

        System.out.println( "Obiectul Vasile are numele de " + vasile.name + " si are " + vasile.age + " ani ");

        Worker ion = new Worker();
        System.out.println("Obiectul Vasile are numele de " + ion.name + " si are " + ion.age + " ani ");


        Person client1 = new Person( "+37301258458" );

        Car porscheNKK132 = new Car("Sgfcv52145", "Porsche Cayenne", client1);

        Car mercedesBenzTransit = new Car("HGGBV562145", "Mercedes", new Person("55124588"));

        System.out.println("Masina noastra este" + porscheNKK132.mark + " " + "si proprietarul poate fi apelat la " +
                porscheNKK132.owner.phoneNumber );
        System.out.println("Masina noastra este" + mercedesBenzTransit.mark + " " + "si proprietarul poate fi apelat la " +
                mercedesBenzTransit.owner.phoneNumber );




    }
}
