package com.ruoyi.wmencoder.service.impl.base;

import com.ruoyi.wmencoder.domain.base.Format;
import com.ruoyi.wmencoder.mapper.base.FormatMapper;
import com.ruoyi.wmencoder.service.base.IFormatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormatServiceImpl implements IFormatService {

    @Autowired
    private FormatMapper formatMapper;
    @Override
    public int create(Format format){
        return formatMapper.create(format);
    }
    @Override
    public int delete(int id){
        return formatMapper.delete(id);
    }
    @Override
    public int update(Format format){
        return formatMapper.update(format);
    }
    @Override
    public List<Format> query(Format format){
        return formatMapper.query(format);
    }
    @Override
    public Format detail(int id){
        return formatMapper.detail(id);
    }
}
