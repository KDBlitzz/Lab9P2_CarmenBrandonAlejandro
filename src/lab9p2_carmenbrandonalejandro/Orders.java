/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_carmenbrandonalejandro;

/**
 *
 * @author diego
 */
public class Orders extends Registro {

    private String oID, oDate, sDate, sMode, cID;

    public Orders() {
        super();
    }

    public Orders(String oID, String oDate, String sDate, String sMode, String cID, String ID, String orderID, String orderDate, String shipDate, String shipMode, String customerID, String customerName, String segment, String country, String city, String state, String postalCode, String region, String productID, String category, String subCategory, String productName, String sales, String quantity, String discount, String profit) {
        super(ID, orderID, orderDate, shipDate, shipMode, customerID, customerName, segment, country, city, state, postalCode, region, productID, category, subCategory, productName, sales, quantity, discount, profit);
        this.oID = oID;
        this.oDate = oDate;
        this.sDate = sDate;
        this.sMode = sMode;
        this.cID = cID;
    }

    public String getoID() {
        return oID;
    }

    public void setoID(String oID) {
        this.oID = oID;
    }

    public String getoDate() {
        return oDate;
    }

    public void setoDate(String oDate) {
        this.oDate = oDate;
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }

    public String getsMode() {
        return sMode;
    }

    public void setsMode(String sMode) {
        this.sMode = sMode;
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    @Override
    public String toString() {
        return "Order ID: " + oID + "\nOrder Date: " + oDate + "\nShip Date: " + sDate + "\nShip Mode" + sMode + "Customer ID: " + cID;
    }
    
}
