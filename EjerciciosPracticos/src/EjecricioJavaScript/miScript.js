
/*console.log("Hola mundo2")
alert("Hola mundo javascript")
if(confirm("Hola Usuario, ¿Desea entrar?")){
    document.writeln("Hola mundo javascript")
}else{
    document.writeln("Adios!!")
}*/


function ordenaListEntAsc() {
    let listaNum = [7,2,4,8,3,9,1,5,10,6];

    let temporal = 0;
        for ( i = 0; i < listaNum.length; i++) {
        for ( j = 1; j < (listaNum.length - i); j++) {
            if (listaNum[j - 1] > listaNum[j]) {
                temporal = listaNum[j - 1];
                listaNum[j - 1] = listaNum[j];
                listaNum[j] = temporal;
            }
          }
        }

     //   alert("Lista en orden Ascendiente"  +listaNum)
         document.getElementById('fResult').value = listaNum
}

function  ordenaListEntDesc() {
    let listaNum = [7,2,4,8,3,9,1,5,10,6];
    let temporal = 0;
        for ( i = 0; i < listaNum.length; i++) {
        for ( j = 1; j < (listaNum.length - i); j++) {
            if (listaNum[j - 1] < listaNum[j]) {
                temporal = listaNum[j - 1];
                listaNum[j - 1] = listaNum[j];
                listaNum[j] = temporal;
            }
          }
        }
    //    alert("Lista en orden Descendiente" +listaNum)
        document.getElementById('fResult').value = listaNum

}

function limpiar(){
    document.getElementById('fResult').value = ''
}

