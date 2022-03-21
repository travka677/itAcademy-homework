package by.itAcademy.homework.les09_generic.task4;

public class Main {
    public static void main(String[] args) {

        try {
            Calculator<Double, Integer> calculator = new Calculator<>(3.2, 17);

            System.out.printf(calculator.getArg1() + " + " + calculator.getArg2() + " = %.2f", calculator.sum());
            System.out.printf("\n" + calculator.getArg1() + " - " + calculator.getArg2() + " = %.2f", calculator.subtract());
            System.out.printf("\n" + calculator.getArg1() + " * " + calculator.getArg2() + " = %.2f", calculator.multiply());
            System.out.printf("\n" + calculator.getArg1() + " / " + calculator.getArg2() + " = %.2f", calculator.divide());
        } catch (NullPointerException ex) {
            System.err.println("Arguments can't be null");
        }


    }
}
