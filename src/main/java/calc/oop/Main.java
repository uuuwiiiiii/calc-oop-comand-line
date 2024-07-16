package calc.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber;
        char operation;
        try (Scanner scanner = new Scanner(System.in)) {
            firstNumber = scanner.nextInt();
            operation = scanner.next().charAt(0);
            secondNumber = scanner.nextInt();
        }
        catch(Exception e) {
            System.out.println("It's not correct expression");
            return;
        }
        calculating calc= new calculating();
        calc.add(firstNumber, secondNumber, operation);
        calc.printRes();
    }
    //ashdajsdhahjsdjahsdhjashdasjdhja
    //asdhajsdhahsdh
    ////a/das/d/a/sd/as/das/d/a/sd/a/sda/sd/as/d/as/d
}