# ProyectoGimnasioJava
# Descripcion de la mejora
Se ha añadido un metodo por el cual se pueden añadir mas activiades a la oferta del Gimnasio. En el codigo nuevo se ha introducido una nueva actividad, Baloncesto.

Se ha realizado esta mejora debido a que si el gimnasio quiere ampliar su oferta de actividades deportivas, se puede hacer facilmente llamando al metodo y agregando la actividad.

Para usar la nueva funcionalidad basta con llamar al metodo `nuevaActividad();` e incluir entre los parentesis aquella actividad que se quiera agregar.
En el codigo esta de la siguiente manera:

  `miGimnasio.nuevaActividad("Baloncesto");`
  
  `miGimnasio.mostrarActividades();`

Despues de llamar al metodo mencionado se vuelve a usar el metodo `mostrarActividades();` para comprobar que se ha introducido correctamente.

Destacar que para usar esta nueva funcionalidad ha sido necesario usar la libreria `ArrayList` y crear un nuevo ArrayList `"private ArrayList<String> actividades = new ArrayList<>();" `
Este nuevo ArrayList es rellenado con las `actividadesBascias` que ofrece el gimnasio (Yoga, Boxeo, Funcionalidad).

