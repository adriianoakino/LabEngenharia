$(document).ready(function() {
    "use strict";
    $('.column').on('mouseover',function(){
        var table1 = $(this).parent().parent().parent();
        var table2 = $(this).parent().parent();
        var verTable = $(table1).data('vertable')+"";
        var column = $(this).data('column') + ""; 

        $(table2).find("."+column).addClass('hov-column-'+ verTable);
        $(table1).find(".linha.head ."+column).addClass('hov-column-head-'+ verTable);
    });

    $('.column').on('mouseout',function(){
        var table1 = $(this).parent().parent().parent();
        var table2 = $(this).parent().parent();
        var verTable = $(table1).data('vertable')+"";
        var column = $(this).data('column') + ""; 

        $(table2).find("."+column).removeClass('hov-column-'+ verTable);
        $(table1).find(".linha.head ."+column).removeClass('hov-column-head-'+ verTable);
    });
    
/*    console.log('cells', document.getElementById("table").rows[1].cells.item(4).input);
    console.log('cells', document.getElementById("table").rows[4].cells.item(0).innerHTML);
    console.log('cells', );*/
})


