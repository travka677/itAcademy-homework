package by.itAcademy.homework.les09.task4;
/*
4.	Из задания 5.3 реализовать класс вычислитель для вещественных и целых типов данных, используя параметризацию классов.
 */

public class Calculator<A extends Number, B extends Number> {
    private A arg1;
    private B arg2;

    public Calculator(A arg1, B arg2) throws NullPointerException {
        if (arg1 == null || arg2 == null) {
            throw new NullPointerException();
        }
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    public A getArg1() {
        return arg1;
    }

    public B getArg2() {
        return arg2;
    }

    public void setArg1(A arg1) {
        this.arg1 = arg1;
    }

    public void setArg2(B arg2) {
        this.arg2 = arg2;
    }

    public double sum() {
        return arg1.doubleValue() + arg2.doubleValue();
    }

    public double subtract() {
        return arg1.doubleValue() - arg2.doubleValue();
    }

    public double multiply() {
        return arg1.doubleValue() * arg2.doubleValue();
    }

    public double divide() {
        return arg1.doubleValue() / arg2.doubleValue();
    }
}
