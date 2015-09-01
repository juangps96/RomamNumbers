# RomamNumbers

This repository is an Example for Stack Builder 

By Juan Penaherrera

Aspectos técnicos
La aplicación móvil es un sencillo ejemplo de conversión de números romanos a decimales, sin
embargo, se desean resaltar los siguientes aspectos técnicos:

IDE
Se utilizó Android Studio 1.3.2 JRE 1.7, mi experiencia mayormente es en el IDE Visual
Studio, sin embargo, el IDE Android Studio investigado exclusivamente para este
ejemplo en Stack Builders es similar y me deja como conclusión que el Patrón MVP
(xml + Java) es similar al patrón MVVM (Silverlight + C#) en VS y que vienen del padre
común MVC. Lo cual permite tener el código de lógica y de interfaz de una forma
ordenada e interactuar de una manera más intuitiva.

Recursos
Similar al Silverlight se ha usado el recurso Strings.xml, lo cual permite no quemar
código, por ejemplo, para mensajes o botones, por lo que un cambio incluso se lo
puede hacer en caliente, o hacer una aplicación globalizada (Inglés, español) de forma
fácil.

Control de Versiones
He tenido experiencia con SVN y VS Team Foundation Server, sin embargo, la
investigación sobre GitHub, me resultó muy interesante, además, permite verificar
estándares, como por ejemplo código muerto y subidas de código sin comentarios. El
código fue subido al repositorio: https://github.com/juangps96/RomamNumbers.git

TDD
Se han aplicado clases de test, realizando el test de developer a developer, ver Anexo
1, test., y aplicando la metodología de desarrollo de guiones de prueba.

Refactorización
Se aplicaron técnicas de refactorización como el desglose en métodos pequeños y el
renombre de variables, además de revisión de código duplicado. Ver Anexo 2,
refactorización.

Validaciones
Se utilizan tooltips de error para el control del ingreso de datos ver Anexo 3, Tooltip y
se valida la entrada mediante expresiones regulares.
