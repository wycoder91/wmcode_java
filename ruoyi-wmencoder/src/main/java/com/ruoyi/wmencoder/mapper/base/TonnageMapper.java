package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.Tonnage;

import java.util.List;

public interface TonnageMapper {
    int create(Tonnage tonnage);
    int delete(int id);
    int update(Tonnage tonnage);
    List<Tonnage> query(Tonnage tonnage);
    Tonnage detail(int id);
}
