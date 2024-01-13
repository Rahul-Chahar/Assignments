package Collections_Generics_and_Stream_API.Shopping_Cart_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
// Products class with productList, addProductToList, and sortProductList methods
class Products {
    private ArrayList<String> productList;

    public Products() {
        this.productList = new ArrayList<>();
    }

    public ArrayList<String> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<String> productList) {
        this.productList = productList;
    }

    public void addProductToList(String product) {
        productList.add(product);
    }

    public void sortProductList() {
        Collections.sort(productList);
    }
}
