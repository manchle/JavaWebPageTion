package com.wanhao.test;

import com.wanhao.page.Pagetion;
import com.wanhao.page.query.BaseQuery;
import com.wanhao.page.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by LiuLiHao on 2017/3/11.
 */
public class Test extends SpringJunitTestUtil{
    @Autowired
    private PersonService personService;

    @org.junit.Test
    public void testRun(){
        BaseQuery query = new BaseQuery();
        query.setPageNo(1);
        Pagetion data = personService.getData(query);
        System.out.println(data);
    }
}
