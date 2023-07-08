let producto
let operacion
while(producto != "esc"){
let producto = prompt("ingrese producto")
let monto = prompt("ingrese monto a pagar")
let cuotas = prompt("ingrese cantidad de cuotas (6, 12, 18)")
monto = parseFloat(monto)
let cuotas6 = 1.15
let cuotas12 = 1.25
let cuotas18 = 1.40
cuotas6 = parseFloat(cuotas6)
cuotas12 = parseFloat(cuotas12)
cuotas18 = parseFloat(cuotas18)
switch(cuotas){
    case "6":
        operacion = monto * cuotas6
        break
        case "12" :
            operacion = monto * cuotas12
            break
            case "18" :
                operacion = monto * cuotas18
                break
}

const productos = []
    productos.push(
        {
            nombre: producto,
            precioContado: monto,
            precioFinanciado: operacion
        }
    )
    //producto = prompt("ingrese producto")
    console.log(productos)
    }
