package com.csdj.service.xzh;

import com.csdj.pojo.TUserRose;

import java.util.List;

public interface TuserRoseService {
    List<TUserRose> seletuse(Integer index, Integer pagesize);
    Integer seletuses();
}
