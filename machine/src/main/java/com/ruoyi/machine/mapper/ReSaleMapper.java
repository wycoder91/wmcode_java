package com.ruoyi.machine.mapper;

import com.ruoyi.machine.domain.MacInfo;

import java.util.List;

public interface ReSaleMapper {
    int create(MacInfo sale);
    int delete(int id);
    int update(MacInfo sale);
    List<MacInfo> query(MacInfo sale);
    MacInfo detail(int id);
}
