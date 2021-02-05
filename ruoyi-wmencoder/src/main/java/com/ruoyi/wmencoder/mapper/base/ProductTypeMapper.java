package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.ProductType;

import java.util.List;

public interface ProductTypeMapper {
    int create(ProductType productType);
    int delete(int id);
    int update(ProductType productType);
    List<ProductType> query(ProductType productType);
    ProductType detail(int id);
}
