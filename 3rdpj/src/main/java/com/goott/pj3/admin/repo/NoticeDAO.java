package com.goott.pj3.admin.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.goott.pj3.common.util.Criteria;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.goott.pj3.admin.dto.NoticeDTO;

@Repository
public class NoticeDAO {

    @Inject
    SqlSession sqlSession;

    public List<NoticeDTO> noticeList(Criteria cri) {
        return sqlSession.selectList("noticeList",cri);
    }

    public int totalCount(Criteria cri) {
        return  sqlSession.selectOne("noticeT_Count",cri);
    }

//    public List<NoticeDTO> noticeList(String search_option, String keyword) {
//        // TODO Auto-generated method stub
//        Map<String, Object> map = new HashMap<>();
//        map.put("search_option", search_option);
//        map.put("keyword", keyword);
//        return sqlSession.selectList("noticelist", map);
//    }

    public void noticeInsert(NoticeDTO dto) {
        // TODO Auto-generated method stub
        sqlSession.insert("noticeInsert", dto);
    }

    public NoticeDTO noticeDetail(int idx) {
        // TODO Auto-generated method stub
        return sqlSession.selectOne("noticeDetail", idx);
    }

    public void noticeUpdate(NoticeDTO dto) {
        // TODO Auto-generated method stub
        sqlSession.update("noticeUpdate", dto);
    }

    public void noticeDelete(NoticeDTO dto) {
        // TODO Auto-generated method stub
        sqlSession.delete("noticeDelete", dto);
    }

    public void noticeDeleteReturn(NoticeDTO dto) {
        // TODO Auto-generated method stub
        sqlSession.update("noticeDeleteReturn", dto);
    }



}
