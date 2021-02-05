package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.Upgrade;

import java.util.List;

public interface UpgradeMapper {
    int create(Upgrade upgrade);
    int delete(int id);
    int update(Upgrade upgrade);
    List<Upgrade> query(Upgrade upgrade);
    Upgrade detail(int id);
}
