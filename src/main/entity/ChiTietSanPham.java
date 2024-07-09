/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.entity;

/**
 *
 * @author hangnt
 */
public class ChiTietSanPham {

    private Integer id;

    private Integer sanPhamID;

    private Integer nhaSanXuatID;

    private Integer mauSacID;

    private Integer dongSanPhamID;

    private Integer namBaoHanh;

    private String moTa;

    private Integer soLuongTon;

    private Double giaNhap;

    private Double giaBan;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(Integer id, Integer sanPhamID, Integer nhaSanXuatID, Integer mauSacID, Integer dongSanPhamID, Integer namBaoHanh, String moTa, Integer soLuongTon, Double giaNhap, Double giaBan) {
        this.id = id;
        this.sanPhamID = sanPhamID;
        this.nhaSanXuatID = nhaSanXuatID;
        this.mauSacID = mauSacID;
        this.dongSanPhamID = dongSanPhamID;
        this.namBaoHanh = namBaoHanh;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSanPhamID() {
        return sanPhamID;
    }

    public void setSanPhamID(Integer sanPhamID) {
        this.sanPhamID = sanPhamID;
    }

    public Integer getNhaSanXuatID() {
        return nhaSanXuatID;
    }

    public void setNhaSanXuatID(Integer nhaSanXuatID) {
        this.nhaSanXuatID = nhaSanXuatID;
    }

    public Integer getMauSacID() {
        return mauSacID;
    }

    public void setMauSacID(Integer mauSacID) {
        this.mauSacID = mauSacID;
    }

    public Integer getDongSanPhamID() {
        return dongSanPhamID;
    }

    public void setDongSanPhamID(Integer dongSanPhamID) {
        this.dongSanPhamID = dongSanPhamID;
    }

    public Integer getNamBaoHanh() {
        return namBaoHanh;
    }

    public void setNamBaoHanh(Integer namBaoHanh) {
        this.namBaoHanh = namBaoHanh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public Double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "id=" + id + ", sanPhamID=" + sanPhamID + ", nhaSanXuatID=" + nhaSanXuatID + ", mauSacID=" + mauSacID + ", dongSanPhamID=" + dongSanPhamID + ", namBaoHanh=" + namBaoHanh + ", moTa=" + moTa + ", soLuongTon=" + soLuongTon + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + '}';
    }

}
