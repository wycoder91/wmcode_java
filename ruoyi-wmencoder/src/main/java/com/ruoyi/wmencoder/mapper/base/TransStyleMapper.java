package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.TransStyle;

import java.util.List;

public interface TransStyleMapper {
    int create(TransStyle transStyle);
    int delete(int id);
    int update(TransStyle transStyle);
    List<TransStyle> query(TransStyle transStyle);
    TransStyle detail(int id);
}
