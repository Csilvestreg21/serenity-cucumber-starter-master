# language: es
Característica: Login en la aplicación

  Escenario: Inicio de sesión exitoso
    Dado que el usuario navega a la página de login
    Cuando ingresa las credenciales "standard_user" y "secret_sauce"
    Entonces debería ver el catálogo de productos