Feature: Como usuario de la aplicación deseo iniciar sesión

  @login-successful
  Scenario: Inicio de sesión exitoso
    Given el "usuario" quiere iniciar sesion en la aplicacion
    When ingresa sus credenciales correctas user: 906699 and password: 10df2f32286b7120Mi00LTk5NjYwOQ==30e0c83e6c29f1c3
    Then debe ver la pantalla del home
