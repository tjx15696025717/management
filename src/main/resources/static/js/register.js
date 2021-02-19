function register(obj){
	var username = document.registerForm.username.value;
	var password1 = document.registerForm.password.value;
	var password2 = document.registerForm.password2.value;
		
	if(username === ''){
		alert("用户名不能为空");
		return;
	}
	if(password1 === ''){
		alert("密码不能为空");
		return;
	}
	if(password1 !== password2){
		alert("两次密码不一样");
		return;
	}
	document.registerForm.submit();
}