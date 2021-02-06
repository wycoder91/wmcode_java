package com.ruoyi.machine.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.machine.mapper.ReMaDouMapper;
import com.ruoyi.machine.domain.MaDou;
import com.ruoyi.machine.service.IMaDouService;

/**
 * 铲斗类型Service业务层处理
 * 
 * @author Tom
 * @date 2021-01-31
 */
@Service
public class MaDouServiceImpl implements IMaDouService
{
    @Autowired
    private ReMaDouMapper maDouMapper;

    /**
     * 查询铲斗类型
     * 
     * @param maId 铲斗类型ID
     * @return 铲斗类型
     */
    @Override
    public MaDou selectMaDouById(Long maId)
    {
        return maDouMapper.selectMaDouById(maId);
    }

    /**
     * 查询铲斗类型列表
     * 
     * @param maDou 铲斗类型
     * @return 铲斗类型
     */
    @Override
    public List<MaDou> selectMaDouList(MaDou maDou)
    {
        return maDouMapper.selectMaDouList(maDou);
    }

    /**
     * 新增铲斗类型
     * 
     * @param maDou 铲斗类型
     * @return 结果
     */
    @Override
    public int insertMaDou(MaDou maDou)
    {
        return maDouMapper.insertMaDou(maDou);
    }

    /**
     * 修改铲斗类型
     * 
     * @param maDou 铲斗类型
     * @return 结果
     */
    @Override
    public int updateMaDou(MaDou maDou)
    {

        return maDouMapper.updateMaDou(maDou);
    }

    /**
     * 批量删除铲斗类型
     * 
     * @param maIds 需要删除的铲斗类型ID
     * @return 结果
     */
    @Override
    public int deleteMaDouByIds(Long[] maIds)
    {
        return maDouMapper.deleteMaDouByIds(maIds);
    }

    /**
     * 删除铲斗类型信息
     * 
     * @param maId 铲斗类型ID
     * @return 结果
     */
    @Override
    public int deleteMaDouById(Long maId)
    {
        return maDouMapper.deleteMaDouById(maId);
    }
}
