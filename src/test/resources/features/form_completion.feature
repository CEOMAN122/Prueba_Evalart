Feature: Como usuario de la aplicación deseo completar el formulario varias veces

  Background:
    Given el "usuario" quiere iniciar sesion en la aplicacion
    When ingresa sus credenciales correctas user: 906699 and password: 10df2f32286b7120Mi00LTk5NjYwOQ==30e0c83e6c29f1c3
    Then debe ver la pantalla del home

  @form-completion
  Scenario: Completar el formulario 10 veces exitosamente
    Given el usuario está en la página del formulario
    When el usuario completa el formulario y lo envía
    Then el formulario debe ser completado exitosamente 10 veces
    And el usuario debe ver el hash de éxito
