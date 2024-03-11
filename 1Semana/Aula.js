var hora;
var msg;

function retornarMsg(msgRetorno){
    console.log(msgRetorno, hora);
}

function calcularHora(hora){   
    if ((hora>=6) && (hora<=12)) {
        msg = 'Bom dia!';
        retornarMsg(msg);
    } else if ((hora>12) && (hora<18)) {
        msg = 'Boa Tarde!';
        retornarMsg(msg);
    } else {
        msg = 'Boa Noite';
        retornarMsg(msg);
    }    
}

calcularHora(12);