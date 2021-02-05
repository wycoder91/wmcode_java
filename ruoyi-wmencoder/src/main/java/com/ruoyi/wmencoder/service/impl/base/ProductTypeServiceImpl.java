package com.ruoyi.wmencoder.service.impl.base;

import com.ruoyi.wmencoder.domain.base.ProductType;
import com.ruoyi.wmencoder.mapper.base.ProductTypeMapper;
import com.ruoyi.wmencoder.service.base.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServiceImpl implements IProductTypeService {

    @Autowired
    private ProductTypeMapper productTypeMapper;
    @Override
    public int create(ProductType productType){
        return productTypeMapper.create(productType);
    }
    @Override
    public int delete(int id){
        return productTypeMapper.delete(id);
    }
    @Override
    public int update(ProductType productType){
        return productTypeMapper.update(productType);
    }
    @Override
    public List<ProductType> query(ProductType productType){
        return productTypeMapper.query(productType);
    }
    @Override
    public ProductType detail(int id){
        return productTypeMapper.detail(id);
    }
}
