window.location = "#carousel-1";

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

function del() {
    let btn = document.getElementById("form-main");
    btn.action = "ServAluno";
    btn.method = "POST";
    document.getElementById("action").value = "delete";
    btn.submit();
}

function exit() {
    let btn = document.getElementById("form-main");
    btn.action = "ServAluno";
    btn.method = "POST";
    document.getElementById("action").value = "exit";
    btn.submit();
}