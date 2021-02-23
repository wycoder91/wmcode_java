package com.ruoyi.web.controller.machine;

import java.util.ArrayList;
import java.util.List;

import com.ruoyi.common.core.page.PageDomain;
import com.ruoyi.common.core.page.TableSupport;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.machine.domain.ListPageUtil;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.machine.domain.MacInfo;
import com.ruoyi.machine.service.IMacInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基础信息Controller
 * 
 * @author Tom
 * @date 2021-01-16
 */
@RestController
@RequestMapping("/machine/info")
public class MacInfoController extends BaseController
{
    @Autowired
    private IMacInfoService macInfoService;

    /**
     * 查询基础信息列表
     */
    @PreAuthorize("@ss.hasPermi('machine:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(MacInfo macInfo)
    {
        startPage();
        List<MacInfo> list = macInfoService.selectMacInfoList(macInfo);
        PageDomain pageDomain = TableSupport.buildPageRequest();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        List<MacInfo> li=new ArrayList<MacInfo>();
        if(list.size()>0){
            ListPageUtil<MacInfo> listPageUtil = new ListPageUtil<>(list, pageNum, pageSize);
            li=listPageUtil.getPagedList();
        }
        //TableDataInfo ee=getDataTable(list);
        // return getDataTable(list);
        TableDataInfo ee=getDataTableWen(li,list);
        return getDataTableWen(li,list);
    }

    /**
     * 导出基础信息列表
     */
    @PreAuthorize("@ss.hasPermi('machine:info:export')")
    @Log(title = "基础信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(MacInfo macInfo)
    {
        List<MacInfo> list = macInfoService.selectMacInfoList(macInfo);
        ExcelUtil<MacInfo> util = new ExcelUtil<MacInfo>(MacInfo.class);
        return util.exportExcel(list, "info");
    }

    /**
     * 获取基础信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('machine:info:query')")
    @GetMapping(value = "/{maId}")
    public AjaxResult getInfo(@PathVariable("maId") String maId)
    {
        return AjaxResult.success(macInfoService.selectMacInfoById(maId));
    }

    /**
     * 新增基础信息
     */
    @PreAuthorize("@ss.hasPermi('machine:info:add')")
    @Log(title = "基础信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MacInfo macInfo)
    {
        macInfo.setMaCreater(SecurityUtils.getUsername());
        return toAjax(macInfoService.insertMacInfo(macInfo));
    }

    /**
     * 修改基础信息
     */
    @PreAuthorize("@ss.hasPermi('machine:info:edit')")
    @Log(title = "基础信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MacInfo macInfo)
    {
        macInfo.setMaUpdater(SecurityUtils.getUsername());
        return toAjax(macInfoService.updateMacInfo(macInfo));
    }

    /**
     * 删除基础信息
     */
    @PreAuthorize("@ss.hasPermi('machine:info:remove')")
    @Log(title = "基础信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{maIds2}")
    public AjaxResult remove(@PathVariable String[] maIds2)
    {
        return toAjax(macInfoService.deleteMacInfoByIds(maIds2));
    }
}
