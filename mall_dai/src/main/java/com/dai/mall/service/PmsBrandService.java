package com.dai.mall.service;

import com.dai.mall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Classname PmsBrandService
 * @Description TODO
 * @Date 2022/7/12 22:59
 * @Created by daihuhu
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
