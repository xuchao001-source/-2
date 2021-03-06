package com.csdj.serviceimpl;

import com.csdj.pojo.TUserRose;
import com.csdj.service.TuserRoseService;
import com.csdj.mapper.TuserRoseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuserRoseServiceImpl implements TuserRoseService {
    @Autowired
    private TuserRoseMapper mapper;


    @Override
    public List<TUserRose> seletuse(Integer index, Integer pagesize) {
        return mapper.seletuse((index-1)*pagesize,pagesize);
    }

    @Override
    public Integer seletuses() {
        return mapper.seletuses();
    }
}
