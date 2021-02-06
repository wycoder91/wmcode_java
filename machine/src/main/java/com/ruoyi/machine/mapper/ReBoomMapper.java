package com.ruoyi.machine.mapper;

import com.ruoyi.machine.domain.MacInfo;

import java.util.List;

public interface ReBoomMapper {
    int create(MacInfo boom);
    int delete(int id);
    int update(MacInfo boom);
    List<MacInfo> query(MacInfo boom);
    MacInfo detail(int id);
}
