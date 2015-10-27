package com.samsung.spdg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="three_ctg")
public class ThreeCategory {
    @Id
    private Integer id;
    @Column(length=255)
    private String subCtgName;
    private Integer subType;
    @Column(length=255)
    private String name;    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="categoryId")
    private Category category;
    
    public ThreeCategory() {}

    public ThreeCategory(Integer id, String subCtgName, Integer subType,
            String name, Category category) {
        super();
        this.id = id;
        this.subCtgName = subCtgName;
        this.subType = subType;
        this.name = name;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubCtgName() {
        return subCtgName;
    }

    public void setSubCtgName(String subCtgName) {
        this.subCtgName = subCtgName;
    }

    public Integer getSubType() {
        return subType;
    }

    public void setSubType(Integer subType) {
        this.subType = subType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    
}

