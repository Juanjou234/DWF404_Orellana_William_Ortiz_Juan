# DWF404_William-Orellana_Juan-Ortiz

El presente proyecto debe iniciarse mediante la descarga y seguida extracción del mismo, 
una vez ya se ha identificado la ruta donde se ha extraido, podemos empezar.

Paso 1.
  Debemos entrar a nuestro IDE y seleccionar la opción de 'File' -> 'Open', una vez
  entremos al apartado 'Open' deberemos ubicar y extender la ruta del proyecto
  y buscar el archivo pom.xml, daremos doble click sobre este. 
  Aparecerá una ventana donde seleccionaremos 'Abrir como un proyecto'.

Paso 2.
  En pom.xml descargamos las dependencias necesarias dando click en el icono de recargar de Maven.

Paso 3.
  Se debe verificar el servidor a utilizar, si en dado caso tenemos diferencias en este apartado por 
  el nombre con el que se ha definido, simplemente seleccionamos nuestro servidor payara configurado, 
  bajamos al apartado 'Before lauch' y activamos ambos Build artifacts de la parte inferior, 
  damos click en Apply e iniciamos el servidor

Paso 4.
  Nos cargará automáticamente debido a la configuración del archivo web.xml que define como 
  vista de inicio a index.xhtml

Paso 5.
  Visualizaremos la página que contiene la información de los insumos
  ![dwf001](https://github.com/user-attachments/assets/a78ff8c8-06b4-4453-8fee-8b051c9b47c2) 

  de igual manera podremos clickear en el botón de ver JSON para visualizar la información en este formato:
  ![dwf002](https://github.com/user-attachments/assets/5a3177cc-a331-44c6-bb04-8a7b45d4ed6d) 
