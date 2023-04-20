package com.goott.pj3.admin.repo;

import com.goott.pj3.board.qna.dto.QnaDTO;
import com.goott.pj3.common.util.Criteria;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminQnaDAO {

    @Autowired
    SqlSession sqlSession;


    public List<QnaDTO> qnaList(Criteria cri) {
        return sqlSession.selectList("qnaList", cri);

    }

    public int totalCount(Criteria cri) {
        return sqlSession.selectOne("qnaT_Count", cri);
    }

    public void qnaInsert(QnaDTO dto) {
        sqlSession.insert("qnaInsert",dto);
    }

    public QnaDTO qnaDetail(int qna_idx) {
        return sqlSession.selectOne("qnaDetail", qna_idx);
    }

    public void qnaDelete(int qna_idx) {
        sqlSession.update("qnaDelete", qna_idx);
    }

    public void qnaModify(QnaDTO dto) {
        sqlSession.update("qnaModify", dto);
    }
}
