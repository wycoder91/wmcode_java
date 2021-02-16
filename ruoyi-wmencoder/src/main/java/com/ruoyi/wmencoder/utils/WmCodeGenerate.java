package com.ruoyi.wmencoder.utils;

import com.ruoyi.wmencoder.domain.CodeInfo;
import com.ruoyi.wmencoder.domain.ConfigInfoRcv;

import java.util.List;

public class WmCodeGenerate {
    /**
     * 生成流水号
     * 先判断前十六位编码相同个数，无，直接增加整机码 return 01
     * 前十六位有重复项，在重复项中判断可选配置项重复性，无重复增加流水号，有重复报错
     * @return
     */
    public static int optionalSerialNum(List<CodeInfo> list, ConfigInfoRcv configInfoRcv){
        String[] optional = configInfoRcv.getField_optional();
        int serialNum=0,serialCompNum,optionalReNum=0,k;
        for(CodeInfo item:list){
            serialCompNum = Integer.parseInt((item.getCoderCode().substring(16)));
            if(serialCompNum > serialNum){
                serialNum = serialCompNum;
            }
            String[] tempLoaderInfo = item.getLoaderInfo().split("\\/");
            if(tempLoaderInfo.length-8 != optional.length) {
                continue;
            }
            for (String s:optional){
                for(k = 8; k < tempLoaderInfo.length; k++) {
                    if (s.equals(tempLoaderInfo[k])) {
                        optionalReNum++;
                    }
                }
            }
            if(optionalReNum < optional.length){
                optionalReNum=0;
                continue;
            }
            else{
                serialNum=-2; //发现重复配置，即数据库中已有编码无需新增
                break;
            }
        }
        return (serialNum+1);
    }

    /**
     * 查询指定
     * @param list
     * @param configInfoRcv
     * @return
     */
    public static CodeInfo apiSearchWmCode(List<CodeInfo> list, ConfigInfoRcv configInfoRcv){
        String[] optional = configInfoRcv.getField_optional();
        int optionalReNum=0,k;
        for(CodeInfo item:list){
            String[] tempLoaderInfo = item.getLoaderInfo().split("\\/");
            if(tempLoaderInfo.length-8 != optional.length) {
                continue;
            } 
            for (String s:optional){
                for(k = 8; k < tempLoaderInfo.length; k++) {
                    if (s.equals(tempLoaderInfo[k])) {
                        optionalReNum++;
                    }
                }
            }
            if(optionalReNum < optional.length){
                optionalReNum=0;
                continue;
            }
            else{
                return item; //发现重复配置
            }
        }
        return null;
    }

    /**
     * 生成标准的配置描述信息
     */
    public static String loaderInfoStandardize(ConfigInfoRcv configInfoRcv){
        String code16 = configInfoRcv.toStringCode16();
        String[] optional = configInfoRcv.getField_optional();

        String loaderInfo = "装载机/";
        String loaderName = code16.substring(0,1)+code16.substring(2,4)+'-'+code16.substring(6,8)+'/';
        loaderInfo += loaderName;
        loaderInfo += configInfoRcv.getFormatInfo()+'/';
        loaderInfo += configInfoRcv.getEngineInfo()+"发动机/";
        loaderInfo += configInfoRcv.getTransmissionInfo()+'/';
        loaderInfo += configInfoRcv.getBoomInfo()+'/';
        loaderInfo += configInfoRcv.getBucketInfo()+'/';
        loaderInfo += configInfoRcv.getOperateModeInfo()+'/';
        for(String s:optional) {
            loaderInfo += s+'/';
        }
        loaderInfo = loaderInfo.substring(0,loaderInfo.length()-1);
        return loaderInfo;
    }

}
