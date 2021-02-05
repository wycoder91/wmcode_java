package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.Sale;

import java.util.List;

public interface ISaleService {
    public int create(Sale sale);

    public int delete(int id);

    public int update(Sale sale);

    public List<Sale> query(Sale sale);

    public Sale detail(int id);
}
