# Proyecto final corte 1 - Patrones de diseño de software
![Alt text](https://www.usergioarboleda.edu.co/wp-content/uploads/ultimatum/imagens/logo-mobile-UniversidadSergioArboleda.png)

- - -

# **Para ejecutar el programa, ejecutar el Cliente.java del paquete Lanzador**

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
* Módulo de creación de tarjetas:

> ![creacionTarjetas](https://user-images.githubusercontent.com/36966781/133848439-78ad59ae-9366-470d-b8b5-8635fe8847eb.png)

* Módulo de creación de cuentas:

> ![creacionCuentas](https://user-images.githubusercontent.com/36966781/133848460-72dd8a51-1217-4532-bf4d-de04b7044256.png)

* Módulo de creación de servicios:

> ![creacionServicios](https://user-images.githubusercontent.com/36966781/133848474-7d1b2091-d4ab-4d93-9c94-a9d30235ad7e.png)
