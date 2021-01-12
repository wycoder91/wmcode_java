package com.ruoyi.wmencoder.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 整机编码对象 wmcode_info
 * 
 * @author Tom
 * @date 2021-01-12
 */
public class CodeInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编码id */
    private Long coderId;

    /** 编码号 */
    @Excel(name = "编码号")
    private String coderCode;

    /** 装载机简称 */
    @Excel(name = "装载机简称")
    private String loaderName;

    /** 装载机详细配置信息 */
    @Excel(name = "装载机详细配置信息")
    private String loaderInfo;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setCoderId(Long coderId) 
    {
        this.coderId = coderId;
    }

    public Long getCoderId() 
    {
        return coderId;
    }
    public void setCoderCode(String coderCode) 
    {
        this.coderCode = coderCode;
    }

    public String getCoderCode() 
    {
        return coderCode;
    }
    public void setLoaderName(String loaderName) 
    {
        this.loaderName = loaderName;
    }

    public String getLoaderName() 
    {
        return loaderName;
    }
    public void setLoaderInfo(String loaderInfo) 
    {
        this.loaderInfo = loaderInfo;
    }

    public String getLoaderInfo() 
    {
        return loaderInfo;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("coderId", getCoderId())
            .append("coderCode", getCoderCode())
            .append("loaderName", getLoaderName())
            .append("loaderInfo", getLoaderInfo())
            .append("status", getStatus())
            .toString();
    }
}
