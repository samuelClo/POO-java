//import Board;
//import Submarine;
//import WarBoat;
import java.util.Scanner;


public class Main {
    private static Scanner s_Scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Board.s_jHeight = 20;
        Board.s_jWidth = 15;

        for (int i = 0; i < 2; i++) {
            var infos = Main.s_Scanner.nextLine();
            var infosArray = infos.split(",");

            if (i == 0) {
                WarBoat wb = new WarBoat(Integer.parseInt(infosArray[0]), Integer.parseInt(infosArray[1]), Integer.parseInt(infosArray[2]), infosArray[3]);
                System.out.println( wb.toString());
            } else {
                Submarine sub = new Submarine(Integer.parseInt(infosArray[0]), Integer.parseInt(infosArray[1]), Integer.parseInt(infosArray[2]), infosArray[3]);
                System.out.println( sub.toString());
            }

        }
    }

    public  String[] getScannerInfo(){
        var infos = Main.s_Scanner.nextLine();
        var infosArray = infos.split(",");
        return infosArray;
    }
}
//public class Main {
//    private static Scanner s_Scanner = new Scanner(System.in);
//
//
//    public static void main(String[] args) {
//        Board.s_jHeight = 20;
//        Board.s_jWidth = 15;
//
//        WarBoat wb = new WarBoat(4, 15, 20, Orientation.HORIZONTAL);
//        System.out.println( wb.toString());
//        Submarine sub = new Submarine(3, 5, 10, Orientation.VERTICAL);
//        System.out.println( sub.toString());
//    }
//
//    public static String[] getScannerInfo() {
//        var infos = Main.s_Scanner.nextLine();
//        var infosArray = infos.split(",");
//        return infosArray;
//    }
//}
