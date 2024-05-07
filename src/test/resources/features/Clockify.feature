@Clockify
  Feature: Comprobar el funcionamiento de API Clockify

    @GetWorkspaces
    Scenario Outline: Obtener los Workspace de Clockify
      When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
      Then status code <statusCode> is obtained

      Examples:
        | jsonName | statusCode | operation | entity    |
        | get      | 200        | GET       | WORKSPACE |