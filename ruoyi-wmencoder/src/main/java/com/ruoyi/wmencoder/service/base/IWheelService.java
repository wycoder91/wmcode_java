package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.Wheel;

import java.util.List;

public interface IWheelService {
    public int create(Wheel wheel);

    public int delete(int id);

    public int update(Wheel wheel);

    public List<Wheel> query(Wheel wheel);

    public Wheel detail(int id);
}
