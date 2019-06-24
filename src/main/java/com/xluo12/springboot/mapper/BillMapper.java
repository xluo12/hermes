package com.xluo12.springboot.mapper;

import com.xluo12.springboot.entities.Bill;
import com.xluo12.springboot.entities.BillProvider;

import java.util.List;

/**
 * @Auther: xluo12
 */
//@Mapper 或 @MapperScan("com.xluo12.springboot.mapper")
public interface BillMapper {

    List<BillProvider> getBills(Bill bill);

    BillProvider getBillByBid(Integer bid);

    int addBill(Bill bill);

    int updateBill(Bill bill);

    int deleteBillByBid(Integer bid);

}
