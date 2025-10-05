package mypack;
//lop cha
//implements la ke thua nhung can override
public class quan_li_nguoi_dung implements thong_bao {
    //khai bao bien
    private final String user_infor;
    private final String ho_ten;
    //ham xay dung
    public quan_li_nguoi_dung(String user_infor, String ho_ten) {
        this.user_infor = user_infor;
        this.ho_ten = ho_ten;
    }

    @Override  //ghi de phuong thuc lop thong bao
    public void receiveNotification(String message) {   //nguoi dung nhan duoc email
        System.out.println("to: " + user_infor);
        System.out.println("xin chao " + ho_ten);
        System.out.println("ban da nhan duoc: " + message);
        System.out.println("-------------------------");
    }
}
