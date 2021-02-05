package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.Special;

import java.util.List;

public interface ISpecialService {
    public int create(Special special);

    public int delete(int id);

    public int update(Special special);

    public List<Special> query(Special special);

    public Special detail(int id);
}
