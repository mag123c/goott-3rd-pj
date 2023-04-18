package com.goott.pj3.admin.repo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class AdminReviewDAO {

    @Autowired
    SqlSession sqlSession;
    public List<Map<String, Object>> list(Map<String, Object> map) {
        return this.sqlSession.selectList("admin.reviewList", map);
    }

    public Map<String, Object> detail(Map<String, Object> map) {
        return this.sqlSession.selectOne("admin.reviewDetail", map);
    }

    public int update(Map<String, Object> map) {
        return this.sqlSession.update("admin.reviewUpdate", map);
    }

    public int delete(Map<String, Object> map) {
        return this.sqlSession.delete("admin.reviewDelete", map);
    }
}
