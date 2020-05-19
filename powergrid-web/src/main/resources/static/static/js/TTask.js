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
	               {field:'name', minWidth:150, title: '任务id'}
			      ,{field:'author', minWidth:150, title: '任务名称'}
			      ,{field:'publish', minWidth:150, title: '任务创建人'}
			      ,{field:'publishdate', minWidth:150, title: '任务类型'}
			      ,{field:'w', title: '掌机类型', minWidth:150}
				  ,{field:'x', title: '是否自由任务', minWidth:150}
				  ,{field:'t', title: '操作员账号', minWidth:150}
				  ,{field:'y', title: '集合名称', minWidth:150}
				  ,{field:'u', title: '模板名称', minWidth:150}
				  ,{field:'uu', title: '冻结日期', minWidth:150}
				  ,{field:'ii', title: '任务创建时间', minWidth:150}
				  ,{field:'i', title: '任务开始时间', minWidth:150}
				  ,{field:'o', title: '任务结束时间', minWidth:150}
				  ,{field:'oo', title: '失效时间', minWidth:150}
				  ,{field:'p', title: '任务状态', minWidth:150}
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