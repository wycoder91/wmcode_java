package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.OperationMode;

import java.util.List;

public interface IOperationModeService {
    public int create(OperationMode operationMode);

    public int delete(int id);

    public int update(OperationMode operationMode);

    public List<OperationMode> query(OperationMode operationMode);

    public OperationMode detail(int id);
}
