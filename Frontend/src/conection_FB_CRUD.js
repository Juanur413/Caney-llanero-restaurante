const userAction = async () => {
    const response = await fetch('https://caney-llanero-restaurante.herokuapp.com/api/producto');
    const myJson = await response.json(); //extract JSON from the http response
    var divProducto = document.getElementById("producto");
    document.getElementById("seccion");
    for(x in myJson){
        var test = myJson[x];
        console.log(test);
        var divProducto = document.getElementById("producto");
        var span = document.getElementById("nombre");
        var spanDesc = document.getElementById("descripcion");
        var spanPres = document.getElementById("precio");
        var hiddenID = document.getElementById("id_Producto");
        span.textContent = test["nombre"];
        spanDesc.textContent = test["descripcion"];
        spanPres.textContent = "$ "+test["precio"];
        var actualizar = document.getElementById("actualizar");
        actualizar.setAttribute("id_producto", test["id_Producto"])
        var clone = divProducto.cloneNode(true);
        if(test["visible"] == 1){
            clone.removeAttribute("hidden");
        }
    
        clone.setAttribute("id", test["id_Producto"]);
        const rest = document.getElementById("seccion");
        rest.appendChild(clone);
    }
}

function actualizarProducto(id){
    var iddata = id;
    window.location.replace("./editar.html"+"?"+"id="+iddata);
}



