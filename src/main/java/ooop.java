//import java.util.Scanner;
//
//public class ooop {
//    static Scanner in = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        boolean isWork = true;
//
//        System.out.println("Vvedite Name");
//        Dude dude = new Dude();
//        ATM atm = new ATM();
//
//
//        while (isWork){
//            System.out.println("1 - Vsatvte cartu\n2 - Vuiti");
//            int choise = in.nextInt();
//            if(choise == 1){
//                atm.putCard(dude.GetCard());
//                System.out.println("Vvedite pin");
//                int pin = in.nextInt();
//                if(atm.putPin(pin)){
//                    System.out.println("1 - Get Bablo\n 2 - Put Bablo\n3 - Show Money On The Card\n 4 - Exit");
//                    choise = in.nextInt();
//                    if(choise == 1){
//                        int cash = atm.getBablo(value);
//                        if(cash > 0){
//                            dude.addCash(cash);
//                        }
//                    }else if(choise == 2){
//                        System.out.println("Skolko babla polozhit'");
//                        int cash = in.nextInt();
//                        cash = dude.getCash(cash);
//                        if(cash > 0){
//                            atm.putMoneyOnCard(cash);
//                        }
//                    }else{
//                        isWork = false;
//                    }
//                }
//            }else {
//                isWork = false;
//            }
//        }
//    }
//}
