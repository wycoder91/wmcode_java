package com.ruoyi.web.controller.wmencoder;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.wmencoder.domain.CodeInfo;
import com.ruoyi.wmencoder.domain.ConfigInfoRcv;
import com.ruoyi.wmencoder.service.ICodeInfoService;
import com.ruoyi.wmencoder.utils.WmCodeGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 整机编码Controller
 * 
 * @author Tom
 * @date 2021-01-12
 */
@RestController
@RequestMapping("/wmencoder/info")
public class CodeInfoController extends BaseController
{
    @Autowired
    private ICodeInfoService codeInfoService;

    /**
     * 查询整机编码列表
     */
    @PreAuthorize("@ss.hasPermi('wmencoder:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(CodeInfo codeInfo)
    {
        startPage();
        List<CodeInfo> list = codeInfoService.selectCodeInfoList(codeInfo);
        return getDataTable(list);
    }

    /**
     * 查询是否有对应配置项
     * @param configInfoRcv
     * @return
     */
    @PostMapping("/codeInfo")
    public CodeInfo searchWmCode(@RequestBody ConfigInfoRcv configInfoRcv){
        return codeInfoService.searchWmCodeBy(configInfoRcv);
    }
    
    /**
     * 导出整机编码列表
     */
    @PreAuthorize("@ss.hasPermi('wmencoder:info:export')")
    @Log(title = "整机编码", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(CodeInfo codeInfo)
    {
        List<CodeInfo> list = codeInfoService.selectCodeInfoList(codeInfo);
        ExcelUtil<CodeInfo> util = new ExcelUtil<CodeInfo>(CodeInfo.class);
        return util.exportExcel(list, "info");
    }

    /**
     * 获取整机编码详细信息
     */
    @PreAuthorize("@ss.hasPermi('wmencoder:info:query')")
    @GetMapping(value = "/{coderId}")
    public AjaxResult getInfo(@PathVariable("coderId") Long coderId)
    {
        return AjaxResult.success(codeInfoService.selectCodeInfoById(coderId));
    }

    /**
     * 新增整机编码
     */
    @PreAuthorize("@ss.hasPermi('wmencoder:info:add')")
    @Log(title = "整机编码", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CodeInfo codeInfo)
    {
        return toAjax(codeInfoService.insertCodeInfo(codeInfo));
    }

    /**
     * 修改整机编码
     */
    @PreAuthorize("@ss.hasPermi('wmencoder:info:edit')")
    @Log(title = "整机编码", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CodeInfo codeInfo)
    {
        return toAjax(codeInfoService.updateCodeInfo(codeInfo));
    }

    /**
     * 删除整机编码
     */
    @PreAuthorize("@ss.hasPermi('wmencoder:info:remove')")
    @Log(title = "整机编码", businessType = BusinessType.DELETE)
	@DeleteMapping("/{coderIds}")
    public AjaxResult remove(@PathVariable Long[] coderIds)
    {
        return toAjax(codeInfoService.deleteCodeInfoByIds(coderIds));
    }
}
