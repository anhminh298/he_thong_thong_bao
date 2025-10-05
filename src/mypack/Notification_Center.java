package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Notification_Center {

//    private final List<thong_bao> subscribe = new ArrayList<>();
//
//    public void addSubscribe(thong_bao subscribe) {
//        subscribe.add(subscribe);
//    }
//
//    public void removeSubscribe(thong_bao subscribe) {
//        subscribe.remove(subscribe);
//    }

    //cai trong map la tao 1 danh sach su kien va nguoi dung
    private Map <String, List<xu_li_thong_bao>> nguoi_dung = new HashMap <> ();

    public void dang_ki(String su_kien, xu_li_thong_bao thongBao) {
        //neu co nguoi dang ki thi lay ten sk, neu khong thi nothing
        if(!nguoi_dung.containsKey(su_kien)) {
            //dat su kien
            nguoi_dung.put(su_kien, new ArrayList<>());
        }
        //them nguoi dung vao su kien va nhan duoc thong bao
        nguoi_dung.get(su_kien).add(thongBao);
    }

    //gui cho tat ca
    public void gui_thong_bao(String su_kien, String noi_dung) {
        if(nguoi_dung.containsKey(su_kien)) {
            List<xu_li_thong_bao> ds_thongBao = nguoi_dung.get(su_kien); //lay ds nguoi dung
            for(xu_li_thong_bao thongBao : ds_thongBao) {
                thongBao.xu_li_thong_bao(noi_dung);
            }
        }

    }
}
