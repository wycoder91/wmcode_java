package com.ruoyi.wmencoder.service.impl.base;

import com.ruoyi.wmencoder.domain.base.Transmission;
import com.ruoyi.wmencoder.mapper.base.TransmissionMapper;
import com.ruoyi.wmencoder.service.base.ITransmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransmissionServiceImpl implements ITransmissionService {

    @Autowired
    private TransmissionMapper transmissionMapper;
    @Override
    public int create(Transmission transmission){
        return transmissionMapper.create(transmission);
    }
    @Override
    public int delete(int id){
        return transmissionMapper.delete(id);
    }
    @Override
    public int update(Transmission transmission){
        return transmissionMapper.update(transmission);
    }
    @Override
    public List<Transmission> query(Transmission transmission){
        return transmissionMapper.query(transmission);
    }
    @Override
    public Transmission detail(int id){
        return transmissionMapper.detail(id);
    }
}
