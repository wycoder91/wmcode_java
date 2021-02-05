package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.Discharge;

import java.util.List;

public interface DischargeMapper {
    int create(Discharge discharge);
    int delete(int id);
    int update(Discharge discharge);
    List<Discharge> query(Discharge discharge);
    Discharge detail(int id);
}
