package com.ruoyi.machine.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.machine.mapper.ReMacInfoMapper;
import com.ruoyi.machine.domain.MacInfo;
import com.ruoyi.machine.service.IMacInfoService;
import com.ruoyi.machine.mapper.ReProductTypeMapper;
import com.ruoyi.machine.mapper.ReTransStyleMapper;
import com.ruoyi.machine.mapper.ReTonnageMapper;
import com.ruoyi.machine.mapper.ReWheelMapper;
import com.ruoyi.machine.mapper.ReSpecialMapper;
import com.ruoyi.machine.mapper.ReDynamicFormsMapper;
import com.ruoyi.machine.mapper.ReDischargeMapper;
import com.ruoyi.machine.mapper.ReUpgradeMapper;
import com.ruoyi.machine.mapper.ReFormatMapper;
import com.ruoyi.machine.mapper.ReEngineMapper;
import com.ruoyi.machine.mapper.ReTransmissionMapper;
import com.ruoyi.machine.mapper.ReBoomMapper;
import com.ruoyi.machine.mapper.ReBucketMapper;
import com.ruoyi.machine.mapper.ReOperationModeMapper;
import com.ruoyi.machine.mapper.ReOptionalMapper;
import com.ruoyi.machine.mapper.ReSaleMapper;


/**
 * 基础信息Service业务层处理
 *
 * @author Tom
 * @date 2021-01-16
 */
@Service
public class MacInfoServiceImpl implements IMacInfoService {
    @Autowired
    private ReMacInfoMapper macInfoMapper;
    @Autowired
    private ReProductTypeMapper productMapper;//1
    @Autowired
    private ReTransStyleMapper transMapper;//2
    @Autowired
    private ReTonnageMapper tonnageMapper;//3
    @Autowired
    private ReWheelMapper wheelMapper;//4
    @Autowired
    private ReSpecialMapper specialMapper;//5
    @Autowired
    private ReDynamicFormsMapper dynamicMapper;//6
    @Autowired
    private ReDischargeMapper dischargeMapper;//7
    @Autowired
    private ReUpgradeMapper upgradeMapper;//8
    @Autowired
    private ReFormatMapper formatMapper;//9'10
    @Autowired
    private ReEngineMapper engineMapper;//11
    @Autowired
    private ReTransmissionMapper transmissionMapper;//12
    @Autowired
    private ReBoomMapper boomMapper;//13
    @Autowired
    private ReBucketMapper bucketMapper;//14
    @Autowired
    private ReOperationModeMapper operationModeMapper;//15
    @Autowired
    private ReSaleMapper saleMapper;//16
    @Autowired
    private ReOptionalMapper optionalMapper;//17'18


    /**
     * 查询基础信息
     *
     * @param maId 基础信息ID
     * @return 基础信息
     */
    @Override
    public MacInfo selectMacInfoById(String maId) {
        String[] item = maId.split("\\.");
        String typecode=item[1];
        if (typecode.equals("1")) {
            return productMapper.detail(Integer.valueOf(item[0]));

        } else if (typecode.equals("2")) {
            return transMapper.detail(Integer.valueOf(item[0]));
        } else if (typecode.equals("3")) {
            return tonnageMapper.detail(Integer.valueOf(item[0]));
        } else if (typecode.equals("4")) {
            return wheelMapper.detail(Integer.valueOf(item[0]));
        } else if (typecode.equals("5")) {
            return specialMapper.detail(Integer.valueOf(item[0]));
        } else if (typecode.equals("6")) {
            return dynamicMapper.detail(Integer.valueOf(item[0]));
        } else if (typecode.equals("7")) {
            return dischargeMapper.detail(Integer.valueOf(item[0]));
        } else if (typecode.equals("8")) {
            return upgradeMapper.detail(Integer.valueOf(item[0]));
        } else if (typecode.equals("9")) {
            return formatMapper.detail(Integer.valueOf(item[0]));
        } else if (typecode.equals("11")) {
            return engineMapper.detail(Integer.valueOf(item[0]));
        } else if (typecode.equals("12")) {
            return transmissionMapper.detail(Integer.valueOf(item[0]));
        } else if (typecode.equals("13")) {
            return boomMapper.detail(Integer.valueOf(item[0]));
        } else if (typecode.equals("14")) {
            return bucketMapper.detail(Integer.valueOf(item[0]));
        } else if (typecode.equals("15")) {
            return operationModeMapper.detail(Integer.valueOf(item[0]));
        } else if (typecode.equals("16")) {
            return saleMapper.detail(Integer.valueOf(item[0]));

        } else {
            return optionalMapper.detail(Integer.valueOf(item[0]));
        }
       // return macInfoMapper.selectMacInfoById(Long.valueOf(item[0]));
    }

