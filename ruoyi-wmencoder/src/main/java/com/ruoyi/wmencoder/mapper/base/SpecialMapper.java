package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.Special;

import java.util.List;

public interface SpecialMapper {
    int create(Special special);
    int delete(int id);
    int update(Special special);
    List<Special> query(Special special);
    Special detail(int id);
}
