function swap(num1, num2) 
{ 
    num1 = num1-num2;
    num2 = num1+num2;
    num1 = num2-num1;
    
    return {
        num1,
        num2
    };
} 

let {num1,num2} = swap(3,5);
console.log("Swap(3,5) gives",num1,num2);

let val = swap(78,1);
num1 = val.num1
num2 = val.num2
console.log("Swap(78,1) gives",num1,num2);
