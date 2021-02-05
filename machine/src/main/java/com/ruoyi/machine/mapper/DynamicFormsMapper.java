package com.ruoyi.machine.mapper;

import com.ruoyi.machine.domain.MacInfo;

import java.util.List;

public interface DynamicFormsMapper {
    int create(MacInfo dynamicForms);
    int delete(int id);
    int update(MacInfo dynamicForms);
    List<MacInfo> query(MacInfo dynamicForms);
    MacInfo detail(int id);
}
