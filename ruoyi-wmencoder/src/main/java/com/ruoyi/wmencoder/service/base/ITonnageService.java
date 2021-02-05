package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.Tonnage;

import java.util.List;

public interface ITonnageService {
    public int create(Tonnage tonnage);

    public int delete(int id);

    public int update(Tonnage tonnage);

    public List<Tonnage> query(Tonnage tonnage);

    public Tonnage detail(int id);
}
