package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.Boom;

import java.util.List;

public interface BoomMapper {
    int create(Boom boom);
    int delete(int id);
    int update(Boom boom);
    List<Boom> query(Boom boom);
    Boom detail(int id);
}
