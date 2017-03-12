package com.wanhao.page.dao;

import com.wanhao.page.bean.Person;
import com.wanhao.page.query.BaseQuery;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiuLiHao on 2017/3/11.
 */
@Repository
public class PersonDaoImpl implements PersonDao {

    String[] genders = {"男", "女"};
    String[] names = {"Mike", "Chris", "Jason", "King"};

    public List<Person> getDataWithPage(BaseQuery query) {
        ArrayList<Person> persons = new ArrayList<Person>();

        for (int i = 1; i < 501; i++) {
            persons.add(new Person(i, names[i % 4], i, genders[i % 2], "program"));
        }

        //起始下标
        int start = (query.getPageSize() - 1) * query.getPageNo();
        //结束下标
        int end = start + query.getPageSize() >= persons.size() ? persons.size() : start + query.getPageSize();

        //存放给页面显示的数据  模拟分页
        List<Person> result = new ArrayList<Person>();
        for (int i = start; i < end; i++) {
            result.add(persons.get(i));
        }

        return result;
    }

    public Integer getDataCount(BaseQuery query) {
        return 500;
    }
}
