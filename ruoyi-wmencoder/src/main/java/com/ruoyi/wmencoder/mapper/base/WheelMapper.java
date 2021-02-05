package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.Wheel;

import java.util.List;

public interface WheelMapper {
    int create(Wheel wheel);
    int delete(int id);
    int update(Wheel wheel);
    List<Wheel> query(Wheel wheel);
    Wheel detail(int id);
}
