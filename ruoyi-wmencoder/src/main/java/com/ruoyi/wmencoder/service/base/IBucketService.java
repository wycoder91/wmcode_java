package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.Bucket;

import java.util.List;

public interface IBucketService {
    public int create(Bucket bucket);

    public int delete(int id);

    public int update(Bucket bucket);

    public List<Bucket> query(Bucket bucket);

    public Bucket detail(int id);
}
