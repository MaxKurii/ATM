public class Dude {
    Card card;
    String name;
    int cashRuki;

    public Dude(String next) {
        name = next;
        System.out.println("Privet " + name);
    }


    public Card getCard() {
        return card;
    }

    public void addCash(int cash) {
        cashRuki = cashRuki + cash;
        System.out.println("Snyal v karman " + cash);


    }

    public int getCash(int cash) {
        cashRuki = cashRuki - cash;
        return cash;
    }

}
