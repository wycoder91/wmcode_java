package com.ruoyi.wmencoder.domain;

import com.ruoyi.wmencoder.domain.base.*;

import java.util.List;

public class ConfigInfoSend {
    private List<ProductType> productTypeList;
    private List<TransStyle> transStyleList;
    private List<Tonnage> tonnageList;
    private List<Wheel> wheelList;
    private List<Special> specialList;
    private List<DynamicForms> dynamicFormsList;
    private List<Discharge> dischargeList;
    private List<Upgrade> upgradeList;
    private List<Format> formatList;
    private List<Engine> engineList;
    private List<Transmission> transmissionList;
    private List<Boom> boomList;
    private List<Bucket> bucketList;
    private List<OperationMode> operationModeList;
    private List<Sale> saleList;
    private List<Optional> optionalList;

    public List<ProductType> getProductTypeList() {
        return productTypeList;
    }

    public void setProductTypeList(List<ProductType> productTypeList) {
        this.productTypeList = productTypeList;
    }

    public List<TransStyle> getTransStyleList() {
        return transStyleList;
    }

    public void setTransStyleList(List<TransStyle> transStyleList) {
        this.transStyleList = transStyleList;
    }

    public List<Tonnage> getTonnageList() {
        return tonnageList;
    }

    public void setTonnageList(List<Tonnage> tonnageList) {
        this.tonnageList = tonnageList;
    }

    public List<Wheel> getWheelList() {
        return wheelList;
    }

    public void setWheelList(List<Wheel> wheelList) {
        this.wheelList = wheelList;
    }

    public List<Special> getSpecialList() {
        return specialList;
    }

    public void setSpecialList(List<Special> specialList) {
        this.specialList = specialList;
    }

    public List<DynamicForms> getDynamicFormsList() {
        return dynamicFormsList;
    }

    public void setDynamicFormsList(List<DynamicForms> dynamicFormsList) {
        this.dynamicFormsList = dynamicFormsList;
    }

    public List<Discharge> getDischargeList() {
        return dischargeList;
    }

    public void setDischargeList(List<Discharge> dischargeList) {
        this.dischargeList = dischargeList;
    }

    public List<Upgrade> getUpgradeList() {
        return upgradeList;
    }

    public void setUpgradeList(List<Upgrade> upgradeList) {
        this.upgradeList = upgradeList;
    }

    public List<Format> getFormatList() {
        return formatList;
    }

    public void setFormatList(List<Format> formatList) {
        this.formatList = formatList;
    }

    public List<Engine> getEngineList() {
        return engineList;
    }

    public void setEngineList(List<Engine> engineList) {
        this.engineList = engineList;
    }

    public List<Transmission> getTransmissionList() {
        return transmissionList;
    }

    public void setTransmissionList(List<Transmission> transmissionList) {
        this.transmissionList = transmissionList;
    }

    public List<Boom> getBoomList() {
        return boomList;
    }

    public void setBoomList(List<Boom> boomList) {
        this.boomList = boomList;
    }

    public List<Bucket> getBucketList() {
        return bucketList;
    }

    public void setBucketList(List<Bucket> bucketList) {
        this.bucketList = bucketList;
    }

    public List<OperationMode> getOperationModeList() {
        return operationModeList;
    }

    public void setOperationModeList(List<OperationMode> operationModeList) {
        this.operationModeList = operationModeList;
    }

    public List<Sale> getSaleList() {
        return saleList;
    }

    public void setSaleList(List<Sale> saleList) {
        this.saleList = saleList;
    }

    public List<Optional> getOptionalList() {
        return optionalList;
    }

    public void setOptionalList(List<Optional> optionalList) {
        this.optionalList = optionalList;
    }

    @Override
    public String toString() {
        return "ConfigInfo{" +
                "productTypeList=" + productTypeList +
                ", transStyleList=" + transStyleList +
                ", tonnageList=" + tonnageList +
                ", wheelList=" + wheelList +
                ", specialList=" + specialList +
                ", dynamicFormsList=" + dynamicFormsList +
                ", dischargeList=" + dischargeList +
                ", upgradeList=" + upgradeList +
                ", formatList=" + formatList +
                ", engineList=" + engineList +
                ", transmissionList=" + transmissionList +
                ", boomList=" + boomList +
                ", bucketList=" + bucketList +
                ", operationModeList=" + operationModeList +
                ", saleList=" + saleList +
                ", optionalList=" + optionalList +
                '}';
    }
}
