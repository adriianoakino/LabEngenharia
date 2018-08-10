$(document).ready(function() {
    /*############# MENU TOGGLE ###########*/
    $(".menu").click(function() {
        console.log($("nav"))
        $("nav").toggle(500);
    })
    
    /*############# SLIDER ###########*/ 
   
        setInterval(function () {
            moveRight();
        }, 3000);
      
        var slideCount = $('#slider ul li').length;
        var slideWidth = $('#slider ul li').width();
        var slideHeight = $('#slider ul li').height();
        var sliderUlWidth = slideCount * slideWidth;
        
        $('#slider').css({ width: slideWidth, height: slideHeight });
        
        $('#slider ul').css({ width: sliderUlWidth, marginLeft: - slideWidth });
        
        $('#slider ul li:last-child').prependTo('#slider ul');
        
        /*função para mover para esquerda*/
        function moveLeft() {
            $('#slider ul li').animate({
                left: + slideWidth
            }, 100, function () {
                $('#slider ul li:last-child').prependTo('#slider ul li');
                $('#slider ul').css('left', '');
            });
        };
        /*função para mover para direita*/
        function moveRight() {

            $('#slider ul li').animate({
                left: - slideWidth
            }, 100, function () {
                $('#slider ul li:first-child').appendTo('#slider ul li');
                $('#slider ul').css('left', '');
            });
        };
        
        /*função para os controles quando realizarem evento de click*/
        $('a.control_prev').click(function () {
            console.log("Entrou")
            moveLeft();
        });

        $('a.control_next').click(function () {
            moveRight();
        });
})

function registrar()    {
    location.href = "http://localhost:8080/LabEngenharia/registrar";
}

function acessar()    {
    location.href = "http://localhost:8080/LabEngenharia/acessar";
}