package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.Engine;

import java.util.List;

public interface EngineMapper {
    int create(Engine engine);
    int delete(int id);
    int update(Engine engine);
    List<Engine> query(Engine engine);
    Engine detail(int id);
}
