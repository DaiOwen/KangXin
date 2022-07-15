package com.dai.mall.config;

/**
 * @Classname MyBatisConfig
 * @Description TODO
 * @Date 2022/7/12 22:57
 * @Created by daihuhu
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.dai.mall.mbg.mapper","com.dai.mall.dao"})
public class MyBatisConfig {
}
