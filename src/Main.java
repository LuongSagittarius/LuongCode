import mainmenu.UserMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. đăng nhập");
            System.out.println("2. đăng ký");
            System.out.println("0. thoát chương trình");

            int choice = sc.nextInt();
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