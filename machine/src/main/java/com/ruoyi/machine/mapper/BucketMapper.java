package com.ruoyi.machine.mapper;

import com.ruoyi.machine.domain.MacInfo;

import java.util.List;

public interface BucketMapper {
    int create(MacInfo bucket);
    int delete(int id);
    int update(MacInfo bucket);
    List<MacInfo> query(MacInfo bucket);
    MacInfo detail(int id);
}
