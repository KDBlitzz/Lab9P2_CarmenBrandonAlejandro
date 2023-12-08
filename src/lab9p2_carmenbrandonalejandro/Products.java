/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_carmenbrandonalejandro;

/**
 *
 * @author diego
 */
public class Products extends Registro{
    private String pID, cat, subCat, prodName;

    public Products() {
        super();
    }

    public Products(String pID, String cat, String subCat, String prodName, String ID, String orderID, String orderDate, String shipDate, String shipMode, String customerID, String customerName, String segment, String country, String city, String state, String postalCode, String region, String productID, String category, String subCategory, String productName, String sales, String quantity, String discount, String profit) {
        super(ID, orderID, orderDate, shipDate, shipMode, customerID, customerName, segment, country, city, state, postalCode, region, productID, category, subCategory, productName, sales, quantity, discount, profit);
        this.pID = pID;
        this.cat = cat;
        this.subCat = subCat;
        this.prodName = prodName;
    }

    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getSubCat() {
        return subCat;
    }

    public void setSubCat(String subCat) {
        this.subCat = subCat;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    @Override
    public String toString() {
        return "Product ID: " + pID + "\nCategory: " + cat + "\nSub-Category:" + subCat + "\nProduct Name" + prodName;
    }
    
    
}
