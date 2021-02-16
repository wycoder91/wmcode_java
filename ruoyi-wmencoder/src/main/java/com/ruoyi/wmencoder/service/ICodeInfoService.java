package com.ruoyi.wmencoder.service;

import java.util.List;
import com.ruoyi.wmencoder.domain.CodeInfo;
import com.ruoyi.wmencoder.domain.ConfigInfoRcv;

/**
 * 整机编码Service接口
 * 
 * @author Tom
 * @date 2021-01-12
 */
public interface ICodeInfoService 
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
     * 批量删除整机编码
     * 
     * @param coderIds 需要删除的整机编码ID
     * @return 结果
     */
    public int deleteCodeInfoByIds(Long[] coderIds);

    /**
     * 删除整机编码信息
     * 
     * @param coderId 整机编码ID
     * @return 结果
     */
    public int deleteCodeInfoById(Long coderId);

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

    /**
     * 生成整机码及其描述
     * @param configInfoRcv
     * @return
     */
    public CodeInfo generateWmCode(ConfigInfoRcv configInfoRcv);

    /**
     * 由详细配置描述loaderInfo查询对应集合
     * @param configInfoRcv
     * @return
     */
    public CodeInfo searchWmCodeBy(ConfigInfoRcv configInfoRcv);

}
