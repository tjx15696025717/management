package com.chongqing.service;

import com.chongqing.domain.House;

import java.util.List;
import java.util.Map;

/**
 * Created by 小谭 on 2021/2/19.
 */
public interface HouseService {
    String insertHouse(House house);

    String UpdateHouse(House house);

    String deleteHouse(Long houseId);

    List<House> selectByMap(Map map);
}
