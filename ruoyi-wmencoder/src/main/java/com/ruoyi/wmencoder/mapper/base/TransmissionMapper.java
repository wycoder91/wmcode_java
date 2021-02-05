package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.Transmission;

import java.util.List;

public interface TransmissionMapper {
    int create(Transmission transmission);
    int delete(int id);
    int update(Transmission transmission);
    List<Transmission> query(Transmission transmission);
    Transmission detail(int id);
}
