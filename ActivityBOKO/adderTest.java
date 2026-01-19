package ActivityBOKO;

import java.util.Scanner;
public class adderTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        adder a = new adder();

        System.out.print("Enter first number: ");
        a.setNum1(input.nextInt());

        System.out.print("Enter second number: ");
        a.setNum2(input.nextInt());
        System.out.println("Sum = " + a.add());

        input.close();
    }
}
