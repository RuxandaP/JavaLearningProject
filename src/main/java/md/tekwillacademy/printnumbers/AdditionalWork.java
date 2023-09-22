package md.tekwillacademy.printnumbers;

public class AdditionalWork {
    public static void main(String[] args) {

//        int min = 1;
 //       int max = 1000;

//        //for(int i = min; i < 1000; i++){
//
//            if((i % 5 == 0) || (i % 3 == 0)) {
//                System.out.println(i);
//            }
//        }

//        int a = 5;
//        int sum = 0;
//
//        for(int i = 0; i<=a; i++){
//
//            sum = sum + i;
//            System.out.println("Iteratia:" + i + " valoarea sumei este:" + sum);
//        }
//        System.out.println(sum);


        // Printeaza suma numerelor divizibile la 4
//        int b  = 100;
//        int sum = 0;
//
//        for (int i = 0; i<=b; i++){
//
//            if (i % 4 == 0){
//                System.out.println(i);
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);


        // produsul numerelor pare de la 1 pana la 20

        int a = 4;
        int total = 1;

        for (int i = 1; i <= a; i++){

            if (i % 2 == 0){

                System.out.println(i);
                total *= i;
            }
        }

        System.out.println(total);

    }
}
