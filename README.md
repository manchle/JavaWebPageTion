# JavaWebPageTion
打造通用的javaweb分页

##方法

| 方法名        | 描述           |
| ------------- |:-------------:|
| setList(List list)     | 设置在页面显示的内容 | 
| pageView(String url,String params);      | url当前页面的链接,params需要拼接的参数      |
| setPageSize(int i); | 设置每页条数      |


##使用步骤:  

####Step 1:依赖pagation

一、使用maven

`<dependency>
            <groupId>com.wanhao</groupId>
            <artifactId>pagation</artifactId>
            <version>1.0-SNAPSHOT</version>
</dependency>`

二、直接导入jar包

在lib中加入 pagation-1.0-SNAPSHOT.jar


####Step 2:构造Pagetion

public Pagetion(int pageNo, int pageSize, int totalCount)

参数说明:
1. pageNo      分页页码，从1开始，即第一页。
2. pageSize    分页每页显示的条数，默认显示10条
3. totalCount  数据的总条数

####Step 3:设置数据和其它参数
pagetion.setList(List list);
pagetion.pageView(url,params);  

####Step 4:在页面使用  

`<c:forEach items="${pagetion.pageView }" var="page">  

                    ${page}  
                      
</c:forEach>`