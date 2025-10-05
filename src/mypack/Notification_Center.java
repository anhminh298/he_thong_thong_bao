package mypack;

import java.util.HashMap;
import java.util.Map;

public class Notification_Center {
    //hashmap = anh xa
    //tao ds nguoi dung
    private final Map<String, thong_bao> ds_nguoi_dung = new HashMap<>();

    public void add_user(String key, thong_bao nguoi_dung) {
        //them nguoi dung vao map va luu vao key
        ds_nguoi_dung.put(key, nguoi_dung);
        System.out.println("da them nguoi dung! " + key);
    }

    public void gui_thong_bao(String key, String thong_tin) {
        //lay key cua nguoi dung
        thong_bao nguoi_dung = ds_nguoi_dung.get(key);
        //kt rong va gui thong bao cho 1 nguoi
        if (nguoi_dung != null) {
            nguoi_dung.receiveNotification(thong_tin);
        } else {
            System.out.println("khong tim thay nguoi dung!");
        }
    }

    public void gui_all(String thong_tin) {
        //for la de lay het user co trong map
        for (thong_bao nguoi_dung : ds_nguoi_dung.values()) {
            nguoi_dung.receiveNotification(thong_tin);
        }
    }
}
