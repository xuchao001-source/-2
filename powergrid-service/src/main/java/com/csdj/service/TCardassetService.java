package com.csdj.service;

import com.csdj.pojo.TCardasset;

import java.util.List;

/**
 * service层
 */
public interface TCardassetService {
    List<TCardasset> getTCardasset(String CARDSTATECHANGE, String ORGName, String CARDREGUSER, Integer pageNo, Integer pageSize);
    int getTCardassetcount(String CARDSTATECHANGE,String ORGName,String CARDREGUSER);
}
