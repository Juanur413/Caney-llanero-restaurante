const userAction = async () => {
    const response = await fetch('http://localhost:9090/api/producto');
    const myJson = await response.json(); //extract JSON from the http response
    var divProducto = document.getElementById("producto");
    document.getElementById("seccion");
    for(x in myJson){
        var test = myJson[x];
        console.log(test["nombre"]);
        var divProducto = document.getElementById("producto");
        var clone = divProducto.cloneNode(true);
        var span = document.getElementById("nombre");
        var spanDesc = document.getElementById("descripcion");
        var spanPres = document.getElementById("precio");
        span.textContent = test["nombre"];
        spanDesc.textContent = test["descripcion"];

        spanPres.textContent = "$ "+test["precio"];
        const rest = document.getElementById("seccion");
        rest.appendChild(clone);
    }
}
userAction();