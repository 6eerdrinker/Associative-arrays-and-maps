package Nask1_2;

import java.util.Objects;

public class Product {
    private final String nameOfProduct;
    private final float productPrice;


    public Product(String nameOfProduct, float productPrice) {

        if (nameOfProduct != null || !nameOfProduct.isBlank()
                || !nameOfProduct.isEmpty()) {
            this.nameOfProduct = nameOfProduct;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью! " +
                    "Внесите наименование продукта.");
        }
        if (productPrice != 0) {
            this.productPrice = productPrice;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью! " +
                    "Укажите цену.");
        }

    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }


    public float getProductPrice() {
        return productPrice;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
        return Objects.equals(nameOfProduct, product.nameOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfProduct);
    }

    @Override
    public String toString() {
       return String.format("Продукт - %s, по цене %s руб. за килограмм." +
                     this.nameOfProduct, this.productPrice);
 }
}
