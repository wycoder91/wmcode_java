package com.ruoyi.machine.mapper;

import com.ruoyi.machine.domain.MacInfo;

import java.util.List;

public interface ReTonnageMapper {
    int create(MacInfo tonnage);
    int delete(int id);
    int update(MacInfo tonnage);
    List<MacInfo> query(MacInfo tonnage);
    MacInfo detail(int id);
}
