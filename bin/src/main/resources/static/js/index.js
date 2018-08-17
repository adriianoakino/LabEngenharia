$(document).ready(function() {
    $(".menu").click(function() {
        console.log($("nav"))
        $("nav").toggle(500);
    })
})