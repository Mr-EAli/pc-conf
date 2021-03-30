package com.company.pcconf.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.pcconf.entity.Product;

@UiController("pcconf_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}