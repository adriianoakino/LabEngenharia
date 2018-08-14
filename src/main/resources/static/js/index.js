$(document).ready(function() {
    /*############# MENU TOGGLE ###########*/
    $(".menu").click(function(event) {
        $("nav").toggle(500);
        console.log(event)
        
        console.log(event.preventDefault());
    })
    
    $('form').animate({height: "toggle", opacity: "toggle"}, "slow")
})

function registrar()    {
    window.location.href = "http://localhost:8080/LabEngenharia/registrar";
}

function acessar()    {
    window.location.href = "http://localhost:8080/LabEngenharia/conectar";
}