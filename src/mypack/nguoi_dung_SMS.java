package mypack;

public class nguoi_dung_SMS implements thong_bao {
    private final String sdt;
    private final String ho_ten;

    public nguoi_dung_SMS(String sdt, String ho_ten) {
        this.sdt = sdt;
        this.ho_ten = ho_ten;
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("to: " + sdt);
        System.out.println("xin chao " + ho_ten);
        System.out.println("ban da nhan duoc: " + message);
    }
}
