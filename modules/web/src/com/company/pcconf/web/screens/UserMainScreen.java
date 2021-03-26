package com.company.pcconf.web.screens;

import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

@UiController("pcconf_UserMainScreen")
@UiDescriptor("user-main-screen.xml")
public class UserMainScreen extends Screen {
    @Subscribe("products_btn")
    public void onProducts_btnClick(Button.ClickEvent event) {
        
    }
    
}