package calculator;

import java.util.Scanner;

public class ViewCalculator {
    private final Scanner scanner = new Scanner(System.in);
    private final ICalculableFactory iCalculableFactory;
    public ViewCalculator(ICalculableFactory iCalculableFactory) {
        this.iCalculableFactory = iCalculableFactory;
    }
    public  void start() {
            System.out.println("Calculator complex numbers. Complex number example: 3+5i");
            Calculable calculable = iCalculableFactory.create(getNumber());
            while (true) {
                System.out.println("Enter command: (+,*,-,/,=) : ");
                String enter = scanner.nextLine().toLowerCase();
                switch (enter) {
                    case "+" -> calculable.add(getNumber());
                    case "*" -> calculable.mul(getNumber());
                    case "-" -> calculable.sub(getNumber());
                    case "/" -> calculable.div(getNumber());
                    case "=" -> {
                        System.out.println("Result: " + calculable.res());
                        System.out.println("Continue: (Y/N)?");
                        String cmd = scanner.nextLine().toUpperCase();
                        if (cmd.equals("Y")) {
                            calculable = iCalculableFactory.create(getNumber());
                        } else {
                            return;
                        }
                    }
                }
            }

    }

    private Complex getNumber() {
        System.out.print("Enter a complex number: ");
        String enter = scanner.nextLine();
        while (!enter.matches("^\\d+\\+\\d+i$")) {
            System.out.print(enter + " - You entered a non-complex number, please try again: ");
            enter = scanner.nextLine();
        }
        String[] array = enter.split("\\+");
        String real = array[0];
        String image = array[1].split("i")[0];
        return new Complex(Integer.parseInt(real), Integer.parseInt(image));
    }

}

