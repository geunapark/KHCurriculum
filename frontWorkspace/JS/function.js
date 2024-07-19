function printHello() {
    console.log('hello');
}
printHello();

function log (message) {
    console.log(message);
}
log('hello@');
log(1234);

function changeName(obj) {
    obj.name = 'coder';
}
const ellie = {name :'ellie'};
changeName(ellie);
console.log(ellie);