package com.csdj.serviceimpl;

import com.csdj.mapper.TCardassetMapper;
import com.csdj.pojo.TCardasset;
import com.csdj.service.TCardassetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.nio.cs.ext.MacArabic;

import java.util.List;

@Service
public class TCardassetServiceImpl implements TCardassetService {
    @Autowired
    private TCardassetMapper mapper;

    @Override
    public List<TCardasset> getTCardasset(String CARDSTATECHANGE, String ORGName, String CARDREGUSER, Integer pageNo, Integer pageSize) {
        return mapper.getTCardasset(CARDSTATECHANGE,ORGName,CARDREGUSER,(pageNo-1)*pageSize,pageSize);
    }

    @Override
    public int getTCardassetcount(String CARDSTATECHANGE, String ORGName, String CARDREGUSER) {
        return mapper.getTCardassetcount(CARDSTATECHANGE,ORGName,CARDREGUSER);
    }
}
