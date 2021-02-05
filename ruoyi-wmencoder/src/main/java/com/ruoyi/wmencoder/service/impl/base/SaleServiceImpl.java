package com.ruoyi.wmencoder.service.impl.base;

import com.ruoyi.wmencoder.domain.base.Sale;
import com.ruoyi.wmencoder.mapper.base.SaleMapper;
import com.ruoyi.wmencoder.service.base.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements ISaleService {

    @Autowired
    private SaleMapper saleMapper;
    @Override
    public int create(Sale sale){
        return saleMapper.create(sale);
    }
    @Override
    public int delete(int id){
        return saleMapper.delete(id);
    }
    @Override
    public int update(Sale sale){
        return saleMapper.update(sale);
    }
    @Override
    public List<Sale> query(Sale sale){
        return saleMapper.query(sale);
    }
    @Override
    public Sale detail(int id){
        return saleMapper.detail(id);
    }
}
