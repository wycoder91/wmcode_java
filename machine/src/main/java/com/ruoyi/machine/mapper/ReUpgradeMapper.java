package com.ruoyi.machine.mapper;

import com.ruoyi.machine.domain.MacInfo;

import java.util.List;

public interface ReUpgradeMapper {
    int create(MacInfo upgrade);
    int delete(int id);
    int update(MacInfo upgrade);
    List<MacInfo> query(MacInfo upgrade);
    MacInfo detail(int id);
}
