package com.ruoyi.machine.mapper;

import com.ruoyi.machine.domain.MacInfo;

import java.util.List;

public interface TransStyleMapper {
    int create(MacInfo transStyle);
    int delete(int id);
    int update(MacInfo transStyle);
    List<MacInfo> query(MacInfo transStyle);
    MacInfo detail(int id);
}
