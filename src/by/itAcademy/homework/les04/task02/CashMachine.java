package by.itAcademy.homework.les04.task02;

// 2. Создать класс, описывающий банкомат.
// Набор купюр, находящихся в банкомате должен задаваться тремя свойствами:
// количеством купюр номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат.
// Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность выполнения операции.
// При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
// Создать конструктор с тремя параметрами - количеством купюр каждого номинала.

public class CashMachine {

    private int amountOf_20;
    private int amountOf_50;
    private int amountOf_100;

    private final int banknote_20 = 20;
    private final int banknote_50 = 50;
    private final int banknote_100 = 100;


    public CashMachine(int amountOf_20, int amountOf_50, int amountOf_100) {
        this.amountOf_20 = amountOf_20;
        this.amountOf_50 = amountOf_50;
        this.amountOf_100 = amountOf_100;
    }

    public void setAmountOf_20(int amount) {
        amountOf_20 += amount;
    }

    public void setAmountOf_50(int amount) {
        amountOf_50 += amount;
    }

    public void setAmountOf_100(int amount) {
        amountOf_100 += amount;
    }

    public boolean withdrawMoney(int sum) {

        int maxAmount = amountOf_20 * banknote_20 + amountOf_50 * banknote_50 + amountOf_100 * banknote_100;
        System.out.println("Запрашиваемая сумма денег: " + sum);

        if (sum < 20 || sum > maxAmount) {
            if (sum < 20) {
                System.out.println("Минимальная сумма вывода 20 р");
            }
            if (sum > maxAmount) {
                System.out.println("Недостаточно денег");
            }
            return false;
        }

        for (int i = 0; i <= amountOf_20; i++){
            for (int x = 0; x <= amountOf_50; x++){
                for (int y = 0; y <= amountOf_100; y++){
                    if (isAcceptable(i, x, y, sum)) {
                        amountOf_20 -= i;
                        amountOf_50 -= x;
                        amountOf_100 -= y;

                        return cashOut(i, x, y);
                    }
                }
            }
        }
        System.out.println("В банкомате нет подходящих купюр.");
        return false;
    }

    private boolean cashOut(int i, int j, int x) {
        System.out.print("Выведено: " + (x * banknote_100 + j * banknote_50 + i * banknote_20) + "\n" +
                x + " номиналом 100р \n" +
                j + " номиналом 50 рублей \n" +
                i + " номиналом 20 рублей. \n");

        return true;
    }

    private boolean isAcceptable(int numOfBanknote_20, int numOfBanknote_50, int numOfBanknote_100, int amount) {
        int checkedAmount = numOfBanknote_20 * banknote_20 + numOfBanknote_50 * banknote_50 + numOfBanknote_100 * banknote_100;
        return checkedAmount == amount;
    }
}