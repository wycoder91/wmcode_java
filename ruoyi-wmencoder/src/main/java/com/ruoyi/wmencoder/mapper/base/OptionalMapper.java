package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.Optional;

import java.util.List;

public interface OptionalMapper {
    int create(Optional optional);
    int delete(int id);
    int update(Optional optional);
    List<Optional> query(Optional optional);
    Integer selectOptionalMaxCategory();
    Optional detail(int id);
}
