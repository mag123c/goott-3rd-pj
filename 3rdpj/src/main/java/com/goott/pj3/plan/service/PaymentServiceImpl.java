package com.goott.pj3.plan.service;

import com.goott.pj3.plan.dto.PayDTO;
import com.goott.pj3.plan.repo.PaymentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//2023.04.22 길영준
@Service
public class PaymentServiceImpl implements PaymentService {
    final
    PaymentDAO paymentDAO;

    public PaymentServiceImpl(PaymentDAO paymentDAO) {
        this.paymentDAO = paymentDAO;
    }

    @Override
    public boolean pay(PayDTO payDTO) {
        int cnt = paymentDAO.pay(payDTO);
        return cnt==1;
    }

    @Override
    public void saleCount(PayDTO payDTO) {
        paymentDAO.saleCount(payDTO);
    }
}