/*
 6.8 Write three different loops—a for loop, a while loop, and a
do-whileloop—to print the following sequence of numbers: 45, 36, 27, 18, 9, 0,
−9,−18,−27,−36,−45.
 */

public class loopPractice {

    // for loop

    public void loopOne(int intArr[]) {
        for (int i = 45; i >= -45 && i <= 45; i -= 9) {
            System.out.println(i);
        }
    }

    // while loop

    public void loopTwo(int intArr[]) {
        int i = 45;

        while (i >= -45 && i <= 45) {
            System.out.println(i);
            i -= 9;
        }
    }

    // do while loop

    public void loopThree(int intArr[]) {
        int i = 45;

        do {
            System.out.println(i);
            i -= 9;
        } while (i >= -45 && i <= 45);

    }

    public static void main(String args[]) {
        int arr[] = { 45, 36, 27, 18, 9, 0, -9, -18, -27, -36, -45 };

        loopPractice test = new loopPractice();

        test.loopOne(arr);
        test.loopTwo(arr);
        test.loopThree(arr);

    }
}
