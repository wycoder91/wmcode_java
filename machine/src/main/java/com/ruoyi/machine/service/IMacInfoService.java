package com.ruoyi.machine.service;

import java.util.List;
import com.ruoyi.machine.domain.MacInfo;

/**
 * 基础信息Service接口
 * 
 * @author Tom
 * @date 2021-01-16
 */
public interface IMacInfoService 
{
    /**
     * 查询基础信息
     * 
     * @param maId 基础信息ID
     * @return 基础信息
     */
    public MacInfo selectMacInfoById(String maId);

    /**
     * 查询基础信息列表
     * 
     * @param macInfo 基础信息
     * @return 基础信息集合
     */
    public List<MacInfo> selectMacInfoList(MacInfo macInfo);

    /**
     * 新增基础信息
     *
     * @param macInfo 基础信息
     * @return 结果
     */
    public default int insertMacInfo(MacInfo macInfo) {
        return 0;
    }

    /**
     * 修改基础信息
     * 
     * @param macInfo 基础信息
     * @return 结果
     */
    public int updateMacInfo(MacInfo macInfo);

    /**
     * 批量删除基础信息
     * 
     * @param maIds 需要删除的基础信息ID
     * @return 结果
     */
    public int deleteMacInfoByIds(String[] maIds);

    /**
     * 删除基础信息信息
     * 
     * @param maId 基础信息ID
     * @return 结果
     */
    public int deleteMacInfoById(Long maId);
}
