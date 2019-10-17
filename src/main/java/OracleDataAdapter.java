


public class OracleDataAdapter implements IDataAdapter {
    public int connect(String dbfile) {
        //...
        return CONNECTION_OPEN_OK;
    }

    public int disconnect() {
        // ...
        return CONNECTION_CLOSE_OK;

    }
    public CustomerModel loadCustomer(int customerId) {
        return null;
    }
    public int saveCustomer(CustomerModel model) {
        return CUSTOMER_SAVED_OK;
    }

    public ProductModel loadProduct(int productId) {
        return null;
    }
    public int saveProduct(ProductModel model) {
        return PRODUCT_SAVED_OK;
    }

    //@Override
    public PurchaseModel loadPurchase(int purchaseId) {
        return null;
    }
    public int savePurchase(PurchaseModel model) {
        return PURCHASE_SAVED_OK;
    }

}
