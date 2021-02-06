package com.ruoyi.machine.mapper;

import com.ruoyi.machine.domain.MacInfo;

import java.util.List;

public interface ReOptionalMapper {
    int create(MacInfo optional);
    int delete(int id);
    int update(MacInfo optional);
    List<MacInfo> query(MacInfo optional);
    MacInfo detail(int id);
}
