fun main() {
    val pelicula1 = Pelicula("TituloPelicula1","Accion",1)
    val pelicula2 = Pelicula("TituloPelicula2","Aventura",2,true)
    val pelicula3 = Pelicula("TituloPelicula3","Amor",3,true,10.0)
    val pelicula4 = Pelicula("TituloPelicula4","Terror",4)

    val serie1 = Serie("TituloSerie1","Accion",1,1)
    val serie2 = Serie("TituloSerie2","Aventura",2,2,true)
    val serie3 = Serie("TituloSerie3","Amor",3,3,true,3)
    val serie4 = Serie("TituloSerie4","Terror",4,4)

    val plataforma1 = PlataformaStreaming("Netflix")
    val plataforma2 = PlataformaStreaming("Amazon Prime")

    plataforma1.agregarContenido(pelicula1)
    plataforma1.agregarContenido(pelicula2)
    plataforma1.agregarContenido(serie1)
    plataforma1.agregarContenido(serie2)

    plataforma2.agregarContenido(pelicula3)
    plataforma2.agregarContenido(pelicula4)
    plataforma2.agregarContenido(serie3)
    plataforma2.agregarContenido(serie4)

    println(plataforma1)
    println(plataforma2)

    println("\n\n\n--------------------CONTENIDOS CON GENERO ACCION EN PLATAFORMA 1--------------------\n"+plataforma1.contenidosConGenero("Accion"))
    println("\n\n\n--------------------CONTENIDOS CON GENERO AMOR EN PLATAFORMA 2--------------------\n"+plataforma2.contenidosConGenero("Amor"))

    val gestor = Gestor()
    gestor.agregarPlataforma(plataforma1)
    gestor.agregarPlataforma(plataforma2)

    println("\n\n"+gestor.enQuePlataformaPuedoVer("TituloSerie1"))
    println("\n\n"+gestor.enQuePlataformaPuedoVer("TituloPelicula3"))
    println("\n\n"+gestor.enQuePlataformaPuedoVer("TituloDesconocido"))

    println("\n\n\n--------------------CONTENIDOS FAVORITOS INDEPENDIENTEMENTE DE LAS PLATAFORMAS--------------------\n"+gestor.verContenidosFavoritos())
}