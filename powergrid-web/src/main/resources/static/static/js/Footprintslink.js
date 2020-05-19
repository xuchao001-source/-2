layui.extend({
	admin: '{/}../../static/js/admin'
});
layui.use(['laydate', 'jquery', 'admin','form','table'], function() {
	var laydate = layui.laydate,
		$ = layui.jquery,
		form=layui.form,
		table=layui.table,
		admin = layui.admin;
	//执行一个laydate实例
	laydate.render({
		elem: '#start' //指定元素
	});
	//执行一个laydate实例
	laydate.render({
		elem: '#end' //指定元素
	});
	table.render({
			    elem: '#test'
			    ,url:'page'
			    ,toolbar: '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
			    ,defaultToolbar: ['filter', 'exports',]//自定义头部工具栏右侧图标。如无需自定义，去除该参数即可}]
			    ,cols: [[
	               {field:'name', minWidth:150, title: '链接'}
			      ,{field:'author', minWidth:150, title: '内容'}
			      ,{field:'publish', minWidth:150, title: '类型'}
				  ,{field:'page', title: '操作', minWidth:50,toolbar : '#barDemo'}
			    ]]
			    ,id : 'testReload'
			    ,page: true
			    ,limit:3
			    ,height:300
			    ,width:1300
			  });
			$("#button").on('click',function(){
				table.reload('testReload', {
					where : { // 设定异步数据接口的额外参数，任意设
						name : $("#name").val()
					// …
					},
					page : {
						curr : 2
					// 重新从第 1 页开始
					}
				});
			});
	
});