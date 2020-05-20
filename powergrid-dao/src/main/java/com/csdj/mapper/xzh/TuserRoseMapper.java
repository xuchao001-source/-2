package com.csdj.xzhdao;

import com.csdj.pojo.TUserRose;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TuserRoseMapper {
    List<TUserRose> seletuse(Integer index,Integer pagesize);
    Integer seletuses();
}
