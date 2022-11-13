
var navtoggle = document.querySelectorAll('#navtoggle')[0]
var deltoggle = document.querySelectorAll('#deletetoggle')[0]

setTimeout(function(){
    deltoggle.checked = true;
}, 300);

setTimeout(function(){
    deltoggle.checked = false;
}, 2000);

function myFunction1() {
    document.getElementById("save").innerHTML = "Save";
}
function myFunction2() {
    document.getElementById("save2").innerHTML = "Save";
}


/*const main = document.querySelector('.main');
const ul = document.querySelector('#left-section')
function createLi(){
    const li = document.querySelector('#UserAndPassword');
    const span = document.createElement('span');
}*/
/*ul.addEventListener('click', (event) => {
    if (event.target.tagName == "BUTTON"){
        const button = event.target;
        const li = button.parentNode;
        const ul = li.parentNode;
        if(button.textContent === 'Edit'){
            const span = li.firstElementChild;
            const input = document.createElement('input');
            input.type = 'text';
            input.value = span.textContent;
            li.insertBefore(input,span);
            li.removeChild(span);
            button.textContent = 'save';
        }else if( button.textContent === 'Save'){
            const input = li.firstElementChild;
            const span = document.createElement('span');
            span.textContent = input.value;
            li.insertBefore(span,input);
            li.removeChild(input);
            button.textContent = 'Edit';

        }
    }

})*/
