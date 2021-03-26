package com.company.pcconf.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "PCCONF_PRODUCT")
@Entity(name = "pcconf_Product")
@NamePattern("%s|name")
public class Product extends StandardEntity {
    private static final long serialVersionUID = 7927861387845158659L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TYPE_")
    private String type;

    @Column(name = "PRICE")
    private BigDecimal price;

    public void setType(Type type) {
        this.type = type == null ? null : type.getId();
    }

    public Type getType() {
        return type == null ? null : Type.fromId(type);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}