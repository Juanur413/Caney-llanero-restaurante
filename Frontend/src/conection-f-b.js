const userAction = async () => {
    const response = await fetch('https://caney-llanero-restaurante.herokuapp.com/api/producto');
    const myJson = await response.json(); //extract JSON from the http response
    var divProducto = document.getElementById("producto");
    document.getElementById("seccion");
    for(x in myJson){
        var test = myJson[x];
        var divProducto = document.getElementById("producto");
        var imagen = document.getElementById("imagen");
        var span = document.getElementById("nombre");
        var spanDesc = document.getElementById("descripcion");
        var spanPres = document.getElementById("precio");
        imagen.setAttribute("src" , test["imagen"]);
        span.textContent = test["nombre"];
        spanDesc.textContent = test["descripcion"];
        spanPres.textContent = "$ "+test["precio"];
        var clone = divProducto.cloneNode(true);
        if(test["visible"] == 1){
            clone.removeAttribute("hidden");
        }
        clone.setAttribute("id", test["id_Producto"]);
        const rest = document.getElementById("seccion");
        rest.appendChild(clone);

    }
}


