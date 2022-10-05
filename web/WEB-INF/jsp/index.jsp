<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap demo</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    </head>
    <body>

        <div class="container">
            <div class="row">
                <div class="col mt-4 ">
                    <div class="card">
                        <div class="card-head ">
                            <a type="button" class="btn btn-success" href='agregar.htm' >Agregar Categoria</a>
                        </div>
                        <div class="card-body">
                            <table class="table table-dark  ">
                                <thead>
                                    <tr>
                                        <th scope="col">#</th>
                                        <th scope="col">Nombre</th>
                                        <th scope="col">Estado</th>
                                        <th>Acciones</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="dato" items="${lista}">
                                        <tr>
                                            <th scope="row">${dato.id}</th>
                                            <td>${dato.nombre}</td>
                                            <td>${dato.estado}</td>
                                            <td>
                                                <a href="editar.htm?id=${dato.id}" class="btn btn-warning">Editar</a>
                                                 <a href="eliminar.htm?id=${dato.id}" class="btn btn-danger">Eliminar</a>
                                            </td>

                                        </tr>

                                    </c:forEach>

                                </tbody>
                            </table>
                        </div>
                    </div>

                </div>
            </div>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
    </body>
</html>