var currentNumberWrapper = document.getElementById("currentNumber");
var currentNumber = 0;

var element = document.getElementById("subt");
element.addEventListener("click", decrement);

function increment() {
    redden();
    currentNumber += 1;
    currentNumberWrapper.innerHTML = currentNumber;
    document.getElementById("subt").disabled = false;
}

function decrement() {
    
    redden();
    
    if (currentNumberWrapper.innerHTML <= 0) {
        //document.getElementById("subt").disabled = true;
        
    }
    currentNumber -= 1;
    currentNumberWrapper.innerHTML = currentNumber;
}


function redden() {
    if (currentNumberWrapper.innerHTML <= -1) {
        currentNumberWrapper.style.color = "red";
    }
    else {
        currentNumberWrapper.style.color = "black";
    }
}