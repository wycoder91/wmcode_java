package com.ruoyi.wmencoder.service.impl.base;

import com.ruoyi.wmencoder.domain.base.Bucket;
import com.ruoyi.wmencoder.mapper.base.BucketMapper;
import com.ruoyi.wmencoder.service.base.IBucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BucketServiceImpl implements IBucketService {

    @Autowired
    private BucketMapper bucketMapper;
    @Override
    public int create(Bucket bucket){
        return bucketMapper.create(bucket);
    }
    @Override
    public int delete(int id){
        return bucketMapper.delete(id);
    }
    @Override
    public int update(Bucket bucket){
        return bucketMapper.update(bucket);
    }
    @Override
    public List<Bucket> query(Bucket bucket){
        return bucketMapper.query(bucket);
    }
    @Override
    public Bucket detail(int id){
        return bucketMapper.detail(id);
    }
}
