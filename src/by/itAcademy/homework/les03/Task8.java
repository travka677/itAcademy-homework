package by.itAcademy.homework.les03;

// 8.* Написать программу, перемешивающую и печатающую список карт в колоде.
//      Воспользоваться результатом предыдущей задачи.

public class Task8 {
    public static void main(String[] args) {

        String[] suits = { "Hearts", "Clubs", "Spades", "Diamonds" };
        String[] cards = { "Jack", "Queen", "King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

        String[] deck = new String[suits.length * cards.length];

        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = suits[j] + " of " + cards[i];
            }
        }

        for (int i = 0; i < deck.length; i++) {
            // смысл в том, что рандомная карта выбирается из тех карт, которые еще не выбирались
            int r = i + (int)(Math.random() * (deck.length-i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }
    }
}
