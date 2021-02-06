package com.ruoyi.machine.mapper;

import com.ruoyi.machine.domain.MacInfo;

import java.util.List;

public interface ReOperationModeMapper {
    int create(MacInfo format);
    int delete(int id);
    int update(MacInfo format);
    List<MacInfo> query(MacInfo format);
    MacInfo detail(int id);
}
