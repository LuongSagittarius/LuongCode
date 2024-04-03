package mainmenu;

import java.util.Scanner;
public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. đăng nhập");
            System.out.println("2. đăng ký");
            System.out.println("0. thoát chương trình");

            String input = sc.nextLine();
            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số.");
                continue;
            }

            switch (choice) {
                case 1: {
                    UserMain.login();
                }
                case 2: {
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
}
