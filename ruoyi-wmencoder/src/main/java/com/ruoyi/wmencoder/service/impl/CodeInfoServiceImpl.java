package com.ruoyi.wmencoder.service.impl;

import java.util.List;

import com.ruoyi.wmencoder.domain.ConfigInfoRcv;
import com.ruoyi.wmencoder.utils.WmCodeGenerate;
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

    /**
     * 查询wmcode_info表所有项到集合
     * @return
     */
    @Override
    public List<CodeInfo> selectCodeInfoListForGenerate(String coderCode){
        return codeInfoMapper.selectCodeInfoListForGenerate(coderCode);
    }

    /**
     * 查询重复编码项
     * @param coderCode
     * @return
     */
    @Override
    public CodeInfo selectReCodeCoder(String coderCode){
        return codeInfoMapper.selectReCodeCoder(coderCode);
    }

    /**
     * 由详细配置描述loaderInfo查询对应集合
     * @param configInfoRcv
     * @return
     */
    @Override
    public CodeInfo searchWmCodeBy(ConfigInfoRcv configInfoRcv){
        String code16 = configInfoRcv.toStringCode16();
        System.out.println("搜索：code16="+code16);
        List<CodeInfo> list = selectCodeInfoListForGenerate(code16);
        return (WmCodeGenerate.apiSearchWmCode(list,configInfoRcv));
    }

    /**
     * 生成整机码及其描述
     * @param configInfoRcv
     * @return
     */
    @Override
    public CodeInfo generateWmCode(ConfigInfoRcv configInfoRcv){
        int serialNum=0;
        String coderCode=null,loaderName=null,loaderInfo=null;
        String[] optional = configInfoRcv.getField_optional();
        String code16 = configInfoRcv.toStringCode16();
        loaderName = code16.substring(0,1)+code16.substring(2,4)+'-'+code16.substring(6,8);
        List<CodeInfo> list = selectCodeInfoListForGenerate(code16);
        CodeInfo codeInfo = new CodeInfo();

        System.out.println(code16);
        for (int i=0;i<optional.length;i++) {
            System.out.println(optional[i]);
        }

        serialNum = WmCodeGenerate.optionalSerialNum(list, configInfoRcv);
        if(serialNum == -1){
            System.out.println("生成中：重复配置！");
            return null;
        }else {
            if (serialNum < 10) {
                coderCode = code16 + '0' + Integer.toString(serialNum);
            } else {
                coderCode = code16 + Integer.toString(serialNum);
            }
            loaderInfo = WmCodeGenerate.loaderInfoStandardize(configInfoRcv);
        }
        codeInfo.setCoderCode(coderCode);
        codeInfo.setLoaderName(loaderName);
        codeInfo.setLoaderInfo(loaderInfo);
        return codeInfo;
    }
}
