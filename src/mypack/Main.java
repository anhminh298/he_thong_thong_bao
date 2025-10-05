package mypack;

public class Main {
    public static void main(String[] args) {
        Notification_Center center = new Notification_Center();
        //dang ki su kien
        center.dang_ki("dam mr quang", noi_dung->{System.out.println("thong bao: " + noi_dung);});

        center.gui_thong_bao("dam mr quang", "dam duoc cho 50k");
    }
}
