
let x =[];
x[0] ='사과' ; //쌍따음 작은 따음 상관 x
x[1] =3.14;
x[2] =10;
x[3] =true;

let arr = ["aaa","bbb",'ccc','ddd'];

let result =arr.concat("bbb");///1

console.log(result); 

// const arr1 = ['a', 'b', 'c'];
// const arr2 = ['1', '2', '3'];
// const arr3 = arr1.concat(arr2);
// console.log(arr3); concat--

const array1 = ['one', 'two', 'three'];
console.log('array1:', array1);
// Expected output: "array1:" Array ["one", "two", "three"]

const reversed = array1.reverse();
console.log('reversed:', reversed);
// Expected output: "reversed:" Array ["three", "two", "one"]

// Careful: reverse is destructive -- it changes the original array.
console.log('array1:', array1);
// Expected output: "array1:" Array ["three", "two", "one"]
