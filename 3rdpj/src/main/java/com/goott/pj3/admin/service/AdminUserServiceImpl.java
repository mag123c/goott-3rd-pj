package com.goott.pj3.admin.service;

import java.util.List;

import com.goott.pj3.common.util.Criteria;
import com.goott.pj3.common.util.PagingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.pj3.admin.dto.AdminUserDTO;
import com.goott.pj3.admin.repo.AdminUserDAO;


@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private AdminUserDAO adminUserDAO;



    @Override
    public List<AdminUserDTO> adminUserList(Criteria cri) {
        return adminUserDAO.adminUserList(cri);
    }

    @Override
    public PagingDTO paging(Criteria cri) {
        PagingDTO paging = new PagingDTO();
        paging.setCri(cri);
        paging.setTotalCount(adminUserDAO.totalCount(cri));
        return paging;
    }

    @Override
    public AdminUserDTO adminUserDetail(String user_id) {
        // TODO Auto-generated method stub
        return adminUserDAO.adminUserDetail(user_id);
    }

    @Override
    public void adminUserUpdate(AdminUserDTO dto) {
        // TODO Auto-generated method stub
        adminUserDAO.adminUserUpdate(dto);

    }

    @Override
    public void adminUserDelete(AdminUserDTO dto) {
        // TODO Auto-generated method stub
        adminUserDAO.adminUserDelete(dto);
    }

    @Override
    public void adminUserDeleteReturn(AdminUserDTO dto) {
        // TODO Auto-generated method stub
        adminUserDAO.adminUserDeleteReturn(dto);
    }


}
