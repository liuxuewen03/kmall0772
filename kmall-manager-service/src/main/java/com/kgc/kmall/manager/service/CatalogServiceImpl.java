package com.kgc.kmall.manager.service;

import com.kgc.kmall.bean.*;
import com.kgc.kmall.manager.mapper.PmsBaseCatalog1Mapper;
import com.kgc.kmall.manager.mapper.PmsBaseCatalog2Mapper;
import com.kgc.kmall.manager.mapper.PmsBaseCatalog3Mapper;
import com.kgc.kmall.service.CatalogService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.security.auth.login.CredentialException;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-12-16 18:34
 */
@Component
@Service
public class CatalogServiceImpl implements CatalogService {

    @Resource
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
    @Resource
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;
    @Resource
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {

        return pmsBaseCatalog1Mapper.selectByExample(null);
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1) {
        PmsBaseCatalog2Example pmsBaseCatalog2Example = new PmsBaseCatalog2Example();
        PmsBaseCatalog2Example.Criteria criteria = pmsBaseCatalog2Example.createCriteria();
        criteria.andCatalog1IdEqualTo(catalog1);
        List<PmsBaseCatalog2> pmsBaseCatalog2s = pmsBaseCatalog2Mapper.selectByExample(pmsBaseCatalog2Example);
        return pmsBaseCatalog2s;
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(Integer catalog2) {
        PmsBaseCatalog3Example pmsBaseCatalog3Example = new PmsBaseCatalog3Example();
        PmsBaseCatalog3Example.Criteria criteria = pmsBaseCatalog3Example.createCriteria();
        criteria.andCatalog2IdEqualTo((long) catalog2);
        List<PmsBaseCatalog3> pmsBaseCatalog3s = pmsBaseCatalog3Mapper.selectByExample(pmsBaseCatalog3Example);
        return pmsBaseCatalog3s;
    }
}
