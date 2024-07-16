package calc.oop;

public class calculating {
    private double firstNumber, secondNumber, result;
    private char operation;

    public calculating() {
        firstNumber = 0;
        secondNumber = 0;
        result = 0;
    }

    public void add(int a, int b, char oper) {
        firstNumber = a;
        secondNumber = b;
        operation = oper;
    }

    public void printRes() {
        cal();
        System.out.print(result);
    }

    private void plus() {
        result = firstNumber + secondNumber;
    }

    private void minus() {
        result = firstNumber - secondNumber;
    }

    private void mult() {
        result = firstNumber * secondNumber;
    }

    private void devide() {
        result = firstNumber / secondNumber;
    }

    private void cal() {
        switch (operation) {
            case '+': {
                plus();
                break;
            }
            case '-': {
                minus();
                break;
            }
            case '*': {
                mult();
                break;
            }
            case '/': {
                try {
                    devide();
                } catch (Exception e) {
                    System.out.println("Warning! Exception has been thrown");
                    return;
                }
            }
            default:
                break;
        }
    }

}
