package model;

import java.util.ArrayList;
import util.FileHelper;
/*
  Tác giả: Nguyễn Tuấn Kiệt
*/
public class QLKhachHang {

    private ArrayList<KhachHang> dsKhachHang;

    public QLKhachHang() {
        dsKhachHang = new ArrayList<>();
    }

    public QLKhachHang(ArrayList<KhachHang> dsKhachHang) {
        this.dsKhachHang = dsKhachHang;
    }

    public ArrayList<KhachHang> getDsKhachHang() {
        return dsKhachHang;
    }

    public void setDsKhachHang(ArrayList<KhachHang> dsKhachHang) {
        this.dsKhachHang = dsKhachHang;
    }

    //sinh viên cải đặt cho các phương thức xử lý sau
   
    public void DocKhachHang(String filename) {
        ArrayList<String> input = FileHelper.readFileText(input.txt);
        dsKhachHang.clear();
        for (String item : input){
            String[] arr = item.split(";")
            KhachHang kh = new KhachHang();
            kh.setMaso(arr[01]);
            kh.setHoten(arr[1]);
            kh.setChisomoi(Double.parseDouble(arr[3]));
            kh.setChisocu(Double.parseDouble(arr[4])););
        }
    }

    public boolean GhiHoaDon(String filename) {
        
       return true;
    }
   
    public void sapXepTheoLoaiHinh() {
               
    }
    
    public double getTieuThuCaoNhat()
    {
      return 0;    
    }
    
    public double getTieuThuThapNhat()
    {
       return 0;  
    }
    
    public double getTieuThuTrungBinh()
    {
      return 0;   
    }
}
