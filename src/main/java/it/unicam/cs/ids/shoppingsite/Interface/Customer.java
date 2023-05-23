package it.unicam.cs.ids.shoppingsite.Interface;

import it.unicam.cs.ids.shoppingsite.ShoppingServices.Product;

public interface Customer {

    public void editProfile();

    public void buyProduct();

    /**
     *
     * @param product
     * @param quantity
     */
    public void addToShoppingCart(Product product, int quantity);

    /**
     *
     * @param product
     * @param quantity
     */
    public void removeFromShoppingCart(Product product, int quantity);

}
