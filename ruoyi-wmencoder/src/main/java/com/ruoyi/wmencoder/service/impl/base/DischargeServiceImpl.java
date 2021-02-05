package com.ruoyi.wmencoder.service.impl.base;

import com.ruoyi.wmencoder.domain.base.Discharge;
import com.ruoyi.wmencoder.mapper.base.DischargeMapper;
import com.ruoyi.wmencoder.service.base.IDischargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DischargeServiceImpl implements IDischargeService {

    @Autowired
    private DischargeMapper dischargeMapper;
    @Override
    public int create(Discharge discharge){
        return dischargeMapper.create(discharge);
    }
    @Override
    public int delete(int id){
        return dischargeMapper.delete(id);
    }
    @Override
    public int update(Discharge discharge){
        return dischargeMapper.update(discharge);
    }
    @Override
    public List<Discharge> query(Discharge discharge){
        return dischargeMapper.query(discharge);
    }
    @Override
    public Discharge detail(int id){
        return dischargeMapper.detail(id);
    }
}
