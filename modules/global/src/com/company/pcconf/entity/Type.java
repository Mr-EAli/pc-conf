package com.company.pcconf.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Type implements EnumClass<String> {

    MOTHER_BOARD("Mother Board"),
    POWER_BLOCK("Power Block"),
    RAM("RAM"),
    CPU("CPU"),
    GPU("GPU"),
    COOLER("Cooler"),
    CASE("Case");

    private String id;

    Type(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Type fromId(String id) {
        for (Type at : Type.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}