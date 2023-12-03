/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlab10;

import java.util.Date;

/**
 *
 * @author levan
 */
public class SinhVien extends ThanhVien {

    private float diemTB;

    public SinhVien() {
    }

    public SinhVien(float diemTB, String ma, String ten, Date ngaySinh, String namHoc) {
        super(ma, ten, ngaySinh, namHoc);
        this.diemTB = diemTB;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return diemTB +"\t" + tinhThuong();
    }

    @Override
    public double tinhThuong() {
        if (diemTB >= 9) {
            return 5000000;
        } else if (diemTB < 9 || diemTB <= 8) {
            return 3000000;
        } else {
            return 0;
        }
    }
}
