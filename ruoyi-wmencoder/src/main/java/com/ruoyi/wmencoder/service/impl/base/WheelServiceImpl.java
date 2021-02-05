package com.ruoyi.wmencoder.service.impl.base;

import com.ruoyi.wmencoder.domain.base.Wheel;
import com.ruoyi.wmencoder.mapper.base.WheelMapper;
import com.ruoyi.wmencoder.service.base.IWheelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WheelServiceImpl implements IWheelService {

    @Autowired
    private WheelMapper wheelMapper;
    @Override
    public int create(Wheel wheel){
        return wheelMapper.create(wheel);
    }
    @Override
    public int delete(int id){
        return wheelMapper.delete(id);
    }
    @Override
    public int update(Wheel wheel){
        return wheelMapper.update(wheel);
    }
    @Override
    public List<Wheel> query(Wheel wheel){
        return wheelMapper.query(wheel);
    }
    @Override
    public Wheel detail(int id){
        return wheelMapper.detail(id);
    }
}
