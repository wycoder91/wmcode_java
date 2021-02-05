package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.Discharge;

import java.util.List;

public interface IDischargeService {
    public int create(Discharge discharge);

    public int delete(int id);

    public int update(Discharge discharge);

    public List<Discharge> query(Discharge discharge);

    public Discharge detail(int id);
}
