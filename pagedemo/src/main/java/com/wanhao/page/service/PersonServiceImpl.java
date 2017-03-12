package com.wanhao.page.service;

import com.wanhao.page.Pagetion;
import com.wanhao.page.bean.Person;
import com.wanhao.page.dao.PersonDao;
import com.wanhao.page.query.BaseQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LiuLiHao on 2017/3/11.
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao personDao;

    public Pagetion getData(BaseQuery query) {
        //所有数据
        List<Person> persons = personDao.getDataWithPage(query);

        Pagetion pagetion = new Pagetion(query.getPageNo(), query.getPageSize(), personDao.getDataCount(query));

        pagetion.setList(persons);
        return pagetion;
    }
}
