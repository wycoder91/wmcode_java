package com.ruoyi.machine.mapper;



import java.util.List;
import com.ruoyi.machine.domain.MacInfo;

public interface ReProductTypeMapper {
    int create(MacInfo productType);
    int delete(int id);
    int update(MacInfo productType);
    List<MacInfo> query(MacInfo productType);
    MacInfo detail(int id);
}
