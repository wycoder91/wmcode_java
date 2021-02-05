package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.TransStyle;

import java.util.List;

public interface ITransStyleService {
    public int create(TransStyle transStyle);

    public int delete(int id);

    public int update(TransStyle transStyle);

    public List<TransStyle> query(TransStyle transStyle);

    public TransStyle detail(int id);
}
