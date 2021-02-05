package com.ruoyi.wmencoder.domain;

public class ConfigInfoRcv {

    private String field_boom;
    private String field_bucket;
    private String field_discharge;
    private String field_dynamic_forms;
    private String field_engine;
    private String field_format;
    private String field_operate_mode;
    private String[] field_optional;
    private String field_product_type;
    private String field_sale;
    private String field_special;
    private String field_tonnage;
    private String field_trans_style;
    private String field_transmission;
    private String field_upgrade;
    private String field_wheel;

    public String getField_boom() {
        return field_boom;
    }

    public void setField_boom(String field_boom) {
        this.field_boom = field_boom;
    }

    public String getField_bucket() {
        return field_bucket;
    }

    public void setField_bucket(String field_bucket) {
        this.field_bucket = field_bucket;
    }

    public String getField_discharge() {
        return field_discharge;
    }

    public void setField_discharge(String field_discharge) {
        this.field_discharge = field_discharge;
    }

    public String getField_dynamic_forms() {
        return field_dynamic_forms;
    }

    public void setField_dynamic_forms(String field_dynamic_forms) {
        this.field_dynamic_forms = field_dynamic_forms;
    }

    public String getField_engine() {
        return field_engine;
    }

    public void setField_engine(String field_engine) {
        this.field_engine = field_engine;
    }

    public String getField_format() {
        return field_format;
    }

    public void setField_format(String field_format) {
        this.field_format = field_format;
    }

    public String getField_operate_mode() {
        return field_operate_mode;
    }

    public void setField_operate_mode(String field_operate_mode) {
        this.field_operate_mode = field_operate_mode;
    }

    public String[] getField_optional() {
        return field_optional;
    }

    public void setField_optional(String[] field_optional) {
        this.field_optional = field_optional;
    }

    public String getField_product_type() {
        return field_product_type;
    }

    public void setField_product_type(String field_product_type) {
        this.field_product_type = field_product_type;
    }

    public String getField_sale() {
        return field_sale;
    }

    public void setField_sale(String field_sale) {
        this.field_sale = field_sale;
    }

    public String getField_special() {
        return field_special;
    }

    public void setField_special(String field_special) {
        this.field_special = field_special;
    }

    public String getField_tonnage() {
        return field_tonnage;
    }

    public void setField_tonnage(String field_tonnage) {
        this.field_tonnage = field_tonnage;
    }

    public String getField_trans_style() {
        return field_trans_style;
    }

    public void setField_trans_style(String field_trans_style) {
        this.field_trans_style = field_trans_style;
    }

    public String getField_transmission() {
        return field_transmission;
    }

    public void setField_transmission(String field_transmission) {
        this.field_transmission = field_transmission;
    }

    public String getField_upgrade() {
        return field_upgrade;
    }

    public void setField_upgrade(String field_upgrade) {
        this.field_upgrade = field_upgrade;
    }

    public String getField_wheel() {
        return field_wheel;
    }

    public void setField_wheel(String field_wheel) {
        this.field_wheel = field_wheel;
    }


    public String toStringCode16() {
        return    field_product_type.substring(0,field_product_type.indexOf(':'))
                + field_trans_style.substring(0,field_trans_style.indexOf(':'))
                + field_tonnage.substring(0,field_tonnage.indexOf(':'))
                + field_wheel.substring(0,field_wheel.indexOf(':'))
                + field_special.substring(0,field_special.indexOf(':'))
                + field_dynamic_forms.substring(0,field_dynamic_forms.indexOf(':'))
                + field_discharge.substring(0,field_discharge.indexOf(':'))
                + field_upgrade.substring(0,field_upgrade.indexOf(':'))
                + field_format.substring(0,field_format.indexOf(':'))
                + field_engine.substring(0,field_engine.indexOf(':'))
                + field_transmission.substring(0,field_transmission.indexOf(':'))
                + field_boom.substring(0,field_boom.indexOf(':'))
                + field_bucket.substring(0,field_bucket.indexOf(':'))
                + field_operate_mode.substring(0,field_operate_mode.indexOf(':'))
                + field_sale.substring(0,field_sale.indexOf(':'));
    }
    public String getFormatInfo(){
        return field_format.substring(field_format.indexOf(':')+1);
    }
    public String getEngineInfo(){
        return field_engine.substring(field_engine.indexOf(':')+1);
    }
    public String getTransmissionInfo(){
        return field_transmission.substring(field_transmission.indexOf(':')+1);
    }
    public String getBoomInfo(){
        return field_boom.substring(field_boom.indexOf(':')+1);
    }
    public String getBucketInfo(){
        return field_bucket.substring(field_bucket.indexOf(':')+1);
    }
    public String getOperateModeInfo(){
        return field_operate_mode.substring(field_operate_mode.indexOf(':')+1);
    }
}
