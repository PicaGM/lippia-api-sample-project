@TimeEntry @Regression
  Feature: Comprobar el funcionamiento de las entradas de tiempo de Clockify

    @GetTime @Smoke
    Scenario Outline: Obtener las horas en una entrada
      Given estoy en Clockify con mi key <x-api-key>
      When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
      Then status code <statusCode> is obtained
      And expected response is obtained in '<entity>' with '<expectedResponse>'

      Examples:
        | jsonName        | statusCode | operation | entity | expectedResponse | x-api-key                                        |  |
        | getTimeeEntries | 200        | GET       | TIME   |                  | YTI4ZWMzYzAtNmNhMS00ZTllLWJjMzMtMzhkZDliYjNlNjE2 |  |