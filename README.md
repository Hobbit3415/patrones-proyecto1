# Proyecto final corte 1 - Patrones de diseño de software
![Alt text](https://www.usergioarboleda.edu.co/wp-content/uploads/ultimatum/imagens/logo-mobile-UniversidadSergioArboleda.png)

- - -

# Problema
El Banco PDUSA ha creado portafolios acordes a su público. Según el público objetivo ofrecerán un conjunto de productos con los cuales esperan mejorar el onboarding y retención de clientes.
Se han dado cuenta que según la edad o condición laboral, la persona puede necesitar los productos acorde a su realidad, por tal razón, proponen que las personas que recién cumplen 18 años tendrán una cuenta de ahorros, una tarjeta débito con un límite por transacción de $200.000. La cuenta corriente estará deshabilitada. Tendrá una tarjeta de crédito básica con un cupo por  $1.000.000. El producto CDT estará disponible para iniciar un depósito a 5 años en el que puedan ir agregando dinero. El valor mínimo de apertura es de $1.000.000. No contará con crédito rotativo, pero para que el usuario sepa que este producto existe dirá que el crédito rotativo tiene un cupo de $0.
Las personas que ya pertenecen a mundo laboral, se ajustan a un perfil que tiene un límite superior por transacción en su tarjeta débito. Tendrá una cuenta corriente habilitada y el cupo de su tarjeta de crédito (básica) será de $3.500.000. El crédito rotativo tendrá un cupo de $2.000.000 y el CDT será igual al de la categoría anterior.

----→Agregar 2 o más perfiles.

Se debe asegurar que el proceso de creación de portafolios sea siempre el mismo, pues ha sucedido que un por fallas en el proceso, el portafolio de un cliente no se crea correctamente. Para esto, es importante garantizar que en todos los clientes, la creación siga los mismos pasos.
Se debe poder duplicar un producto en caso que el cliente solicite otro producto del mismo tipo. La duplicación se hace para poder reutilizar la información existente y modificar solamente los campos críticos, así el asesor gastará menos tiempo.
El proceso de validación de tarjetas de crédito debe estar centralizado, puesto que se ha evidenciado fraude en la generación de estas tarjetas, por tal razón solamente una instancia debe validar estos números utilizando el algoritmo de Luhn.

**Estudiantes:** 
* Emmanuel Mora Mosquera
* Jonathan Alexander Torres
* Ruben Alexis Nuñez
* Valentina Del Pilar Franco

**Profesor:** Juan Sebastian Leyva

# **Planteamiento**
El programa se dividió en tres módulos, cada modulo implementa un patrón de diseño diferente

> Modulo 1:
>> Creación de tarjetas de crédito y débito -- Patrón Abstract Factory

> Modulo 2:
>> Creación de cuentas y asignación de tarjetas -- Patrón Factory

> Modulo 3:
>> Creación de servicios (CDT y crédito rotativo) -- Patrón Prototype

# **Diagrama de clases**

![diagramaClases](https://user-images.githubusercontent.com/36966781/118346550-1150c480-b502-11eb-92ae-54a264dd605b.png)

