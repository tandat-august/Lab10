/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlab10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author levan
 */
public class DanhSachSinhVien {

    ArrayList<ThanhVien> arr = new ArrayList<>();

    // them moi 
    public void themMoi(ThanhVien tv) {
        arr.add(tv);
    }

    // luong max
    public double luongMax() {
        double max = 0;
        for (ThanhVien tv : arr) {
            if (tv.tinhThuong() > max) {
                max = tv.tinhThuong();
            }
        }
        return max;
    }

   public  ArrayList<ThanhVien> layDSLuongMax(){
       ArrayList<ThanhVien> b =  new ArrayList<>();
       for(ThanhVien tv : arr){
          if(tv.tinhThuong() == luongMax()){
              b.add(tv);
          }
       }
        return b;
   }
    // xoa theo ma 
    public boolean xoaTheoMa(String ma) {
        for (ThanhVien tv : arr) {
            if (tv.getMa().equalsIgnoreCase(ma)) {
                arr.remove(tv);
            }
            return true;
        }
        return false;

    }

    // tim kiem theo ma
    public ThanhVien timKiem(String ma) {
        for (ThanhVien tv : arr) {
            if (tv.getMa().equalsIgnoreCase(ma)) {
                return tv;
            }
        }

        return null;

    }

    // sap xep theo tien thuong 
    public void sapXepTheoTienThuong() {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j > arr.size(); j++) {
                ThanhVien a = arr.get(j);
                arr.set(i, arr.get(j));
                arr.set(j, a);
            }

        }
    }
    //doc file 
    public void docFile (String tenFile){
        try {
            FileReader fr = new FileReader(tenFile);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {                
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String s[] = line.split(",");
                String ma = s[1];
                String hoVaTen = s[2];
                Date ngaySinh = ThanhVien.chuyenChuoiThanhNgay(s[3]);
                String namHoc = s[4];
                if(s[0].equalsIgnoreCase("GIang Vien")){
                    int soBaiBao = Integer.parseInt(s[5]);
                    int soDeTai = Integer.parseInt(s[6]);
                    GiangVien gv = new GiangVien(soBaiBao, soDeTai, ma, ma, ngaySinh, namHoc);
                    themMoi(gv);
                }
                else {
                   float diemTB = Float.parseFloat(s[7]);
                   SinhVien sv = new SinhVien(diemTB, ma, ma, ngaySinh, namHoc);
                    themMoi(sv);
                }
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
    }
    
}
