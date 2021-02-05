package com.ruoyi.wmencoder.service.impl.base;

import com.ruoyi.wmencoder.domain.base.TransStyle;
import com.ruoyi.wmencoder.mapper.base.TransStyleMapper;
import com.ruoyi.wmencoder.service.base.ITransStyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransStyleServiceImpl implements ITransStyleService {

    @Autowired
    private TransStyleMapper transStyleMapper;
    @Override
    public int create(TransStyle transStyle){
        return transStyleMapper.create(transStyle);
    }
    @Override
    public int delete(int id){
        return transStyleMapper.delete(id);
    }
    @Override
    public int update(TransStyle transStyle){
        return transStyleMapper.update(transStyle);
    }
    @Override
    public List<TransStyle> query(TransStyle transStyle){
        return transStyleMapper.query(transStyle);
    }
    @Override
    public TransStyle detail(int id){
        return transStyleMapper.detail(id);
    }
}
