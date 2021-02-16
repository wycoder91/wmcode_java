package com.ruoyi.web.controller.wmencoder;

import com.ruoyi.wmencoder.domain.*;
import com.ruoyi.wmencoder.service.*;
import com.ruoyi.wmencoder.service.base.*;
import com.ruoyi.wmencoder.utils.WmCodeGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/wmencoder/generate")
public class CodeGenerateController {

    @Autowired
    private IProductTypeService productTypeService;
    @Autowired
    private ITransStyleService transStyleService;
    @Autowired
    private ITonnageService tonnageService;
    @Autowired
    private IWheelService wheelService;
    @Autowired
    private ISpecialService specialService;
    @Autowired
    private IDynamicFormsService dynamicFormsService;
    @Autowired
    private IDischargeService dischargeService;
    @Autowired
    private IUpgradeService          upgradeService;
    @Autowired
    private IFormatService           formatService;
    @Autowired
    private IEngineService engineService;
    @Autowired
    private ITransmissionService     transmissionService;
    @Autowired
    private IBoomService boomService;
    @Autowired
    private IBucketService bucketService;
    @Autowired
    private IOperationModeService    operationModeService;
    @Autowired
    private ISaleService             saleService;
    @Autowired
    private IOptionalService          optionalService;

    @Autowired
    private ICodeInfoService codeInfoService;

    @GetMapping("/configInfo")
    public ConfigInfoSend configInfoQuery(){
        ConfigInfoSend configInfoSend = new ConfigInfoSend();
        configInfoSend.setProductTypeList(productTypeService.query(null));
        configInfoSend.setTransStyleList(transStyleService.query(null));
        configInfoSend.setTonnageList(tonnageService.query(null));
        configInfoSend.setWheelList(wheelService.query(null));
        configInfoSend.setSpecialList(specialService.query(null));
        configInfoSend.setDynamicFormsList(dynamicFormsService.query(null));
        configInfoSend.setDischargeList(dischargeService.query(null));
        configInfoSend.setUpgradeList(upgradeService.query(null));
        configInfoSend.setFormatList(formatService.query(null));
        configInfoSend.setEngineList(engineService.query(null));
        configInfoSend.setTransmissionList(transmissionService.query(null));
        configInfoSend.setBoomList(boomService.query(null));
        configInfoSend.setBucketList(bucketService.query(null));
        configInfoSend.setOperationModeList(operationModeService.query(null));
        configInfoSend.setSaleList(saleService.query(null));
        configInfoSend.setOptionalList(optionalService.query(null));
        return configInfoSend;
    }

    @GetMapping("/selectMaxCategory")
    public int selectOptionalMaxCategory(){
        return optionalService.selectOptionalMaxCategory();
    }

    @PostMapping("/loaderInfo")
    public CodeInfo generateLoaderInfo(@RequestBody ConfigInfoRcv configInfoRcv){
        CodeInfo codeInfo = new CodeInfo();
        String loaderInfo = WmCodeGenerate.loaderInfoStandardize(configInfoRcv);
        codeInfo.setLoaderInfo(loaderInfo);
        return codeInfo;
    }

    @PostMapping("/wmCode")
    public CodeInfo generateWmCode(@RequestBody ConfigInfoRcv configInfoRcv){
        CodeInfo codeInfo;
        codeInfo = codeInfoService.generateWmCode(configInfoRcv);
        if(codeInfo != null) {
            CodeInfo tempCodeInfo = codeInfoService.selectReCodeCoder(codeInfo.getCoderCode());
            if(tempCodeInfo == null) {
                codeInfoService.insertCodeInfo(codeInfo);
            }
            else{
                System.out.println("生成后：编码重复 coderCode="+codeInfo.getCoderCode());
                codeInfo = null;
            }
        }
        return codeInfo;
    }
}
