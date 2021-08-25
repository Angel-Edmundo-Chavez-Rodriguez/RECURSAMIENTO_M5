package com.cetis108.tercerparcial

class Coche {
    var Imagen: Int? = null
    var Nombre: String? = null
    var Descripcion: String? = null
    var Precio: String? = null
    var Venta: Boolean? = null

    constructor(
        Imagen: Int?,
        Nombre: String?,
        Descripcion: String?,
        Precio: String?,
        Venta: Boolean?
    ) {
        this.Imagen = Imagen
        this.Nombre = Nombre
        this.Descripcion = Descripcion
        this.Precio = Precio
        this.Venta = Venta
    }
}