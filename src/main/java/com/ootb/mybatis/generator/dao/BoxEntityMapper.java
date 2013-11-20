package com.ootb.mybatis.generator.dao;

import com.ootb.mybatis.generator.model.BoxEntity;
import com.ootb.mybatis.generator.model.BoxEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BoxEntityMapper {
    int countByExample(BoxEntityExample example);

    int deleteByExample(BoxEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BoxEntity record);

    int insertSelective(BoxEntity record);

    List<BoxEntity> selectByExampleWithRowbounds(BoxEntityExample example, RowBounds rowBounds);

    List<BoxEntity> selectByExample(BoxEntityExample example);

    BoxEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BoxEntity record, @Param("example") BoxEntityExample example);

    int updateByExample(@Param("record") BoxEntity record, @Param("example") BoxEntityExample example);

    int updateByPrimaryKeySelective(BoxEntity record);

    int updateByPrimaryKey(BoxEntity record);
}