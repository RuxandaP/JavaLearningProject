package md.tekwillacademy.accessmodifiers;

import md.tekwillacademy.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {

    public static void main(String[] args) {

       Person cristina = new Person();
        System.out.println(cristina.isRetired);

        cristina.isRetired = true;

        if(cristina.isRetired){
            System.out.println("Cristina is retired");}

        else {
                System.out.println("Cristina is not retired");
            }

        Person eliza = new Person(5214588, "Eliza", "married", true);

        System.out.println("Available info about eliza:" +eliza.isRetired);

        if(eliza.isRetired){
            System.out.println("Eliza is retired");}

        else {
            System.out.println("Eliza is not retired");
        }

        Person marcel = new Person(5214586, "Marcel");

        System.out.println("Available info about Marcel: " + marcel.isRetired);

        if(marcel.isRetired){
            System.out.println("Marcel is retired");}

        else {
            System.out.println("Marcel is not retired");
        }

        System.out.println(Person.hasHeart);
    }
}
