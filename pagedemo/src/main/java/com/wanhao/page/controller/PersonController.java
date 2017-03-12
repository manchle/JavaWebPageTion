package com.wanhao.page.controller;

import com.wanhao.page.Pagetion;
import com.wanhao.page.query.BaseQuery;
import com.wanhao.page.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LiuLiHao on 2017/3/11.
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/showPersons")
    public String showPersons(Integer pageNo, Model model){
        //实际的操作需要实现自定义的query对象，实现带复杂条件的查询
        BaseQuery baseQuery = new BaseQuery();
        //每页显示10条
        baseQuery.setPageSize(10);

        if (null!=pageNo){
            baseQuery.setPageNo(pageNo);
        }else {
            pageNo = Pagetion.cpn(pageNo);
        }
        baseQuery.setPageNo(pageNo);
        Pagetion pagetion = personService.getData(baseQuery);

        String url = "/showPersons";
        //url 为 页面按钮(上一页，下一页，第 n 页 )的链接地址，pageNo自动拼接
        String params = "";
        //附带的参数信息
        pagetion.pageView(url,params);

        model.addAttribute("pagetion",pagetion);
        return "person";
    }
}
