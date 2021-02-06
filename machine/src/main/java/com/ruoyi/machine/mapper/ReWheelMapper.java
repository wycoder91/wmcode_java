package com.ruoyi.machine.mapper;

import com.ruoyi.machine.domain.MacInfo;

import java.util.List;

public interface ReWheelMapper {
    int create(MacInfo wheel);
    int delete(int id);
    int update(MacInfo wheel);
    List<MacInfo> query(MacInfo wheel);
    MacInfo detail(int id);
}
