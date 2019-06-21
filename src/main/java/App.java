import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        boolean isWork = true;

        System.out.println("Vvedite name");
        Dude dude = new Dude(in.next());
        Card card = Card.createCard(dude.name);
        dude.card = card;
        ATM atm = new ATM();

        while (isWork) {
            System.out.println("1 - Vstavte card\n2 - Exit");
            int choice = in.nextInt();
            if (choice == 1) {
                atm.putCard(dude.getCard());
                System.out.println("Vvedite pin");
                int pin = in.nextInt();
                if (atm.putPin(pin)) {
                    System.out.println("1 - Get Bablo\n2 - Put Bablo\n3 - Show Money On The Card\n4 - Exit");
                    choice = in.nextInt();
                    if (choice == 1) {

                        System.out.println("Skolko babla snyat");
                        int value = in.nextInt();
                        int cash = atm.getBablo(value);

                        if (cash > 0) {
                            dude.addCash(cash);
                        }
                    } else if (choice == 2) {
                        System.out.println("Skolko babla polozhit ?");
                        int cash = in.nextInt();
                        cash = dude.getCash(cash);
                        if (cash > 0) {
                            atm.putMoneyOnCard(cash);
                        }
                    } else if (choice == 3) {
                        System.out.println("1 - Na ekran\n2 - Na Chek");

                    } else {
                        isWork = false;
                    }
                }
            } else {
                isWork = false;
            }
        }
    }
}



