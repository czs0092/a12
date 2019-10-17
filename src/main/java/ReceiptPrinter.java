  
public interface ReceiptPrinter {
    void print(String header, CustomerModel c, ProductModel p,
               PurchaseModel t, String footer);
}