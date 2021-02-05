package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.Transmission;

import java.util.List;

public interface ITransmissionService {
    public int create(Transmission transmission);

    public int delete(int id);

    public int update(Transmission transmission);

    public List<Transmission> query(Transmission transmission);

    public Transmission detail(int id);
}
