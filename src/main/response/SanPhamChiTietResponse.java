/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.response;

/**
 *
 * @author hangnt
 */
public class SanPhamChiTietResponse {
      private Integer id;

    private String maSP;

    private String tenSP;

    private Integer soLuong;

    private Double giaBan;

    private Integer namBaoHanh;

    private String moTa;

    private String tenMauSac;

    private String tenNSX;

    private String tenDongSanPham;

    public SanPhamChiTietResponse() {
    }

    public SanPhamChiTietResponse(Integer id, String maSP, String tenSP, Integer soLuong, Double giaBan, Integer namBaoHanh, String moTa, String tenMauSac, String tenNSX, String tenDongSanPham) {
        this.id = id;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.namBaoHanh = namBaoHanh;
        this.moTa = moTa;
        this.tenMauSac = tenMauSac;
        this.tenNSX = tenNSX;
        this.tenDongSanPham = tenDongSanPham;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
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

    public String getTenMauSac() {
        return tenMauSac;
    }

    public void setTenMauSac(String tenMauSac) {
        this.tenMauSac = tenMauSac;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getTenDongSanPham() {
        return tenDongSanPham;
    }

    public void setTenDongSanPham(String tenDongSanPham) {
        this.tenDongSanPham = tenDongSanPham;
    }

    @Override
    public String toString() {
        return "SanPhamChiTietResponse{" + "id=" + id + ", maSP=" + maSP + ", tenSP=" + tenSP + ", soLuong=" + soLuong + ", giaBan=" + giaBan + ", namBaoHanh=" + namBaoHanh + ", moTa=" + moTa + ", tenMauSac=" + tenMauSac + ", tenNSX=" + tenNSX + ", tenDongSanPham=" + tenDongSanPham + '}';
    }
}
