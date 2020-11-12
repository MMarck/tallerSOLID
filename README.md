# tallerSOLID

## INTEGRANTES:
	-- Wesley Briones
	-- Marck Murillo
	-- Angie Flores
	-- Franklin Ordoñez
	-- Joyce Rojas

# SOLID

## SINGLE RESPONSABILITY PRINCIPLE
	Este principio se basa en que cada clase o cada objeto maneje 
	sus propios métodos por lo que la función "calcularPrecioFinal"
	es mas un proceso general del aplicativo, así que se creo una 
	nueva clase en los procesos para que cada clase HELADO y PASTEL 
	puedan solo tener funciones referentes a los mismos objetos.


## OPEN-CLOSED PRINCIPLE
	Este principio dice que las entidades: las clases, módulos,
	funciones y objetos deben estar abiertos a extensión pero cerrados
	para modificación. Se puede apreciar que todo el apartado de procesos
	no sigue con este principio puesto que si se quiere agregar más postres 
	habría que cambiar el código fuente de la clase CalculadorPrecioFinal
	Entonces se hizo los cambios pertinentes para que se pueda extender la clase
	sin cambiar el código fuente.


## LISTOV SUBTITUTION PRINCIPLE
	Este principio plantea que las clases hijas puedan ser 
	reemplazadas completamente por clases padre, en este caso las 
	clases Helado y Pastel eran muy similares y se tuvo que crear 
	una clase padre que mantuviera ese principio


## INTERFACE SEGREGATION PRINCIPLE
	No parece que se incumpla este principio ya que todos las funciones abtractas
	implementadas y usadas

## DEPENDECY INVERSION PRINCIPLE
	En cuanto a este principio, se puede traducir como una manera especifica de 
	desacoplar los modulos de un software, y se da a entender que aquellos modulos
	de alto nivel no deben depender de los de bajo nivel, si no de abstracciones y 
	de estas los detalles. Es lo que sucede en el punto 4 en donde la clase Aderezo
	paso a ser estatica y las demas clases relacionadas, es decir las de bajo nivel
	implementan metodos sobreescritos de la abstraccion mayor, es decir de la clase
	Aderezo. Aqui vemos como se cumple el principio.


## Punto 5
	Al descomentar las dos sentencias en el main se puede notar el error que se
	lanza desde lecheDeslactosada, este error puede ser manejado desde la clase
	manejador de leche
