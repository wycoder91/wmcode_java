package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.Format;

import java.util.List;

public interface IFormatService {
    public int create(Format format);

    public int delete(int id);

    public int update(Format format);

    public List<Format> query(Format format);

    public Format detail(int id);
}
