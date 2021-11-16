package by.itAcademy.homework.les04.task02;

public class CashMachineTest {
    public static void main(String[] args) {

        CashMachine cashMachine = new CashMachine(10,10,10);

//        cashMachine.setBanknote20(1);
//        cashMachine.setBanknote50(2);
//        cashMachine.setBanknote100(3);

        cashMachine.withdrawMoney(1260);

    }
}
