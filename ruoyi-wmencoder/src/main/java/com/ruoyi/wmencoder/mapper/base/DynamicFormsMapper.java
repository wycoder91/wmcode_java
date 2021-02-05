package com.ruoyi.wmencoder.mapper.base;

import com.ruoyi.wmencoder.domain.base.DynamicForms;

import java.util.List;

public interface DynamicFormsMapper {
    int create(DynamicForms dynamicForms);
    int delete(int id);
    int update(DynamicForms dynamicForms);
    List<DynamicForms> query(DynamicForms dynamicForms);
    DynamicForms detail(int id);
}
