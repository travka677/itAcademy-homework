package by.itAcademy.homework.les03;

// 8.* Написать программу, перемешивающую и печатающую список карт в колоде.
//      Воспользоваться результатом предыдущей задачи.

public class Task8 {
    public static void main(String[] args) {

        String[] suits = { "Hearts", "Clubs", "Spades", "Diamonds" };
        String[] cards = { "Jack", "Queen", "King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

        String[] deck = new String[suits.length * cards.length];
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                deck[index++] = suits[i] + " of " + cards[j];
            }
        }

        for (int i = 0; i < deck.length; i++) {
            int randIndex = (int)(Math.random() * deck.length);
            deck[i] = deck[randIndex];
        }

        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }
    }
}
