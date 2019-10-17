public class StringReceiptPrinter implements ReceiptPrinter {
    @Override
    public void print(String header, CustomerModel c, ProductModel p,
                      PurchaseModel t, String footer) {
        String r = header + "\n" +
                "Customer ID: " + c.mCustomerID + "\n" +
                "Customer Name: " + c.mName + "\n" +
                "\n" +
                "Product ID:   " + p.mProductID + "\n" +
                "Product Name:  " + p.mName + "\n" +
                "Price:    " + String.format("$%.2f", p.mPrice) + "\n" +
                "\n" +
                "Tax:      " + String.format("$%.2f", t.mTax) + "\n" +
                "Total:    " + String.format("$%.2f", t.mTotal) + "\n";
        if (footer.length() != 0) {
            r += "\n" + footer + "\n";
        }
        System.out.println(r);
    }
}