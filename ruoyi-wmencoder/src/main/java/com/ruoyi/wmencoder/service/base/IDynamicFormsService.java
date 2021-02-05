package com.ruoyi.wmencoder.service.base;

import com.ruoyi.wmencoder.domain.base.DynamicForms;

import java.util.List;

public interface IDynamicFormsService {
    public int create(DynamicForms dynamicForms);

    public int delete(int id);

    public int update(DynamicForms dynamicForms);

    public List<DynamicForms> query(DynamicForms dynamicForms);

    public DynamicForms detail(int id);
}
