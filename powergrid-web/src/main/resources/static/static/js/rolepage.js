	layui.use(['table','layer'],function(){
		var table=layui.table;
		var layer=layui.layer;
		table.render({
		    elem: '#test'
		    ,url:'seletuse'
		    ,cols: [[
               {field:'rid', width:150, title: 'ID', sort: true}
		      ,{field:'rname', width:150, title: '角色名'}
		      ,{field:'rtype', width:150, title: '类型', sort: true}
		      ,{field:'rno', width:150, title: '编号'}
		      ,{field:'rright', title: '权限', width:400}
		      ,{field:'isuser', width:150, title: '状态', sort: true}
		      ,{field:'classify', width:190, title: '操作',
					toolbar : '#barDemo'}
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
		/*table.on('toolbar(test)', function(obj) {
			var checkStatus = table.checkStatus(obj.config.id);
			switch (obj.event) {
			case 'delete':
				var data = checkStatus.data;
				if (data.length == 0) {
					layer.msg("至少也得选一个吧", {
						icon : 2
					});
				}
				var ids = "";
				if (data.length > 0) {
					for ( var i = 0; i < data.length; i++) {
						ids += data[i].id + ",";
					}
					layer.confirm('确认要删除吗？' + data.length+"个数据吗？", function(
							index) {
						$.ajax({
							type : "post",
							url : "delete",
							data : {
								"ids" : ids
							},
							success : function(e) {

							}
						});
						table.reload('testReload');
						layer.close(index);
					});
				}
				break;
			case 'add':
				layer.open({
					type: 2, 	
					anim: 1,
					area: ['800px', '500px'],
					content: 'add',
					end:function(){
						table.reload('testReload');
					}
				});			
				break;
			};
		});*/
		table.on('tool(test)',
				function(obj) {
					var data = obj.data;
					if (obj.event === 'del') {
						layer.confirm('真的删除行么?',function(index) {
							$.ajax({
									url : "delete",
									type : "post",
									data : {
									ids: data.id
									},
									dataType : "text",
						success : function(e) {
								if (e == 'YES') {
										layer.alert("删除成功");
										obj.del();
									} else {
									layer.alert("删除失败");
										}
									}
							});

					});
					} else if (obj.event === 'edit') {
						//获取行id
						var id = obj.data.id;
						layer.open({
							anim: 1,	
							type : 2,
							title : '编辑',
							shadeClose : false,
							shade : false,
							maxmin : false, //开启最大化最小化按钮
							area : [ '40%', '65%' ],
							content : 'updateid',
						    success:function(layero,index){
						    	var iframe=window['layui-layer-iframe'+index];
						    	iframe.getid(id);
						    },		
							cancel : function() {
								// 你点击右上角 X 取消后要做什么
								loadTable(table, null); //刷新用户信息列表
							}
						});
					}
		});
		
	});
