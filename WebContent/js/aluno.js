function home() {
    console.log("home");
    alert("home");
    let btn = document.getElementById("form-main");
    btn.action = "ServAluno";
    btn.method = "POST";
    document.getElementById("action").value = "home";
    btn.submit();
}

function profile() {
    console.log("profile");
    alert("profile");
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