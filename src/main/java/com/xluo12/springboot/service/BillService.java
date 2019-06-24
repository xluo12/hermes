package com.xluo12.springboot.service;

import com.xluo12.springboot.entities.Bill;
import com.xluo12.springboot.entities.BillProvider;
import com.xluo12.springboot.mapper.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * http://localhost:8080/updateBill?billCode=123&billName=aaa&people=xxx&phone=8888&address=99&pid=4
 * @Auther: xluo12
 */
@Service
public class BillService {

    @Autowired
    BillMapper billMapper;

    public List<BillProvider> getBills(Bill bill){
        List<BillProvider> billProviders = billMapper.getBills(bill);
        return billProviders;
    }

    public BillProvider getBillByBid(Integer bid){
        BillProvider billProvider = billMapper.getBillByBid(bid);
        return billProvider;
    }

    public Bill updateBill(Bill bill) {
        billMapper.updateBill(bill);
        return bill;
    }

    public Bill addBill(Bill bill){
        billMapper.addBill(bill);
        return bill;
    }

    public Integer deleteBillByBid(Integer bid) {
        billMapper.deleteBillByBid(bid);
        return bid;
    }
}
