<h1 style="color: green">TareaAPI</h1>
<h2>Importante: </h2>
<p>Para ingresar o crear nuevos registros que contengan una llave foranea(id) se debe usar de la siguiente forma: 
Al crear un comentario, por ejemplo: </p>

```JSON
{
    "texto": "Este es un texto de ejemplo.",
    "fechaCreacion": "Septiembre 2023",
    "tareaId": 1
    
}
```
<p>El id de la tarea se ingresa tal cual está en el ejemplo.</p>



<h3 style="color: green">Objetos que ocupé:</h3>
<h3>ResponseEntity<?> : </h3>
<p>Lo ocupé para manejar mejor los errores de los métodos CRUD dentro de <strong>UsuarioServiceImpl, ComentarioServiceImpl, TareaServiceImpl</strong> en los casos en que se ingrese un ID inexistente dentro de la base de datos.</p>

<h3>Optional<?> :</h3>
<p>Ocupé este objeto para manejar los resultados Null dentro de los metodos CRUD en <strong>UsuarioServiceImpl, ComentarioServiceImpl, TareaServiceImpl</strong> al momento de ir a buscar dentro de la base de datos una tupla inexistente.</p>