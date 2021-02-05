package com.ruoyi.wmencoder.service.impl.base;

import com.ruoyi.wmencoder.domain.base.DynamicForms;
import com.ruoyi.wmencoder.mapper.base.DynamicFormsMapper;
import com.ruoyi.wmencoder.service.base.IDynamicFormsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DynamicFormsServiceImpl implements IDynamicFormsService {

    @Autowired
    private DynamicFormsMapper dynamicFormsMapper;
    @Override
    public int create(DynamicForms dynamicForms){
        return dynamicFormsMapper.create(dynamicForms);
    }
    @Override
    public int delete(int id){
        return dynamicFormsMapper.delete(id);
    }
    @Override
    public int update(DynamicForms dynamicForms){
        return dynamicFormsMapper.update(dynamicForms);
    }
    @Override
    public List<DynamicForms> query(DynamicForms dynamicForms){
        return dynamicFormsMapper.query(dynamicForms);
    }
    @Override
    public DynamicForms detail(int id){
        return dynamicFormsMapper.detail(id);
    }
}