    /**
     * 查询基础信息列表
     *
     * @param macInfo 基础信息
     * @return 基础信息
     */
    @Override
    public List<MacInfo> selectMacInfoList(MacInfo macInfo) {
        //List<MacInfo>  list2=macInfoMapper.selectMacInfoList(macInfo);
        //从个表查询
        List<MacInfo> listTall = new ArrayList<MacInfo>();
        List<MacInfo> list1 = productMapper.query(macInfo);//1
        List<MacInfo> list2 = transMapper.query(macInfo);//2
        List<MacInfo> list3 = tonnageMapper.query(macInfo);//3
        List<MacInfo> list4 = wheelMapper.query(macInfo);//4
        List<MacInfo> list5 = specialMapper.query(macInfo);//5
        List<MacInfo> list6 = dynamicMapper.query(macInfo);//6
        List<MacInfo> list7 = dischargeMapper.query(macInfo);//7
        List<MacInfo> list8 = upgradeMapper.query(macInfo);//8
        List<MacInfo> list9 = formatMapper.query(macInfo);//9'10
        List<MacInfo> list11 = engineMapper.query(macInfo);//11
        List<MacInfo> list12 = transmissionMapper.query(macInfo);//12
        List<MacInfo> list13 = boomMapper.query(macInfo);//13
        List<MacInfo> list14 = bucketMapper.query(macInfo);//14
        List<MacInfo> list15 = operationModeMapper.query(macInfo);//15
        List<MacInfo> list16 = saleMapper.query(macInfo);//16
        List<MacInfo> list17 = optionalMapper.query(macInfo);//17'18
        //添加到集合
        listTall.addAll(list1);
        listTall.addAll(list2);
        listTall.addAll(list3);
        listTall.addAll(list4);
        listTall.addAll(list5);
        listTall.addAll(list6);
        listTall.addAll(list7);
        listTall.addAll(list8);
        listTall.addAll(list9);
        listTall.addAll(list11);
        listTall.addAll(list12);
        listTall.addAll(list13);
        listTall.addAll(list14);
        listTall.addAll(list15);
        listTall.addAll(list16);
        listTall.addAll(list17);
        return listTall;
    }

    /**
     * 新增基础信息
     *
     * @param macInfo 基础信息
     * @return 结果
     */
    @Override
    public int insertMacInfo(MacInfo macInfo) {
        String typecode = macInfo.getMaType();
        if (typecode.equals("1")) {
            return productMapper.create(macInfo);

        } else if (typecode.equals("2")) {
            return transMapper.create(macInfo);
        } else if (typecode.equals("3")) {
            return tonnageMapper.create(macInfo);
        } else if (typecode.equals("4")) {
            return wheelMapper.create(macInfo);
        } else if (typecode.equals("5")) {
            return specialMapper.create(macInfo);
        } else if (typecode.equals("6")) {
            return dynamicMapper.create(macInfo);
        } else if (typecode.equals("7")) {
            return dischargeMapper.create(macInfo);
        } else if (typecode.equals("8")) {
            return upgradeMapper.create(macInfo);
        } else if (typecode.equals("9")) {
            return formatMapper.create(macInfo);
        } else if (typecode.equals("11")) {
            return engineMapper.create(macInfo);
        } else if (typecode.equals("12")) {
            return transmissionMapper.create(macInfo);
        } else if (typecode.equals("13")) {
            return boomMapper.create(macInfo);
        } else if (typecode.equals("14")) {
            return bucketMapper.create(macInfo);
        } else if (typecode.equals("15")) {
            return operationModeMapper.create(macInfo);
        } else if (typecode.equals("16")) {
            return saleMapper.create(macInfo);

        } else {
            return optionalMapper.create(macInfo);
        }
    }

