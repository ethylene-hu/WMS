package com.wms.dao;

import com.wms.bean.MakeInventory;

public interface MakeInventoryMapper {
    int deleteByPrimaryKey(Integer miId);

    int insert(MakeInventory record);

    int insertSelective(MakeInventory record);

    MakeInventory selectByPrimaryKey(Integer miId);

    int updateByPrimaryKeySelective(MakeInventory record);

    int updateByPrimaryKey(MakeInventory record);
}