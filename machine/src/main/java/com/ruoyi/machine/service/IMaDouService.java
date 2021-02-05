package com.ruoyi.machine.service;

import java.util.List;
import com.ruoyi.machine.domain.MaDou;

/**
 * 铲斗类型Service接口
 * 
 * @author Tom
 * @date 2021-01-31
 */
public interface IMaDouService 
{
    /**
     * 查询铲斗类型
     * 
     * @param maId 铲斗类型ID
     * @return 铲斗类型
     */
    public MaDou selectMaDouById(Long maId);

    /**
     * 查询铲斗类型列表
     * 
     * @param maDou 铲斗类型
     * @return 铲斗类型集合
     */
    public List<MaDou> selectMaDouList(MaDou maDou);

    /**
     * 新增铲斗类型
     * 
     * @param maDou 铲斗类型
     * @return 结果
     */
    public int insertMaDou(MaDou maDou);

    /**
     * 修改铲斗类型
     * 
     * @param maDou 铲斗类型
     * @return 结果
     */
    public int updateMaDou(MaDou maDou);

    /**
     * 批量删除铲斗类型
     * 
     * @param maIds 需要删除的铲斗类型ID
     * @return 结果
     */
    public int deleteMaDouByIds(Long[] maIds);

    /**
     * 删除铲斗类型信息
     * 
     * @param maId 铲斗类型ID
     * @return 结果
     */
    public int deleteMaDouById(Long maId);
}
