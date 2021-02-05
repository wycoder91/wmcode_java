package com.ruoyi.wmencoder.service.impl.base;

import com.ruoyi.wmencoder.domain.base.Upgrade;
import com.ruoyi.wmencoder.mapper.base.UpgradeMapper;
import com.ruoyi.wmencoder.service.base.IUpgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpgradeServiceImpl implements IUpgradeService {

    @Autowired
    private UpgradeMapper upgradeMapper;
    @Override
    public int create(Upgrade upgrade){
        return upgradeMapper.create(upgrade);
    }
    @Override
    public int delete(int id){
        return upgradeMapper.delete(id);
    }
    @Override
    public int update(Upgrade upgrade){
        return upgradeMapper.update(upgrade);
    }
    @Override
    public List<Upgrade> query(Upgrade upgrade){
        return upgradeMapper.query(upgrade);
    }
    @Override
    public Upgrade detail(int id){
        return upgradeMapper.detail(id);
    }
}
