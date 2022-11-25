package Nask1_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipe {
    private final Map<Product, Integer> products = new HashMap<>();
    private final String nameOfRecipe;

    public Recipe(String nameOfRecipe) {

        if (nameOfRecipe == null || nameOfRecipe.isEmpty() || nameOfRecipe.isBlank()) {
            throw new IllegalArgumentException("Заполните данные рецепта полностью! " +
                    "Внесите наименование рецепта.");
        } else {
            this.nameOfRecipe = nameOfRecipe;}
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    public void addProduct(Product product, int quantity) {
        if (quantity <= 0) {
            quantity = 1;
        }
        if (this.products.containsKey(product)) {
            this.products.put(product, products.get(product) + quantity);
        } else {
            this.products.put(product, quantity);
        }
    }

    public float getRecipePrice() {
        float sum = 0;
        for (Map.Entry <Product,Integer> product: this.products.entrySet()) {
            sum += product.getKey().getProductPrice()*product.getValue();
        }
        return sum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(nameOfRecipe,recipe.nameOfRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe);
    }
}
