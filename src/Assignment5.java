
/*
   @author Camila Arbaiza
   CSC 201-004N
   Professor Tanes Kanchanawanchai

   Assignment 5 problem 5.5

   The purpose of this program is to display two tables of conversion from kilograms to pounds and pounds to kilograms
   side by side

   */
public class Assignment5 {


    public static void main(String [] args) {

        final double NUMPOUNDSINKG = 2.2;
        final double NUMKIGSINPOUND = 0.4545;
        int counter1 = 1;   //increments by 2
        int counter2 = 20;  //increments by 5


        System.out.println("Kilograms\t Pounds\t|\tPounds\t Kilograms");

        //loop to display table of conversions
        while (counter1 < 200) {

            double conversionPounds = (double) counter1 * NUMPOUNDSINKG;
            double conversionKg = (double) counter2 * NUMKIGSINPOUND;


            System.out.printf(counter1 + "\t\t\t %.1f", conversionPounds);
            System.out.printf("\t|\t " + counter2 + "\t\t %.2f", conversionKg);
            System.out.println();

            counter1 += 2;
            counter2 += 5;
        }

    }//end main

    /**
     * displayConversions method to test
     * this method calculates the conversions from kg - pounds and pounds - kg
     * and displays a string with the answers
     * @param k1  number of kilograms to be converted to pounds
     * @param p2  number of pounds to be converted to kilograms
     * @return String
     */
        public static String displayConversions(int k1, int p2 ){

            final double POUNDSINKG = 2.2;
            final double KIGSINPOUND = 0.4545;

            double firstConv = (double) k1 * POUNDSINKG;
            double secondConv = (double) p2 * KIGSINPOUND;

            return (k1+" kilograms = "+firstConv+" pounds and "+p2+" pounds = "+secondConv+" kilograms");
        }//end displayConversions
}//end Assignment5 class


