window.location = "#carousel-1";

/*
$('.carousel-box a[href^="#"]').on('click', function(e) {
	e.preventDefault();
	var id = $(this).attr('href'),
			targetOffset = $(id).offset().top;
			
	$('html, body').animate({ 
		scrollTop: targetOffset - 100
	}, 500);
});
*/

function home() {
    let btn = document.getElementById("form-main");
    btn.action = "ServAluno";
    btn.method = "POST";
    document.getElementById("action").value = "home";
    btn.submit();
}

function profile() {
    let btn = document.getElementById("form-main");
    btn.action = "ServAluno";
    btn.method = "POST";
    document.getElementById("action").value = "profile";
    btn.submit();
}

function update() {
    let btn = document.getElementById("form-main");
    btn.action = "ServAluno";
    btn.method = "POST";
    document.getElementById("action").value = "update";
    btn.submit();
}

function exit() {
    let btn = document.getElementById("form-main");
    btn.action = "ServAluno";
    btn.method = "POST";
    document.getElementById("action").value = "exit";
    btn.submit();
}