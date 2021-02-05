package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.Sale;

import java.util.List;

public interface SaleMapper {
    int create(Sale sale);
    int delete(int id);
    int update(Sale sale);
    List<Sale> query(Sale sale);
    Sale detail(int id);
}
