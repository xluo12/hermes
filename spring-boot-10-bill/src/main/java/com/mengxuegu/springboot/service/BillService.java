package com.mengxuegu.springboot.service;

import com.mengxuegu.springboot.entities.Bill;
import com.mengxuegu.springboot.entities.BillProvider;
import com.mengxuegu.springboot.mapper.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * http://localhost:8080/updateBill?billCode=123&billName=aaa&people=xxx&phone=8888&address=99&pid=4
 * @Auther: 梦学谷
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
