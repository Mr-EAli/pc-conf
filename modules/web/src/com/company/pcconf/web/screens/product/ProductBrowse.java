package com.company.pcconf.web.screens.product;

import com.haulmont.cuba.gui.Route;
import com.haulmont.cuba.gui.screen.*;
import com.company.pcconf.entity.Product;

@UiController("pcconf_Product.browse")
@UiDescriptor("add-products-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
@Route("add-products")
public class ProductBrowse extends StandardLookup<Product> {

}