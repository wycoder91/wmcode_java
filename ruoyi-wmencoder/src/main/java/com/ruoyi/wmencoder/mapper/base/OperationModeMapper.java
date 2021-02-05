package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.OperationMode;

import java.util.List;

public interface OperationModeMapper {
    int create(OperationMode format);
    int delete(int id);
    int update(OperationMode format);
    List<OperationMode> query(OperationMode format);
    OperationMode detail(int id);
}
