
// Exercise 6.9
public class loopPracticeTwo {

    public void loopOne() {
        /*
         * Pseudocode:
         * Repeat for each row from 0 to 7
         * Print (row number + 1) '#' characters
         * Move to the next line
         */

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j < i + 1; j++) 
                System.out.print("#");
                System.out.println();

            }

        }

    

    public void loopTwo() {
        /*
         * Pseudocode:
         * Start with the first row
         * While there are rows left to print
         * Print '#' characters equal to the current row number + 1
         * Move to the next line
         * Go to the next row
         */
        int i = 0;

        while (i <= 7) {
            int j = 0;

            while (j <= i) {
                System.out.print("#");
                j++;
            }

            System.out.println();
            i++;
        }
    }

    public void loopThree() {
        /*
         * Pseudocode:
         * Start with the first row
         * Do the following at least once:
         * Print '#' characters equal to the current row number + 1
         * Move to the next line
         * Increase the row number
         * Continue until all 8 rows have been printed
         */
        int i = 0;

        do {

            int j = 0;

            do {
                System.out.print("#");
                j++;
            } while (j <= i);

            System.out.println();
            i++;

        } while (i <= 7);
    }

    public static void main(String args[]) {

        loopPracticeTwo test = new loopPracticeTwo();
        test.loopOne();
        test.loopTwo();
        test.loopThree();

    }
}