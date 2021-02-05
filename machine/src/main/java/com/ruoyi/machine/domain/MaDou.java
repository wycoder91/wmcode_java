package com.ruoyi.machine.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 铲斗类型对象 ma_dou
 * 
 * @author Tom
 * @date 2021-01-31
 */
public class MaDou extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long maId;

    /** 机型编码 */
    private String maCode;

    /** 机型名称 */
    @Excel(name = "机型名称")
    private String maName;

    /** 铲斗编码 */
    private String maDoucode;

    /** 铲斗名称 */
    @Excel(name = "铲斗名称")
    private String maDouname;

    /** 具体内容 */
    @Excel(name = "具体内容")
    private String maDoucontent;

    /** 备用1 */
    private String maNote1;

    /** 备用2 */
    private Long maNote2;

    public void setMaId(Long maId) 
    {
        this.maId = maId;
    }

    public Long getMaId() 
    {
        return maId;
    }
    public void setMaCode(String maCode) 
    {
        this.maCode = maCode;
    }

    public String getMaCode() 
    {
        return maCode;
    }
    public void setMaName(String maName) 
    {
        this.maName = maName;
    }

    public String getMaName() 
    {
        return maName;
    }
    public void setMaDoucode(String maDoucode) 
    {
        this.maDoucode = maDoucode;
    }

    public String getMaDoucode() 
    {
        return maDoucode;
    }
    public void setMaDouname(String maDouname) 
    {
        this.maDouname = maDouname;
    }

    public String getMaDouname() 
    {
        return maDouname;
    }
    public void setMaDoucontent(String maDoucontent) 
    {
        this.maDoucontent = maDoucontent;
    }

    public String getMaDoucontent() 
    {
        return maDoucontent;
    }
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
            .append("maDoucode", getMaDoucode())
            .append("maDouname", getMaDouname())
            .append("maDoucontent", getMaDoucontent())
            .append("maNote1", getMaNote1())
            .append("maNote2", getMaNote2())
            .toString();
    }
}
