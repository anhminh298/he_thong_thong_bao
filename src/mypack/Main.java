package mypack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Notification_Center trung_tam = new Notification_Center();
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm người dùng Email");
            System.out.println("2. Thêm người dùng SMS");
            System.out.println("3. Thêm người dùng App");
            System.out.println("4. Gửi thông báo cho một người");
            System.out.println("5. Gửi thông báo cho tất cả");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Ho va ten: ");
                    String ho_ten = sc.nextLine();
                    trung_tam.add_user(email, new nguoi_dung_email(email, ho_ten));
                }
                case 2 -> {
                    System.out.print("SMS: ");
                    String sms = sc.nextLine();
                    System.out.print("Ho va ten: ");
                    String ho_ten = sc.nextLine();
                    trung_tam.add_user(sms, new nguoi_dung_SMS(sms, ho_ten));
                }
                case 3 -> {
                    System.out.print("Nickname: ");
                    String nickname = sc.nextLine();
                    System.out.print("Ho va ten: ");
                    String ho_ten = sc.nextLine();
                    trung_tam.add_user(nickname, new nguoi_dung_app(nickname, ho_ten));
                }
                case 4 -> {
                    System.out.print("Nhap nguoi can gui: ");
                    String key = sc.nextLine();
                    System.out.print("Nhap thong bao: ");
                    String thong_tin = sc.nextLine();
                    trung_tam.gui_thong_bao(key, thong_tin);
                }
                case 5 -> {
                    System.out.print("Nhap thong bao: ");
                    String thong_tin = sc.nextLine();
                    trung_tam.gui_all(thong_tin);
                }
                case 6 -> {
                    System.out.print("Chao tam biet!!!");
                    return;
                }
                default -> System.out.println("Vui long chon tu 1 den 6");
            }
        }
    }
}