package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.Engine;

import java.util.List;

public interface IEngineService {
    public int create(Engine engine);

    public int delete(int id);

    public int update(Engine engine);

    public List<Engine> query(Engine engine);

    public Engine detail(int id);
}
