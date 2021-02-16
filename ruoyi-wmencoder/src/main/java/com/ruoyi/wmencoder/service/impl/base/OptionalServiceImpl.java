package com.ruoyi.wmencoder.service.impl.base;

import com.ruoyi.wmencoder.domain.base.Optional;
import com.ruoyi.wmencoder.mapper.base.OptionalMapper;
import com.ruoyi.wmencoder.service.base.IOptionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionalServiceImpl implements IOptionalService {

    @Autowired
    private OptionalMapper optionalMapper;
    @Override
    public int create(Optional optional){
        return optionalMapper.create(optional);
    }
    @Override
    public int delete(int id){
        return optionalMapper.delete(id);
    }
    @Override
    public int update(Optional optional){
        return optionalMapper.update(optional);
    }
    @Override
    public List<Optional> query(Optional optional){
        return optionalMapper.query(optional);
    }
    @Override
    public Optional detail(int id){
        return optionalMapper.detail(id);
    }
    @Override
    public Integer selectOptionalMaxCategory(){
        return optionalMapper.selectOptionalMaxCategory();
    }
}

