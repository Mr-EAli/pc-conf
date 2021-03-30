package com.company.pcconf.web.screens.corf;

import com.haulmont.cuba.gui.screen.*;
import com.company.pcconf.entity.Corf;

@UiController("pcconf_Corf.browse")
@UiDescriptor("corf-browse.xml")
@LookupComponent("corfsTable")
@LoadDataBeforeShow
public class CorfBrowse extends StandardLookup<Corf> {
}