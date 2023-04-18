package com.goott.pj3.admin.service;

import java.util.List;
import java.util.Map;

public interface AdminReviewService {

    List<Map<String, Object>> list(Map<String, Object> map);

    public Map<String, Object> detail(Map<String, Object> map);

    boolean update(Map<String, Object> map);

    boolean delete(Map<String, Object> map);


}
