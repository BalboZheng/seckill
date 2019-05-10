package com.zz.seckill.dao;

import com.zz.seckill.bean.Seckill;
import com.zz.seckill.bean.SeckillExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SeckillMapper {
//    int countByExample(SeckillExample example);
//
//    int deleteByExample(SeckillExample example);
//
//    int deleteByPrimaryKey(Long seckillId);
//
//    int insert(Seckill record);
//
//    int insertSelective(Seckill record);
//
//    List<Seckill> selectByExample(SeckillExample example);

    /**
     * 根据主键查询当前秒杀商品的数据
     *
     * @param seckillId
     * @return
     */
    Seckill selectByPrimaryKey(long seckillId);

    /**
     * 查询所有秒杀商品的记录信息
     *
     * @return
     */
    List<Seckill> findAll();

//    int updateByExampleSelective(@Param("record") Seckill record, @Param("example") SeckillExample example);
//
//    int updateByExample(@Param("record") Seckill record, @Param("example") SeckillExample example);
//
//    int updateByPrimaryKeySelective(Seckill record);

    /**
     * 减库存。
     * 对于Mapper映射接口方法中存在多个参数的要加@Param()注解标识字段名称，不然Mybatis不能识别出来哪个字段相互对应
     *
     * @param seckillId 秒杀商品ID
     * @param killTime  秒杀时间
     * @return 返回此SQL更新的记录数，如果>=1表示更新成功
     */
    int updateByPrimaryKey(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

}