package com.goott.pj3.travelinfo.service;

import com.goott.pj3.travelinfo.dto.TravelInfoDTO;

import java.util.List;
import java.util.Map;

public interface TravelInfoService {
    String insert(Map<String, Object> map);

    Map<String, Object> detail(Map<String, Object> map);

//    public Map<String, Object> detail(Map<String, Object> map);
//
//    boolean update(Map<String, Object> map);
//
//    boolean delete(Map<String, Object> map);
//
//    List<Map<String, Object>> list(Map<String, Object> map);
}
