package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.Bucket;

import java.util.List;

public interface BucketMapper {
    int create(Bucket bucket);
    int delete(int id);
    int update(Bucket bucket);
    List<Bucket> query(Bucket bucket);
    Bucket detail(int id);
}
