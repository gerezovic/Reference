let user = prompt("Enter user")
let n1 = 700
let n2 = 521
let n3 = 687
let n4 = 150
let array1 = ["l22","R54","f78","sS1","DH0"]
let array2 = [20,65,78,96,39,44]
n1 = parseInt(n1)
n3 = parseInt(n3)
if(user == "Gerezovic2002"){
    console.log("Loggued user")
}else if(user == "Sebh111"){
    console.log("Loggued user")
}else if(user == "Lito_RLb"){
    console.log("Loggued user")
}else{
    console.log("Acces denied")
}
if((n1 > 14) && (n2 < 600)){
    alert("Stable")
}else{
    alert("Actions required")
}
if((n3 == 400) && (n4 == 150)){
    alert("Stable")
}else{
    alert("Actions required")
}
let n5 = prompt("Enter number")
if((n5 == 850) || (n5 == 996)){
    alert("Optimized work")
}else{
    alert("Inminent destruction if actions are not taken")
}
console.log(array1[0] + array2[5])
let aOr = prompt("Set amount of rounds")
aOr = parseInt(aOr)
for(let r = 1 ; r<=aOr ; r++){
    console.log("Round: " + r)
}