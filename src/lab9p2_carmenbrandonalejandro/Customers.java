/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_carmenbrandonalejandro;

/**
 *
 * @author diego
 */
public class Customers extends Registro {

    private String customer, customerN, seg, pais, ciudad, stado, postalC, reg;

    public Customers() {
        super();
    }

    public Customers(String customer, String customerN, String seg, String pais, String ciudad, String stado, String postalC, String reg, String ID, String orderID, String orderDate, String shipDate, String shipMode, String customerID, String customerName, String segment, String country, String city, String state, String postalCode, String region, String productID, String category, String subCategory, String productName, String sales, String quantity, String discount, String profit) {
        super(ID, orderID, orderDate, shipDate, shipMode, customerID, customerName, segment, country, city, state, postalCode, region, productID, category, subCategory, productName, sales, quantity, discount, profit);
        this.customer = customer;
        this.customerN = customerN;
        this.seg = seg;
        this.pais = pais;
        this.ciudad = ciudad;
        this.stado = stado;
        this.postalC = postalC;
        this.reg = reg;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomerN() {
        return customerN;
    }

    public void setCustomerN(String customerN) {
        this.customerN = customerN;
    }

    public String getSeg() {
        return seg;
    }

    public void setSeg(String seg) {
        this.seg = seg;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getStado() {
        return stado;
    }

    public void setStado(String stado) {
        this.stado = stado;
    }

    public String getPostalC() {
        return postalC;
    }

    public void setPostalC(String postalC) {
        this.postalC = postalC;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customer + "\nCustomer Name: " + customerN + "\nSegment: " + seg + "\nCountry: " + pais + "\nCity: " + ciudad + "\nState: " + stado + "\nPostal Code: " + postalC + "\nRegion: " + reg;
    }

}