    /**
     * 修改基础信息
     *
     * @param macInfo 基础信息
     * @return 结果
     */
    @Override
    public int updateMacInfo(MacInfo macInfo) {
        String typecode = macInfo.getMaType();
        if (typecode.equals("1")) {
            return productMapper.update(macInfo);

        } else if (typecode.equals("2")) {
            return transMapper.update(macInfo);
        } else if (typecode.equals("3")) {
            return tonnageMapper.update(macInfo);
        } else if (typecode.equals("4")) {
            return wheelMapper.update(macInfo);
        } else if (typecode.equals("5")) {
            return specialMapper.update(macInfo);
        } else if (typecode.equals("6")) {
            return dynamicMapper.update(macInfo);
        } else if (typecode.equals("7")) {
            return dischargeMapper.update(macInfo);
        } else if (typecode.equals("8")) {
            return upgradeMapper.update(macInfo);
        } else if (typecode.equals("9")) {
            return formatMapper.update(macInfo);
        } else if (typecode.equals("11")) {
            return engineMapper.update(macInfo);
        } else if (typecode.equals("12")) {
            return transmissionMapper.update(macInfo);
        } else if (typecode.equals("13")) {
            return boomMapper.update(macInfo);
        } else if (typecode.equals("14")) {
            return bucketMapper.update(macInfo);
        } else if (typecode.equals("15")) {
            return operationModeMapper.update(macInfo);
        } else if (typecode.equals("16")) {
            return saleMapper.update(macInfo);

        } else {
            return optionalMapper.update(macInfo);
        }

        //return macInfoMapper.updateMacInfo(macInfo);
    }

    /**
     * 批量删除基础信息
     *
     * @param maIds 需要删除的基础信息ID
     * @return 结果
     */
    @Override
    public int deleteMacInfoByIds(String[] maIds) {
        int re=3;
        if (maIds.length > 0) {

            for (int i = 0; i < maIds.length; i++) {
                String[] item = maIds[i].split("\\.");

                if (item[1].equals("1")) {
                    re = productMapper.delete(Integer.valueOf(item[0]));
                } else if (item[1].equals("2")) {
                    re = transMapper.delete(Integer.valueOf(item[0]));
                } else if (item[1].equals("3")) {
                    re = tonnageMapper.delete(Integer.valueOf(item[0]));
                } else if (item[1].equals("4")) {
                    re = wheelMapper.delete(Integer.valueOf(item[0]));
                } else if (item[1].equals("5")) {
                    re = specialMapper.delete(Integer.valueOf(item[0]));
                } else if (item[1].equals("6")) {
                    re = dynamicMapper.delete(Integer.valueOf(item[0]));
                } else if (item[1].equals("7")) {
                    re = dischargeMapper.delete(Integer.valueOf(item[0]));
                } else if (item[1].equals("8")) {
                    re = upgradeMapper.delete(Integer.valueOf(item[0]));
                } else if (item[1].equals("9")) {
                    re = formatMapper.delete(Integer.valueOf(item[0]));
                } else if (item[1].equals("11")) {
                    re = engineMapper.delete(Integer.valueOf(item[0]));
                } else if (item[1].equals("12")) {
                    re = transmissionMapper.delete(Integer.valueOf(item[0]));
                } else if (item[1].equals("13")) {
                    re = boomMapper.delete(Integer.valueOf(item[0]));
                } else if (item[1].equals("14")) {
                    re = bucketMapper.delete(Integer.valueOf(item[0]));
                } else if (item[1].equals("15")) {
                    re = operationModeMapper.delete(Integer.valueOf(item[0]));
                } else if (item[1].equals("16")) {
                    re = saleMapper.delete(Integer.valueOf(item[0]));
                } else {
                    re = optionalMapper.delete(Integer.valueOf(item[0]));
                }
                /*{

                   re=macInfoMapper.deleteMacInfoById(Long.valueOf(item[0]));
                }*/
            }
        }
        return re;


    }
    /**
     * 删除基础信息信息
     *
     * @param maId 基础信息ID
     * @return 结果
     */
    @Override
    public int deleteMacInfoById(Long maId) {
        return macInfoMapper.deleteMacInfoById(maId);
    }
}
