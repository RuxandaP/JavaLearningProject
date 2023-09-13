package md.tekwillacademy.variablesprogramme;

public class VariablesAndComments {
    public static void main(String[] args) {
        // Declare the variables
        //Truth based variables
        boolean isUsed;
        boolean hasBattery;
        boolean isAndroid;
        boolean isBlocked;

        // Char related
        char condition;

        // Numeric related
        byte numberOfSimCards;
        byte randomAccessMemory;
        short productionYear;
        int numberOfOwners;
        long id;
        float operatingSystemVersion;
        double price;

        // Initialize an iPhone

        isUsed = false;
        hasBattery = true;
        isAndroid = false;
        isBlocked = false;

        condition = 'A';

        numberOfSimCards = 2;
        randomAccessMemory = 4;
        productionYear = 2023;
        numberOfOwners = 0;
        id = 5214558658885L;
        operatingSystemVersion = 16.16F;
        price = 345265.5;

        System.out.println("The phone is charged" + isBlocked);
        System.out.println("The phone price is" + price);

    }

}
