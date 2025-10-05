package mypack;

//static la de su nhieu lan

public class nguoi_dung_email implements thong_bao {
    //khai bao bien
    private final String email;
    private final String ho_ten;
    //ham xay dung
    public nguoi_dung_email(String email, String ho_ten) {
        this.email = email;
        this.ho_ten = ho_ten;
    }

    @Override
    public void receiveNotification(String message) { //nguoi dung nhan duoc email
        System.out.println("email to: " + email);
        System.out.println("xin chao " + ho_ten);
        System.out.println("ban da nhan duoc: " + message);
    }

}
