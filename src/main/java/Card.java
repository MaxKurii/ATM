import java.util.Random;

public class Card {
    String cardNumber;
    String cardHoldevName;
    int pin;
    int cash;

    public Card(String name) {
        cardHoldevName = name;
        pin = new Random().nextInt(9999);
        System.out.println("PinCard "+ pin);
    }

    public static Card createCard(String name) {
        return new Card(name);

    }
}