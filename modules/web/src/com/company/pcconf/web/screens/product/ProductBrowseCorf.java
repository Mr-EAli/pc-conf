package com.company.pcconf.web.screens.product;

import com.company.pcconf.entity.Corf;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.Route;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.company.pcconf.entity.Product;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@UiController("pcconf_ProductCorf.browse")
@UiDescriptor("product-browse-corf.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
@Route("product-browse-corf")
public class ProductBrowseCorf extends StandardLookup<Product> {
    @Inject
    DataManager dataManager;
    @Inject
    private Button RemoveInCorf;
    @Inject
    private Button AddInCorf;

    private Product product;

    @Subscribe("productsTable")
    public void onProductsTableSelection(Table.SelectionEvent<Product> event) {
        List<Corf> corfList = dataManager.load(Corf.class)
                .view("corf-view")
                .list();
        List<Product> products = new ArrayList<>();
        
        for (Corf corf : corfList) { products.add(corf.getProduct()); }
         product = event.getSource().getSingleSelected();
        
        if (products.contains(product)) {
            RemoveInCorf.setVisible(true);
            AddInCorf.setVisible(false);
        } else {
            AddInCorf.setVisible(true);
            RemoveInCorf.setVisible(false);
        }
    }

    @Subscribe("AddInCorf")
    public void onAddInCorfClick(Button.ClickEvent event) {
        Corf corf = new Corf();
        corf.setProduct(product);
        dataManager.commit(corf);
    }

    @Subscribe("RemoveInCorf")
    public void onRemoveInCorfClick(Button.ClickEvent event) {
        Corf corf = new Corf();
        corf.setProduct(product);
        dataManager.remove(product);
    }
    
    
}