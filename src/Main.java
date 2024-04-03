import mainmenu.RoomMain;
import mainmenu.UserMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    RoomMain.addNewRoom();
                    break;
                }
                case 2: {

                    break;
                }
                case 3: {
                    UserMain.login();
                }
                case 4: {
                    UserMain.register();
                }
                case 0: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Không hợp lệ");
                }
            }
    }
}