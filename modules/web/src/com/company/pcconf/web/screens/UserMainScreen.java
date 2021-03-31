package com.company.pcconf.web.screens;

import com.company.pcconf.web.screens.corf.CorfBrowse;
import com.company.pcconf.web.screens.product.ProductBrowse;
import com.company.pcconf.web.screens.product.ProductBrowseCorf;
import com.haulmont.cuba.gui.Route;
import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("pcconf_UserMainScreen")
@UiDescriptor("user-main-screen.xml")
@Route("main-user-screen")
public class UserMainScreen extends Screen {
    @Inject
    private Screens screens;


    @Subscribe("products_btn")
    public void onProducts_btnClick(Button.ClickEvent event) {
        ProductBrowseCorf screen = screens.create(ProductBrowseCorf.class);
        screens.show(screen);
    }

    @Subscribe("corf_btn")
    public void onCorf_btnClick(Button.ClickEvent event) {
        CorfBrowse screen = screens.create(CorfBrowse.class);
        screens.show(screen);
    }

    @Subscribe("addProducts_btn")
    public void onAddProducts_btnClick(Button.ClickEvent event) {
        ProductBrowse screen = screens.create(ProductBrowse.class);
        screens.show(screen);
    }


}