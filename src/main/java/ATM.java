public class ATM {
    Card slotCard;
    int cash;
    int pin;

    public void putCard(Card card) {
        slotCard = card;

    }

    public boolean putPin(int pin) {

        return slotCard.pin == pin;
    }

    public int getBablo(int cash) {
        int value = cash;
        this.cash = this.cash - cash;
        System.out.println("Bankomat otdal " + cash);


        return value;
    }

    public void putMoneyOnCard(int cash) {
        slotCard.cash = slotCard.cash + cash;
        System.out.println("Polozhil na card " + cash);

//
    }
}
