package com.ruoyi.wmencoder.service.impl.base;


import com.ruoyi.wmencoder.domain.base.Boom;
import com.ruoyi.wmencoder.mapper.base.BoomMapper;
import com.ruoyi.wmencoder.service.base.IBoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoomServiceImpl implements IBoomService {

    @Autowired
    private BoomMapper boomMapper;
    @Override
    public int create(Boom boom){
        return boomMapper.create(boom);
    }
    @Override
    public int delete(int id){
        return boomMapper.delete(id);
    }
    @Override
    public int update(Boom boom){
        return boomMapper.update(boom);
    }
    @Override
    public List<Boom> query(Boom boom){
        return boomMapper.query(boom);
    }
    @Override
    public Boom detail(int id){
        return boomMapper.detail(id);
    }
}
