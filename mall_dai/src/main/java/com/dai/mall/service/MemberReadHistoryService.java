package com.dai.mall.service;

import com.dai.mall.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * @Classname MemberReadHistoryService
 * @Description 会员浏览记录管理Service
 * @Date 2022/7/15 17:22
 * @Created by daihuhu
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);
}
