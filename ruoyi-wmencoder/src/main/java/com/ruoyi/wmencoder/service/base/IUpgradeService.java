package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.Upgrade;

import java.util.List;

public interface IUpgradeService {
    public int create(Upgrade upgrade);

    public int delete(int id);

    public int update(Upgrade upgrade);

    public List<Upgrade> query(Upgrade upgrade);

    public Upgrade detail(int id);
}
