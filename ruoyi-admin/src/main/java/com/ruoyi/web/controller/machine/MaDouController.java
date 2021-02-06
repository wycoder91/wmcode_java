package com.ruoyi.web.controller.machine;

import java.util.List;
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
import com.ruoyi.machine.domain.MaDou;
import com.ruoyi.machine.service.IMaDouService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 铲斗类型Controller
 * 
 * @author Tom
 * @date 2021-01-31
 */
@RestController
@RequestMapping("/machine/dou")
public class MaDouController extends BaseController
{
    @Autowired
    private IMaDouService maDouService;

    /**
     * 查询铲斗类型列表
     */
    @PreAuthorize("@ss.hasPermi('machine:dou:list')")
    @GetMapping("/list")
    public TableDataInfo list(MaDou maDou)
    {
        startPage();
        List<MaDou> list = maDouService.selectMaDouList(maDou);
        TableDataInfo dd=getDataTable(list);
        return getDataTable(list);
    }

    /**
     * 导出铲斗类型列表
     */
    @PreAuthorize("@ss.hasPermi('machine:dou:export')")
    @Log(title = "铲斗类型", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(MaDou maDou)
    {
        List<MaDou> list = maDouService.selectMaDouList(maDou);
        ExcelUtil<MaDou> util = new ExcelUtil<MaDou>(MaDou.class);
        return util.exportExcel(list, "dou");
    }

    /**
     * 获取铲斗类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('machine:dou:query')")
    @GetMapping(value = "/{maId}")
    public AjaxResult getInfo(@PathVariable("maId") Long maId)
    {
        return AjaxResult.success(maDouService.selectMaDouById(maId));
    }

    /**
     * 新增铲斗类型
     */
    @PreAuthorize("@ss.hasPermi('machine:dou:add')")
    @Log(title = "铲斗类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MaDou maDou)
    {

        return toAjax(maDouService.insertMaDou(maDou));
    }

    /**
     * 修改铲斗类型
     */
    @PreAuthorize("@ss.hasPermi('machine:dou:edit')")
    @Log(title = "铲斗类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MaDou maDou)
    {

        return toAjax(maDouService.updateMaDou(maDou));
    }

    /**
     * 删除铲斗类型
     */
    @PreAuthorize("@ss.hasPermi('machine:dou:remove')")
    @Log(title = "铲斗类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{maIds}")
    public AjaxResult remove(@PathVariable Long[] maIds)
    {
        return toAjax(maDouService.deleteMaDouByIds(maIds));
    }
}
