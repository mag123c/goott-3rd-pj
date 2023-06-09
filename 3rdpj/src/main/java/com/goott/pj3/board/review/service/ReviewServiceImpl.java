package com.goott.pj3.board.review.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.goott.pj3.board.review.dto.ReviewDTO;
import com.goott.pj3.board.review.repo.ReviewDAO;
import com.goott.pj3.common.util.paging.Criteria;
import com.goott.pj3.common.util.paging.PagingDTO;

import java.util.List;
import java.util.Map;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewDAO reviewDAO;

	/**
	 * 23.04.22 리뷰 생성
	 * @param reviewDTO
	 * @return
	 */
	@Override
	public int create(ReviewDTO reviewDTO) {
		int affectRowCnt =  this.reviewDAO.create(reviewDTO); // 게시글 생성된 갯수 반환
		if(affectRowCnt==1){
			System.out.println("review_idx : " + reviewDTO.getReview_idx());
			return reviewDTO.getReview_idx();
		}
		return 0;
	}

	@Override
	public void createImg(ReviewDTO reviewDTO) {
		this.reviewDAO.createImg(reviewDTO);
	}

	@Override
	public ReviewDTO detail(ReviewDTO reviewDTO) {
		return this.reviewDAO.detail(reviewDTO);
	}

	@Override
	public int update(ReviewDTO reviewDTO) {
		int cnt = this.reviewDAO.update(reviewDTO);
		if(cnt==1){
			return reviewDTO.getReview_idx();
		}
		return 0;
	}
	@Override
	public void updateImg(ReviewDTO reviewDTO) {
		this.reviewDAO.updateImg(reviewDTO);
	}

	@Override
	public boolean delete(ReviewDTO reviewDTO) {
		int cnt = this.reviewDAO.delete(reviewDTO);
		return cnt==1;
	}

	@Override
	public void deleteImg(ReviewDTO reviewDTO) {
		this.reviewDAO.deleteImg(reviewDTO);
	}

	@Override
	public List<ReviewDTO> list(Criteria cri) {
		return reviewDAO.list(cri);
	}

	@Override
	public PagingDTO paging(Criteria cri) {
		PagingDTO paging = new PagingDTO();
		paging.setCri(cri);
		paging.setTotalCount(reviewDAO.totalCount(cri));
		return paging;
	}

	@Override
	public List<ReviewDTO> imglist(ReviewDTO reviewDTO) {
		return this.reviewDAO.imgList(reviewDTO);
	}


}
