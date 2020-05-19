layui.extend({
	admin: '{/}../../static/js/admin'
});
layui.use(['laydate', 'jquery','admin','form','table'], function() {
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
			    ,url:'getTCardasset'
			    ,toolbar: '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
			    ,defaultToolbar: ['filter', 'exports',]//自定义头部工具栏右侧图标。如无需自定义，去除该参数即可}]
			    ,cols: [[
	               {field:'orgno', minWidth:150, title: '所属供电单位'}
			      ,{field:'orgname', minWidth:150, title: '单位名称'}
			      ,{field:'opcardno', minWidth:150, title: '操作卡编号'}
			      ,{field:'bcardno', minWidth:150, title: '业务卡编号'}
			      ,{field:'cardreguser', title: '登记操作人', minWidth:150}
				  ,{field:'cardregtime', title: '登记操作时间', minWidth:150}
				  ,{field:'cardlstuser', title: '最后修改操作人', minWidth:150}
				  ,{field:'cardlsttime', title: '最后修改时间', minWidth:150}
				  ,{field:'cardlegality', title: '合法状态', minWidth:150}
				  ,{field:'cardstateuser', title: '领用人', minWidth:150}
				  ,{field:'cardstatetime', title: '领用时间', minWidth:150}
				  ,{field:'cardstatechange', title: '证卡状态', minWidth:150}
			    ]]
			    ,id : 'testReload'
			    ,page: true
			    ,limit:3
			    ,height:300
			    ,width:1300
			  });
			$("#sel").on('click',function(){
				table.reload('testReload', {
					where : { // 设定异步数据接口的额外参数，任意设
						CARDSTATECHANGE : $("#CARDSTATECHANGE").val(),
						ORGName:$("#ORGName").val(),
						CARDREGUSER:$("#CARDREGUSER").val()
					// …
					},
					page : {
						curr : 0
					// 重新从第 1 页开始
					}
				});
			});
	
});