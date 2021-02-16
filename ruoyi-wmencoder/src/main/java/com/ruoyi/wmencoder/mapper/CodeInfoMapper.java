package com.ruoyi.wmencoder.mapper;

import java.util.List;
import com.ruoyi.wmencoder.domain.CodeInfo;

/**
 * 整机编码Mapper接口
 * 
 * @author Tom
 * @date 2021-01-12
 */
public interface CodeInfoMapper 
{
    /**
     * 查询整机编码
     * 
     * @param coderId 整机编码ID
     * @return 整机编码
     */
    public CodeInfo selectCodeInfoById(Long coderId);

    /**
     * 查询整机编码列表
     * 
     * @param codeInfo 整机编码
     * @return 整机编码集合
     */
    public List<CodeInfo> selectCodeInfoList(CodeInfo codeInfo);

    /**
     * 新增整机编码
     * 
     * @param codeInfo 整机编码
     * @return 结果
     */
    public int insertCodeInfo(CodeInfo codeInfo);

    /**
     * 修改整机编码
     * 
     * @param codeInfo 整机编码
     * @return 结果
     */
    public int updateCodeInfo(CodeInfo codeInfo);

    /**
     * 删除整机编码
     * 
     * @param coderId 整机编码ID
     * @return 结果
     */
    public int deleteCodeInfoById(Long coderId);

    /**
     * 批量删除整机编码
     * 
     * @param coderIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCodeInfoByIds(Long[] coderIds);

    /**
     * 查询wmcode_info表所有项到集合
     * @return
     */
    public List<CodeInfo> selectCodeInfoListForGenerate(String coderCode);

    /**
     * 查询重复编码项
     * @param coderCode
     * @return
     */
    public CodeInfo selectReCodeCoder(String coderCode);
}
