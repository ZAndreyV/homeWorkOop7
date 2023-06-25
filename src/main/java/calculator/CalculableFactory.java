package calculator;

public class CalculableFactory implements ICalculableFactory{
    public Calculable create(Complex arg) {
        return new Calculator(arg);
    }


}
