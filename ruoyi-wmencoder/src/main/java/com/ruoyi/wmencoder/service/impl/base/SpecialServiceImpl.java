package com.ruoyi.wmencoder.service.impl.base;

import com.ruoyi.wmencoder.domain.base.Special;
import com.ruoyi.wmencoder.mapper.base.SpecialMapper;
import com.ruoyi.wmencoder.service.base.ISpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialServiceImpl implements ISpecialService {

    @Autowired
    private SpecialMapper specialMapper;
    @Override
    public int create(Special special){
        return specialMapper.create(special);
    }
    @Override
    public int delete(int id){
        return specialMapper.delete(id);
    }
    @Override
    public int update(Special special){
        return specialMapper.update(special);
    }
    @Override
    public List<Special> query(Special special){
        return specialMapper.query(special);
    }
    @Override
    public Special detail(int id){
        return specialMapper.detail(id);
    }
}
