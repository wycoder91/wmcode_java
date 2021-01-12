package com.ruoyi.wmencoder.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.wmencoder.mapper.CodeInfoMapper;
import com.ruoyi.wmencoder.domain.CodeInfo;
import com.ruoyi.wmencoder.service.ICodeInfoService;

/**
 * 整机编码Service业务层处理
 * 
 * @author Tom
 * @date 2021-01-12
 */
@Service
public class CodeInfoServiceImpl implements ICodeInfoService 
{
    @Autowired
    private CodeInfoMapper codeInfoMapper;

    /**
     * 查询整机编码
     * 
     * @param coderId 整机编码ID
     * @return 整机编码
     */
    @Override
    public CodeInfo selectCodeInfoById(Long coderId)
    {
        return codeInfoMapper.selectCodeInfoById(coderId);
    }

    /**
     * 查询整机编码列表
     * 
     * @param codeInfo 整机编码
     * @return 整机编码
     */
    @Override
    public List<CodeInfo> selectCodeInfoList(CodeInfo codeInfo)
    {
        return codeInfoMapper.selectCodeInfoList(codeInfo);
    }

    /**
     * 新增整机编码
     * 
     * @param codeInfo 整机编码
     * @return 结果
     */
    @Override
    public int insertCodeInfo(CodeInfo codeInfo)
    {
        return codeInfoMapper.insertCodeInfo(codeInfo);
    }

    /**
     * 修改整机编码
     * 
     * @param codeInfo 整机编码
     * @return 结果
     */
    @Override
    public int updateCodeInfo(CodeInfo codeInfo)
    {
        return codeInfoMapper.updateCodeInfo(codeInfo);
    }

    /**
     * 批量删除整机编码
     * 
     * @param coderIds 需要删除的整机编码ID
     * @return 结果
     */
    @Override
    public int deleteCodeInfoByIds(Long[] coderIds)
    {
        return codeInfoMapper.deleteCodeInfoByIds(coderIds);
    }

    /**
     * 删除整机编码信息
     * 
     * @param coderId 整机编码ID
     * @return 结果
     */
    @Override
    public int deleteCodeInfoById(Long coderId)
    {
        return codeInfoMapper.deleteCodeInfoById(coderId);
    }
}
