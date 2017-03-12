package com.wanhao.page.dao;

import com.wanhao.page.bean.Person;
import com.wanhao.page.query.BaseQuery;

import java.util.List;

/**
 * Created by LiuLiHao on 2017/3/11.
 */
public interface PersonDao {

    /**
     * 真实数据库需要实现分页查询  这里简单模拟一下，不实际操作数据库
     * @return
     */
    public List<Person> getDataWithPage(BaseQuery query);

    /**
     * 根据条件查询结果个数
     * @param query
     * @return
     */
    public Integer getDataCount(BaseQuery query);
}
