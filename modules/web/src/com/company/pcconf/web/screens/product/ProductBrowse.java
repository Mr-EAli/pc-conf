package com.company.pcconf.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.pcconf.entity.Product;

@UiController("pcconf_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}