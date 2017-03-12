package com.wanhao.page.service;

import com.wanhao.page.Pagetion;
import com.wanhao.page.query.BaseQuery;

/**
 * Created by LiuLiHao on 2017/3/11.
 */
public interface PersonService {

    public Pagetion getData(BaseQuery query);
}
