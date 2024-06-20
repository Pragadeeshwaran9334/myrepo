random=10
let guessno=prompt("enter a nmbr")
while(guessno!=random){
    console.log("try again")
    guessno=prompt("enter again")
}
if(guessno==random){
    alert("congrats")
}