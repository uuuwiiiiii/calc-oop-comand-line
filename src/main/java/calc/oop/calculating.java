package calc.oop;

public class calculating {
    private double firstNumber,secondNumber,result;
    private char operation;
    public calculating() {
        firstNumber=0;
        secondNumber=0;
        result=0;
    }

public void add(int a,int b,char oper){
    firstNumber=a;
    secondNumber=b;
    operation=oper;
}

public void printRes(){
    cal();
    System.out.print(result);
}

private void cal(){
    switch(operation) {
        case '+': {
            result = firstNumber + secondNumber;
            break;
        }
        case '-': {
            result = firstNumber - secondNumber;
            break;
        }
        case '*': {
            result = firstNumber * secondNumber;
            break;
        }
        case '/': {
            try {
                result = firstNumber / secondNumber;
            }
            catch(Exception e) {
                System.out.println("Warning! Exception has been thrown");
                return;
            }
        }
        default:
            break;
    }
}

}
