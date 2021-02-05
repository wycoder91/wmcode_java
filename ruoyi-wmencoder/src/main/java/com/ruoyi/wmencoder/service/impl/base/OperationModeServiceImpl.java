package com.ruoyi.wmencoder.service.impl.base;

import com.ruoyi.wmencoder.domain.base.OperationMode;
import com.ruoyi.wmencoder.mapper.base.OperationModeMapper;
import com.ruoyi.wmencoder.service.base.IOperationModeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationModeServiceImpl implements IOperationModeService {

    @Autowired
    private OperationModeMapper operationModeMapper;
    @Override
    public int create(OperationMode operationMode){
        return operationModeMapper.create(operationMode);
    }
    @Override
    public int delete(int id){
        return operationModeMapper.delete(id);
    }
    @Override
    public int update(OperationMode operationMode){
        return operationModeMapper.update(operationMode);
    }
    @Override
    public List<OperationMode> query(OperationMode operationMode){
        return operationModeMapper.query(operationMode);
    }
    @Override
    public OperationMode detail(int id){
        return operationModeMapper.detail(id);
    }
}
