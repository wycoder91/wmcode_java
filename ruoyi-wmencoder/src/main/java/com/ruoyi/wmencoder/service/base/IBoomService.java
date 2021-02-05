package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.Boom;

import java.util.List;

public interface IBoomService {
    public int create(Boom boom);

    public int delete(int id);

    public int update(Boom boom);

    public List<Boom> query(Boom boom);

    public Boom detail(int id);
}
