@TimeEntry @Regression
  Feature: Comprobar el funcionamiento de las entradas de tiempo de Clockify

    @GetTimeEntry @Smoke
    Scenario Outline: Obtener las horas en una entrada
      Given estoy en Clockify con mi key <x-api-key>
      When llevo a cabo un '<operacion>' a '<entity>' endpoint con el '<jsonName>' y ''
      Then se obtuvo el status code <statusCode>

      Examples:
        | jsonName       | statusCode | operacion | entity   | x-api-key                                        |
        | getTimeEntries | 200        | GET       | GET_TIME | YTI4ZWMzYzAtNmNhMS00ZTllLWJjMzMtMzhkZDliYjNlNjE2 |

    @AddTimeEntry @Smoke
    Scenario Outline: Obtener las horas en una entrada
      Given estoy en Clockify con mi key <x-api-key>
      When llevo a cabo un '<operacion>' a '<entity>' endpoint con el '<jsonName>' y ''
      Then se obtuvo el status code <statusCode>
      And obtengo el timeId

      Examples:
        | jsonName     | statusCode | operacion | entity   | x-api-key                                        |
        | addTimeEntry | 201        | POST      | ADD_TIME | YTI4ZWMzYzAtNmNhMS00ZTllLWJjMzMtMzhkZDliYjNlNjE2 |

    @EditTimeEntry @Smoke
    Scenario Outline: Editar las horas en una entrada
      Given estoy en Clockify con mi key <x-api-key>
      And llevo a cabo un 'POST' a 'ADD_TIME' endpoint con el 'addTimeEntry' y ''
      And se obtuvo el status code 201
      And obtengo el timeId
      When llevo a cabo un '<operacion>' a '<entity>' endpoint con el '<jsonName>' y ''
      Then se obtuvo el status code <statusCode>

      Examples:
        | jsonName        | statusCode | operacion | entity    | x-api-key                                        |
        | editTimeEntries | 200        | PUT       | EDIT_TIME | YTI4ZWMzYzAtNmNhMS00ZTllLWJjMzMtMzhkZDliYjNlNjE2 |

    @DeleteEntry @Smoke
    Scenario Outline: Crear una entrada de horas
      Given estoy en Clockify con mi key <x-api-key>
      And llevo a cabo un 'POST' a 'ADD_TIME' endpoint con el 'addTimeEntry' y ''
      And se obtuvo el status code 201
      And obtengo el timeId
      When llevo a cabo un '<operacion>' a '<entity>' endpoint con el '<jsonName>' y ''
      Then se obtuvo el status code <statusCode>

      Examples:
        | jsonName        | statusCode | operacion | entity       | x-api-key                                        |
        | deleteTimeEntry | 204        | DELETE    | DELETE_ENTRY | YTI4ZWMzYzAtNmNhMS00ZTllLWJjMzMtMzhkZDliYjNlNjE2 |