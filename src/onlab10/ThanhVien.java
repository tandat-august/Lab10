/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlab10;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author levan
 */
public abstract class ThanhVien implements IThanhTien{
    private String ma;
    private String ten;
    private Date ngaySinh;
    private String namHoc;

    public ThanhVien() {
    }

    public ThanhVien(String ma, String ten, Date ngaySinh, String namHoc) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.namHoc = namHoc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    @Override
    public String toString() {
        return "ThanhVien{" + "ma=" + ma + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", namHoc=" + namHoc + '}';
    }

    ThanhVien get(int j) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static Date chuyenChuoiThanhNgay(String str){
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(str);
        } catch (Exception e) {
        }
        return null;
        
    }
    public static String chuyenNgayThanhChuoi(Date ngay){
        return new SimpleDateFormat("dd/MM/yyyy").format(ngay);
    }
}
