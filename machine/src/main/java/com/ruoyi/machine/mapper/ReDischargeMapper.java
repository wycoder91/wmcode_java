package com.ruoyi.machine.mapper;

import com.ruoyi.machine.domain.MacInfo;

import java.util.List;

public interface ReDischargeMapper {
    int create(MacInfo discharge);
    int delete(int id);
    int update(MacInfo discharge);
    List<MacInfo> query(MacInfo discharge);
    MacInfo detail(int id);
}
