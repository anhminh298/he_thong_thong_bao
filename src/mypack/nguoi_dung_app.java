package mypack;

public class nguoi_dung_app implements thong_bao{
    private final String user;
    private final String ho_ten;

    public nguoi_dung_app(String user, String ho_ten) {
        this.user = user;
        this.ho_ten = ho_ten;
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("congrat user: " + user);
        System.out.println("xin chao " + ho_ten);
        System.out.println("ban da nhan duoc: " + message);
    }
}
