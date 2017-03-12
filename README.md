# JavaWebPageTion
打造通用的javaweb分页

###详细使用请见pagedemo中

###效果图
![截图1](https://github.com/wanhao838088/JavaWebPageTion/blob/master/screenshot/screen_1.png)
![截图2](https://github.com/wanhao838088/JavaWebPageTion/blob/master/screenshot/screen_2.png)

##方法

| 方法名        | 描述           |
| ------------- |:-------------:|
| setList(List list)     | 设置在页面显示的内容 | 
| pageView(String url,String params);      | url当前页面的链接,params需要拼接的参数      |
| setPageSize(int i); | 设置每页条数      |


##使用步骤:

####Step 1:依赖pagation

一、使用maven,由于还未把项目提交到中央仓库,所以使用之前首先需要您把pagetion部署到您的本地仓库中,运行 maven package install 即可.

    <dependency>
        <groupId>com.wanhao</groupId>
        <artifactId>pagation</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>

二、直接导入jar包

在lib中加入 pagation-1.0-SNAPSHOT.jar,jar放置在 pagetion->target下.


####Step 2:构造Pagetion

public Pagetion(int pageNo, int pageSize, int totalCount)

参数说明:
* pageNo      分页页码，从1开始，即第一页。
* pageSize    分页每页显示的条数，默认显示10条
* totalCount  数据的总条数

####Step 3:设置数据和其它参数
* pagetion.setList(List list);
* pagetion.pageView(url,params);  

####Step 4:在页面使用  
把pagetion放入request域中,然后:  

    <c:forEach items="${pagetion.pageView }" var="page">
        ${page}  
    </c:forEach>
    
##关于跳转到页面校验的问题:
一、使用angular的方式,需要自己定义ng-app,ng-controller,直接在scope中声明checkPageNo方法即可,方法名称固定.  

    $scope.checkPageNo = function () {
        $scope.pageNo = $scope.pageNo<=0?1:$scope.pageNo;
        $scope.pageNo = $scope.pageNo>=${pagetion.totalPage}?${pagetion.totalPage}:$scope.pageNo;
    }
    
二、使用jQuery, jQuery的change事件在鼠标点击其它的地方进行触发, 实时性低于angular一些.

    $(function () {
    $("#pageNo").change(function () {
        $("#pageNo").val( $("#pageNo").val()<=0?1:$("#pageNo").val() );
        $("#pageNo").val( $("#pageNo").val()>${pagetion.totalPage}?${pagetion.totalPage}:$("#pageNo").val() );
        });
    })
    
