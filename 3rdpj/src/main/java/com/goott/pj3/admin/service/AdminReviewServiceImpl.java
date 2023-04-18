package com.goott.pj3.admin.service;

import com.goott.pj3.admin.repo.AdminReviewDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AdminReviewServiceImpl implements AdminReviewService{

    @Autowired
    AdminReviewDAO reviewDAO;
    @Override
    public List<Map<String, Object>> list(Map<String, Object> map) {
        return this.reviewDAO.list(map);
    }

    @Override
    public Map<String, Object> detail(Map<String, Object> map) {
        return this.reviewDAO.detail(map);
    }

    @Override
    public boolean update(Map<String, Object> map) {
        int affectRowCnt = this.reviewDAO.update(map); // 데이터 생성 성공 시 반환되는 값 : 1 (생성한 데이터 수 반환)
        return affectRowCnt == 1;
    }

    @Override
    public boolean delete(Map<String, Object> map) {
        int affectRowCnt = this.reviewDAO.delete(map); // 데이터 생성 성공 시 반환되는 값 : 1 (생성한 데이터 수 반환)
        return affectRowCnt==1;
    }
}
