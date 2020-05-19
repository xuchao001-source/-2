package com.csdj.mapper;

import com.csdj.pojo.TCardasset;

import java.util.List;

public interface TCardassetMapper {
    List<TCardasset>getTCardasset(String CARDSTATECHANGE,String ORGName,String CARDREGUSER,Integer pageNo,Integer pageSize);
    int getTCardassetcount(String CARDSTATECHANGE,String ORGName,String CARDREGUSER);
}
