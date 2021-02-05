package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.Format;

import java.util.List;

public interface FormatMapper {
    int create(Format format);
    int delete(int id);
    int update(Format format);
    List<Format> query(Format format);
    Format detail(int id);
}
