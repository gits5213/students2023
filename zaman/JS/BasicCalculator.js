const prompt = require("prompt-sync")({sigint:true})

/*
const prompt = require("prompt-sync")({sigint:true})

Here is what each part of the code does:
const prompt declares a constant variable called prompt which will store the prompt-sync package.
require("prompt-sync") loads the prompt-sync package.
({sigint:true}) configures the prompt-sync package to exit the program if the user presses Ctrl+C or Ctrl+D to interrupt the program. If you don't include this option, the program will continue to run even if the user tries to exit.
Together, this line of code sets up a prompt for the user to input values in the Node.js command line interface. 

*/

function add(x, y) {
    const z = x + y;
    return z.toFixed(2);
}
function multi(x, y) {
    const z = x * y;
    return z.toFixed(2);
}
function sub(x, y) {
    const z = x - y;
    return z.toFixed(2);
}
function div(x, y) {
    const z = x / y;
    return z.toFixed(2);
}
function rem(x, y) {
    const z = x % y;
    return z.toFixed(2);
}


console.log("\nSelect operation.")
console.log('1.Add')
console.log("2.Subtract")
console.log("3.Multiply")
console.log("4.Divide")
console.log("5.Remainder \n")

a = 'y'

while(a.toLowerCase() == 'y'){

    const choice = parseInt(prompt("Enter your choice: "))
    // const num1 = parseFloat(prompt("Enter first number: "))
    // const num2 = parseFloat(prompt("Enter second number: "))

    switch(choice){

        case 1:
            const num1 = parseFloat(prompt("Enter first number: "))
            const num2 = parseFloat(prompt("Enter second number: "))
            console.log("\n",num1,"+",num2,"= ", add(num1,num2),"\n")
            break;
        
        case 2:
            const num3 = parseFloat(prompt("Enter first number: "))
            const num4 = parseFloat(prompt("Enter second number: "))
            console.log("\n",num1,"-",num2,"= ", sub(num1,num2),"\n")
            break;
        
        case 3:
            const num5 = parseFloat(prompt("Enter first number: "))
            const num6 = parseFloat(prompt("Enter second number: "))
            console.log("\n",num1,"x",num2,"= ", multi(num1,num2),"\n")
            break;
        
        case 4:
            
            const num7 = parseFloat(prompt("Enter first number: "))
            const num8 = parseFloat(prompt("Enter second number: "))
            
            if(num8 !=0){
                console.log("\n",num1,"/",num2,"= ", div(num1,num2),"\n")
            }
            else{
                console.log("\nSyntax error\n")
            }
            break;
        
        case 5:
            const num9 = parseFloat(prompt("Enter first number: "))
            const num10 = parseFloat(prompt("Enter second number: "))
            console.log("\n",num1,"%",num2,"= ", rem(num1,num2),"\n")
            break;

        default:
           console.log("wrong input \n")
        



    }
    a = prompt("Do you wish to continue? Y/N: ");

    





}


