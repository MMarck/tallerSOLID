# tallerSOLID

## INTEGRANTES:
	-- Wesley Briones
	-- Marck Murillo

# SOLID

## SINGLE RESPONSABILITY PRINCIPLE
	Este principio se basa en que cada clase o cada objeto maneje 
	sus propios métodos por lo que la función "calcularPrecioFinal"
	es mas un proceso general del aplicativo, así que se creo una 
	nueva clase en los procesos para que cada clase HELADO y PASTEL 
	puedan solo tener funciones referentes a los mismos objetos.


## OPEN-CLOSED PRINCIPLE
	Este principio dice qie las entidades: las clases, módulos,
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

## DEPENDECY INVERSION PRINCIPLE
