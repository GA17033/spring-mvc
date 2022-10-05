
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap demo</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    </head>
    <body>
        <div class='container'>
            <div class='row'>
                <div class='col d-flex justify-content-center mt-4 align-items-center '>
                    <div class="card" style="width: 18rem;">
                        <div class="card-body">
                            <form method='POST' >
                                <div class="mb-3">
                                    <label>Nombre</label>
                                    <input type="text" name="nombre" class="form-control" value="${lista[0].nombre}"  />
                                </div>
                                <input type="submit" value="Actualizar" class="btn btn-success"/>
                            </form>
                        </div>
                    </div>
                </div>

            </div>


        </div>
    </body>
</html>
