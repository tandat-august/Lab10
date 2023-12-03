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
public class GiangVien extends ThanhVien {

    private int soBaiBao;
    private int soDeTai;

    public GiangVien() {
    }

    public GiangVien(int soBaiBao, int soDeTai, String ma, String ten, Date ngaySinh, String namHoc) {
        super(ma, ten, ngaySinh, namHoc);
        this.soBaiBao = soBaiBao;
        this.soDeTai = soDeTai;
    }

    public int getSoBaiBao() {
        return soBaiBao;
    }

    public void setSoBaiBao(int soBaiBao) {
        this.soBaiBao = soBaiBao;
    }

    public int getSoDeTai() {
        return soDeTai;
    }

    public void setSoDeTai(int soDeTai) {
        this.soDeTai = soDeTai;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "soBaiBao=" + soBaiBao + ", soDeTai=" + soDeTai + '}';
    }

    @Override
    public double tinhThuong() {
        return soBaiBao*1000000 + soDeTai*2000000;
    }

}
