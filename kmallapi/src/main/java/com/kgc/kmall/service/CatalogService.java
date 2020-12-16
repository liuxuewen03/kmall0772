package com.kgc.kmall.service;

import com.kgc.kmall.bean.PmsBaseCatalog1;
import com.kgc.kmall.bean.PmsBaseCatalog2;
import com.kgc.kmall.bean.PmsBaseCatalog3;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-12-16 18:32
 */
public interface CatalogService {
    List<PmsBaseCatalog1> getCatalog1();


    List<PmsBaseCatalog2> getCatalog2(Integer catalog1);


    List<PmsBaseCatalog3> getCatalog3(Integer catalog2);

}
