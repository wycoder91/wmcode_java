package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.Optional;

import java.util.List;

public interface IOptionalService {
    public int create(Optional optional);

    public int delete(int id);

    public int update(Optional optional);

    public List<Optional> query(Optional optional);

    public Optional detail(int id);

    public Integer selectOptionalMaxCategory();
}
