/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_carmenbrandonalejandro;

/**
 *
 * @author diego
 */
public class Details extends Registro{
    private String oID, prodID, sale, quant, disc, prof;

    public Details() {
        super();
    }

    public Details(String oID, String prodID, String sale, String quant, String disc, String prof, String ID, String orderID, String orderDate, String shipDate, String shipMode, String customerID, String customerName, String segment, String country, String city, String state, String postalCode, String region, String productID, String category, String subCategory, String productName, String sales, String quantity, String discount, String profit) {
        super(ID, orderID, orderDate, shipDate, shipMode, customerID, customerName, segment, country, city, state, postalCode, region, productID, category, subCategory, productName, sales, quantity, discount, profit);
        this.oID = oID;
        this.prodID = prodID;
        this.sale = sale;
        this.quant = quant;
        this.disc = disc;
        this.prof = prof;
    }

    public String getoID() {
        return oID;
    }

    public void setoID(String oID) {
        this.oID = oID;
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public String getQuant() {
        return quant;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    @Override
    public String toString() {
        return "Order ID: " + oID + "\nProduct ID: " + prodID + "\nSales: " + sale + "\nQuantity: " + quant + "\nDiscount: " + disc + "\nProfit: " + prof;
    }
    
}
