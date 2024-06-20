const pen={
    name: "rorito",
    price:"10",
    colour:"blue",
    boughtsho:"vidhya sagar"
}
console.log("i am panda i bought ",pen.name,"for rs.",pen.price,"which was in ",pen.colour,"in", pen.boughtsho ,"shop")

// using backticks ``

console.log(`i am panda i bought ${pen.name} for rs.${pen.price}which was in ${pen.colour}in ${pen.boughtsho} shop`)

let a="panda"
let b="panda"
// if(a==b)
//     {
//         document.write("yes")
//     }
//     else
//     {
//         document.write("no")
//     }

c=(a===b)?"yes":"no";
document.write(c)

alert("alert")
prompt("enter your name")