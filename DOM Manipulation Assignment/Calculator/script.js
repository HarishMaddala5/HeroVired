let d=document.getElementsByClassName('disp')[0];
function fun(e){
    d.innerHTML+=e;
}
function allClear(){
    d.innerHTML="";
}
function back(){
    d.innerHTML=d.innerHTML.substring(0, d.innerHTML.length - 1);
}
function equal(){
    d.innerHTML=eval(d.innerHTML);
}