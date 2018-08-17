$('#loginForm').submit(function(e) {
    
    var json = { 'username': $('username').val(), 'password': $('password').val() }
    
    $.ajax({
        type: 'post', // method attribute of form
        url: '/login',  // action attribute of form
        data: JSON.stringify(json),
        beforeSend: function(xhr) {
            xhr.setRequestHeader("Accept", "application/json");
            xhr.setRequestHeader("Content-Type", "application/json");
        },   
        success: function (result) { 
            alert('Logando')
        }, error: function (error) {
            bPassword();
        }
    });
})  


$('#registroForm').submit(function(e) {
    
    var json = { 'nome': $('nome').val(), 'cep': $('cep').val(), 
                 'bairro': $('bairro').val(), 'logadouro': $('logadouro').val(), 
                 'numero': $('numero').val(), 'cidade': $('cidade').val(), 'estado': $('estado').val(), 
                 'username': $('username').val(), 'password': $('password').val() }
    
    $.ajax({
        type: 'post', // method attribute of form
        url: '/registrar',  // action attribute of form
        data: JSON.stringify(json),
        beforeSend: function(xhr) {
            xhr.setRequestHeader("Accept", "application/json");
            xhr.setRequestHeader("Content-Type", "application/json");
        },   
        success: function (result) { 
            alert('Logando')
        }, error: function (error) {
            bPassword();
        }
    });
})  



 $("#username").keyup(function () {
     clearTimeout(this.interval);
     this.interval = setTimeout(isEmail(), 100);
});

 
function isUsername(email) { 
    if(!(/^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/).test(email.value)) { 
        $('username').focus();
    } else {
        $('username').style.border = 'none';
    }   
};


function bPassword () {
    $('username').style.border = '1px solid red';
}   

