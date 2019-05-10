package com.zz.seckill.dao;

import com.zz.seckill.bean.SeckillOrder;
import com.zz.seckill.bean.SeckillOrderExample;
import com.zz.seckill.bean.SeckillOrderKey;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SeckillOrderMapper {
//    int countByExample(SeckillOrderExample example);
//
//    int deleteByExample(SeckillOrderExample example);
//
//    int deleteByPrimaryKey(SeckillOrderKey key);

    /**
     * 插入购买订单明细
     *
     * @param seckillId 秒杀到的商品ID
     * @param money     秒杀的金额
     * @param userPhone 秒杀的用户
     * @return 返回该SQL更新的记录数，如果>=1则更新成功
     */
    int insert(@Param("seckillId") long seckillId, @Param("money") BigDecimal money, @Param("userPhone") long userPhone);

//    int insertSelective(SeckillOrder record);
//
//    List<SeckillOrder> selectByExample(SeckillOrderExample example);

    /**
     * 根据秒杀商品ID查询订单明细数据并得到对应秒杀商品的数据，因为我们再SeckillOrder中已经定义了一个Seckill的属性
     *
     * @param seckillId
     * @param userPhone
     * @return
     */
    SeckillOrder selectByPrimaryKey(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

//
//    int updateByExampleSelective(@Param("record") SeckillOrder record, @Param("example") SeckillOrderExample example);
//
//    int updateByExample(@Param("record") SeckillOrder record, @Param("example") SeckillOrderExample example);
//
//    int updateByPrimaryKeySelective(SeckillOrder record);
//
//    int updateByPrimaryKey(SeckillOrder record);
}