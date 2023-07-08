let cons1 = "Person no. 1"
let cons2 = "Person no. 2"
let nme = prompt("Enter name")
let srname = prompt("enter surname")
let age = prompt("enter age")
let mney = prompt("enter money")
const per1 = {
    nme : nme,
    srname : srname,
    age : age,
    mney : mney
}
console.log(cons1)
console.log(per1.nme)
console.log(per1.srname)
console.log(per1.age)
console.log(per1.mney)
let nm2 = prompt("enter name")
let srname2 = prompt("enter surname")
let age2 = prompt("enter age")
let mney2 = prompt("enter money")
const per2 = {
    nm2 : nm2,
    srname2 : srname2,
    age2 : age2,
    mney2 : mney2
}
console.log(cons2)
console.log(per2.nm2)
console.log(per2.srname2)
console.log(per2.age2)
console.log(per2.mney2)
let pro1 = prompt("enter product")
let pro2 = prompt("enter product")
let pro3 = prompt("enter product")
const prods = [
    pro1 = pro1,
    pro2 = pro2,
    pro3 = pro3
]
console.log(prods)
console.log(prods[2])
let originalProd1 = prompt("enter product")
let replacementProd1 = prompt("enter new product")
let location1 = prods.indexOf(originalProd1)
prods[location1] = replacementProd1
console.log(prods)