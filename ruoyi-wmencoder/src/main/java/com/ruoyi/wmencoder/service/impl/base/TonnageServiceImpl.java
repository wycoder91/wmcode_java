package com.ruoyi.wmencoder.service.impl.base;

import com.ruoyi.wmencoder.domain.base.Tonnage;
import com.ruoyi.wmencoder.mapper.base.TonnageMapper;
import com.ruoyi.wmencoder.service.base.ITonnageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TonnageServiceImpl implements ITonnageService {
    @Autowired
    private TonnageMapper tonnageMapper;
    @Override
    public int create(Tonnage tonnage){
        return tonnageMapper.create(tonnage);
    }
    @Override
    public int delete(int id){
        return tonnageMapper.delete(id);
    }
    @Override
    public int update(Tonnage tonnage){
        return tonnageMapper.update(tonnage);
    }
    @Override
    public List<Tonnage> query(Tonnage tonnage){
        return tonnageMapper.query(tonnage);
    }
    @Override
    public Tonnage detail(int id){
        return tonnageMapper.detail(id);
    }
}
