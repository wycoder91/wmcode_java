package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.ProductType;

import java.util.List;

public interface IProductTypeService {

    public int create(ProductType productType);

    public int delete(int id);

    public int update(ProductType productType);

    public List<ProductType> query(ProductType productType);

    public ProductType detail(int id);
}
