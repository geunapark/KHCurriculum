let cardList= [];

const body = document.querySelector("body");

body.addEventListener("click" ,handleClick );


function handleClick(evt) {
    addCardElemToList(evt);
    printCardInfo();
    hideCard();
    clearCardList();
}
//클릭한 카드를 리스트에 담는다.
function addCardElemToList(evt) {
    const elem =evt.target;
    cardList.push(elem);
}

function clearCardList() {
    if( !isCardListFull() ) {return;}
        cardList = [];
    }


function hideCard(){
    if( !isCardListFull() ) {return;}
    const cardNum01 =cardList[0].getAttribute("cardNum");
    const cardNum02 =cardList[1].getAttribute("cardNum");
    if(cardNum01 == cardNum02)
        cardList[0].classList.add("hide");
        cardList[1].classList.add("hide");
    }  


//카드 2장 선택했다면? 카드 정보 출력
function printCardInfo() {
   if( !isCardListFull() ) {return;}
    console.log(cardList[0] );
    console.log(cardList[1] );
   }
    

//카드 2장 선택했는지 확인
function isCardListFull() {
    return cardList.length ===2;
}