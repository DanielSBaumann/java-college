function cadastrar(){
    let btn = document.getElementById("form-main");
    btn.action = "ServCadastrar";
    btn.method = "POST";
    btn.submit();
}