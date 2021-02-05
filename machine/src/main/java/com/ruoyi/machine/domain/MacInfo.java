package com.ruoyi.machine.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 基础信息对象 mac_info
 * 
 * @author Tom
 * @date 2021-01-16
 */
public class MacInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 唯一id */
    private Long maId;



    /** 代号 */
    @Excel(name = "代号")
    private String maCode;

    /** 名称 */
    @Excel(name = "名称")
    private String maName;

    /** 含义描述 */
    @Excel(name = "含义描述")
    private String maDes;

    /** 位次*/
    @Excel(name = "位次")
    private String maType;

    /** 可选配类 */
    @Excel(name = "可选配类")
    private String maOptional;



    /** 创建者 */
    @Excel(name = "创建者")
    private String maCreater;



    /** 更新者 */
    @Excel(name = "更新者")
    private String maUpdater;



    /** 可选配置类型 */
    @Excel(name = "可选配置类型")
    private String category;

    /** 备用1 */
    @Excel(name = "备用1")
    private String maNote1;

    /** 备用2 */
    @Excel(name = "备用2")
    private Long maNote2;

    public void setMaId(Long maId) 
    {
        this.maId = maId;
    }

    public Long getMaId() 
    {
        return maId;
    }

    public void setMaCode(String maCode) { this.maCode = maCode; }
    public String getMaCode() { return maCode; }

    public void setMaName(String maName) 
    {
        this.maName = maName;
    }

    public String getMaName() 
    {
        return maName;
    }
    public void setMaDes(String maDes) 
    {
        this.maDes = maDes;
    }

    public String getMaDes() 
    {
        return maDes;
    }
    public void setMaType(String maType)
    {
        this.maType = maType;
    }

    public String getMaType()
    {
        return maType;
    }

    public void setMaOptional(String maOptional) { this.maOptional = maOptional; }
    public String getMaOptional() { return maOptional; }

    public String getMaCreater() {
        return maCreater;
    }

    public void setMaCreater(String maCreater) {
        this.maCreater = maCreater;
    }

    public String getMaUpdater() {
        return maUpdater;
    }

    public void setMaUpdater(String maUpdater) {
        this.maUpdater = maUpdater;
    }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public void setMaNote1(String maNote1) 
    {
        this.maNote1 = maNote1;
    }
    public String getMaNote1() 
    {
        return maNote1;
    }
    public void setMaNote2(Long maNote2) 
    {
        this.maNote2 = maNote2;
    }

    public Long getMaNote2() 
    {
        return maNote2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("maId", getMaId())
                .append("maCode", getMaCode())
            .append("maName", getMaName())
            .append("maDes", getMaDes())
            .append("maType", getMaType())
                .append("maOptional", getMaOptional())
                .append("maCreater", getMaCreater())
                .append("maUpdater", getMaUpdater())
                .append("category", getCategory())
            .append("maNote1", getMaNote1())
            .append("maNote2", getMaNote2())
            .toString();
    }
}
