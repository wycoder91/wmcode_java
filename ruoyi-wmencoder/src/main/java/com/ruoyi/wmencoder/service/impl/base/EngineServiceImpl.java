package com.ruoyi.wmencoder.service.impl.base;

import com.ruoyi.wmencoder.domain.base.Engine;
import com.ruoyi.wmencoder.mapper.base.EngineMapper;
import com.ruoyi.wmencoder.service.base.IEngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineServiceImpl implements IEngineService {

    @Autowired
    private EngineMapper engineMapper;
    @Override
    public int create(Engine engine){
        return engineMapper.create(engine);
    }
    @Override
    public int delete(int id){
        return engineMapper.delete(id);
    }
    @Override
    public int update(Engine engine){
        return engineMapper.update(engine);
    }
    @Override
    public List<Engine> query(Engine engine){
        return engineMapper.query(engine);
    }
    @Override
    public Engine detail(int id){
        return engineMapper.detail(id);
    }
}
