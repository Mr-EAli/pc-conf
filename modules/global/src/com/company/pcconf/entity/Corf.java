package com.company.pcconf.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "PCCONF_CORF")
@Entity(name = "pcconf_Corf")
public class Corf extends StandardEntity {
    private static final long serialVersionUID = 8293199170076817356L;

    @Transient
    @MetaProperty
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}