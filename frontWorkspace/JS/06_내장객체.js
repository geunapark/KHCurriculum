const x = new Object();
x.name ="홍길동";

const result =x.hasOwnProperty("name");
console.log(result);

//여기서 hasOwnProperty() 메서드는 객체가 특정 속성을 직접 소유하고 있는지를 확인하는 메서드입니다. 만약 해당 속성이 객체 자체에 직접 정의되어 있다면 true를 반환하고, 프로토타입 체인을 통해 상속된 속성은 false를 반환합니다.
//따라서 결과는 true가 됩니다. 왜냐하면 x 객체에 name 속성이 직접 정의되어 있기 때문입니다.

console.log(x instanceof Object);
//x라는객체가 오브젝트타입에 있나 
//주어진 코드는 x 객체가 Object 클래스의 인스턴스인지를 확인합니다.
 //instanceof 연산자는 특정 객체가 특정 클래스(또는 그 클래스를 상속한 서브클래스)의 인스턴스인지를 판별합니다.

//따라서 console.log(x instanceof Object); 코드는 x 객체가 Object 클래스의 인스턴스인지를 
//확인하고 그 결과를 콘솔에 출력합니다.

//JavaScript에서 모든 객체는 기본적으로 Object 클래스를 상속하므로, 
//이 코드의 결과는 항상 true가 됩니다. 따라서 결과는 true가 출력될 것입니다.

//날짜 Wed Apr 17 2024 10:36:29 GMT+0900 (한국 표준시)
const date= new Date();
console.log(date);

function showCurrentTime() {
    const divTag =document.querySelector("#div-time");
    divTag.innerText= new Date();

    console.log(new Date());
}

document.createElement("button");