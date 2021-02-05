package com.ruoyi.machine.mapper;

import com.ruoyi.machine.domain.MacInfo;

import java.util.List;

public interface SpecialMapper {
    int create(MacInfo special);
    int delete(int id);
    int update(MacInfo special);
    List<MacInfo> query(MacInfo special);
    MacInfo detail(int id);
}
