package com.ruoyi.machine.mapper;

import com.ruoyi.machine.domain.MacInfo;

import java.util.List;

public interface ReEngineMapper {
    int create(MacInfo engine);
    int delete(int id);
    int update(MacInfo engine);
    List<MacInfo> query(MacInfo engine);
    MacInfo detail(int id);
}
