package com.kgc.kmall.manager.controller;

import com.kgc.kmall.bean.PmsBaseAttrInfo;
import com.kgc.kmall.service.AttrService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-12-16 18:44
 */
@CrossOrigin
@RestController
public class AttrController {

    @Reference
    AttrService attrService;


    @RequestMapping("attrInfoList")
    public List<PmsBaseAttrInfo> attrInfoList(Integer catalog3Id) {
        return attrService.getPmsBaseAttrInfoList(catalog3Id);
    }

}
