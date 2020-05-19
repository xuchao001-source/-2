layui.extend({
	admin: '{/}../../static/js/admin'
});
layui.use(['laydate', 'jquery', 'admin','form','table'], function() {
	var laydate = layui.laydate,
		$ = layui.jquery,
		form=layui.form,
		table=layui.table,
		admin = layui.admin;
	form.render();
	
});