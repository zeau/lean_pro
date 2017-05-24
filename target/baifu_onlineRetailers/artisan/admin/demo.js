var pageConfig = {
    //pages: pages, //页数
    curr: 1, //当前页
    theme: 'default', //主题
    groups: 5, //连续显示分页数
    prev: '<<', //若不显示，设置false即可
    next: '>>', //若不显示，设置false即可
    first: "首页",
    last: "尾页", //false则不显示

    render: function(context, $element, index) { //渲染[context：对this的引用，$element：当前元素，index：当前索引]
        //逻辑处理
        if (index == 'last') { //虽然上面设置了last的文字为尾页，但是经过render处理，结果变为最后一页
            $element.find('a').html('最后一页');
            return $element; //如果有返回值则使用返回值渲染
        }
        return false; //没有返回值则按默认处理
    },

    jump: function(context, first) {
        // console.log('当前第：' + context.option.curr + "页");
        // currentPageNum = context.option.curr;
        // $("#content").html(thisDate(context.option.curr));
    }
};