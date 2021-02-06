package com.ruoyi.machine.mapper;

import com.ruoyi.machine.domain.MacInfo;

import java.util.List;

public interface ReTransmissionMapper {
    int create(MacInfo transmission);
    int delete(int id);
    int update(MacInfo transmission);
    List<MacInfo> query(MacInfo transmission);
    MacInfo detail(int id);
}
