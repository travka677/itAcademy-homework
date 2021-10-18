package by.itAcademy.homework.les03;

// 7. Написать программу, эмулирующую выдачу случайной карты из колоды в 52 карты.

public class Task7 {
    public static void main(String[] args) {

        String[] suits = { "Hearts", "Clubs", "Spades", "Diamonds"};
        String[] cards = { "Jack", "Queen", "King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

        int randIndex1 = (int)(Math.random() * cards.length);
        int randIndex2 = (int)(Math.random() * suits.length);

        String str = cards[randIndex1] + " of " + suits[randIndex2];

        System.out.println(str);
    }
}
