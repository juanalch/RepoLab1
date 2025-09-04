**1. Diferencia entre git merge y git rebase**

git merge
Une dos ramas creando un nuevo commit de merge que conserva el historial de ambas ramas (historia divergente).
Ejemplo:

A---B---C (main)
     \
      D---E (feature)


Después de merge:

A---B---C------M (main)
     \       /
      D-----E
(donde M es un merge commit).

git rebase
Reaplica los commits de tu rama sobre otra rama, reescribiendo el historial como si siempre hubieran salido de ahí.
Ejemplo:
A---B---C (main)
     \
      D---E (feature)


Después de rebase sobre main:

A---B---C---D'---E' (feature)
(No hay commit de merge, el historial es lineal).

Merge mantiene el historial real, con ramas y uniones.
Rebase reescribe el historial para hacerlo más limpio y lineal.

**2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?**

Eso genera un conflicto de merge.
Git no puede decidir automáticamente cuál de las dos versiones conservar, así que deja las marcas de conflicto en el archivo para que los desarrolladores elijan:

"<<<<<<< HEAD"
versión de main
=======
versión de feature
">>>>>>> feature"

**3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?**

Con:
git log --oneline --graph --all

Haciendo esto git nos muestra gráfico ASCII del historial de commits con las ramas y merges.
Ejemplo:

*   9c1a3e9 Merge branch 'feature'
|\  
| * 7f3b4c1 cambio en feature
* | a1c2d3f cambio en main
|/
* 9a8b7c6 commit inicial

**4. Diferencia entre un commit y un push**

Commit: Guarda los cambios en tu repositorio local. Es como un "snapshot" de tus archivos.

Push: Sube los commits de tu repositorio local a un repositorio remoto (por ejemplo, GitHub).

Es decir, se puede tener commits en local que aún no existen en el remoto hasta que se haga el git push.

**5. Para qué sirve git stash y git stash pop**

git stash: Guarda temporalmente los cambios no confirmados (tracked y staged) en una "cajita oculta" y limpia el directorio de trabajo. Es útil si se necesita cambiar de rama sin hacer commit.

git stash pop: Recupera el último stash guardado y lo aplica de nuevo en tu directorio de trabajo, quitándolo de la lista de stashes.

**6. Diferencia entre HashMap y HashTable (Java)**

HashMap:
No está sincronizado (no es thread-safe).
Permite 1 null key y múltiples valores null.
Mejor rendimiento en aplicaciones de un solo hilo.

Hashtable:
Está sincronizado (es thread-safe).
No permite claves null ni valores null.
Considerada "legacy" (anterior a Java 2).

Hoy en día se recomienda el uso de HashMap + Collections.synchronizedMap() o ConcurrentHashMap cuando la sincronización es un requerimiento.

**7.	Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?**  
ESto nos permite un código más conciso pues reduce varias líneas de codigo en una sola expresión, además que es menos propenso a errores.  
Tambien hace eque el código sea más claro y fácil de entender.

**8.	Si usas List con objetos y luego aplicas stream().map() que tipo de operación estas haciendo?**  
Se estaría realizando una operación de transformación, el método map() toma cada elemento del stream, aplica una función sobre él y produce un nuevo stream con los resultados transformaados.  

**9.	Que hace el método stream().filter() y que retorna?**    
El método strams().filter() reaaliza una operación de filtrado sobre los elementos del stream.
Es decir que toma una función que retorna boolean como argumento y evalúa cada elemnto del stream contra esta funcion, retorna un nuevo stream que contine solo los elementos que cumplen con la condición del predicado, los que retornan true.

**10.	 Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.**  
Pasos:  
1.	Sincronizar con el repositorio remoto
git checkout develop  
git pull origin develop  
2.	Crear la rama feature  
git checkout -b feature/nombre-funcionalidad  
3.	Desarrollar la funcionalidad haciendo commits   
git add .  
git commit -m "Descripción del cambio"  
4.	Subir la rama al repo remoto  
git push origin feature/nombre-funcionalidad  
5.	Crear un pull request desde la rama feature hacia develop para revisión y merge.  
**11.	¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?**    
La diferencia entre estas es que el git checkout -b yyy una vez se ejecuta crea la nueva rama y nos hace un "switch" automatico a esa rama creada, mientra que el otro no y toca hacer checkout para pasarse a la rama que se acaba de crear.

**12.	¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?**  

Esto es recomendado por diferentes razones por ejemplo múltiples desarrolladores pueden trabajar en diferentes features simultáneamente, si hay problemas se puede eliminar la rama feature sin afectar el main, facilita la revisión mediate pull request y el main siempre permanece estable y funcional.



**Texto realizado para la primera parte del laboratorio:**
prueba 1
esta es la prube de aleja para ver que sucede si  Owner y Colaborador editan el archivo README.md al mismo tiempo e intentan subir los cambios al mismo tiempo.

Repositorio para el lab1 
Integrantes: Juana lozano Chaves y Laura Alejandra Venegas Piraban
Fecha: 8 de agosto de 2025

Prueba 2 Intento de resolución mediante intellij

Prueba 3 
Las dos intentamos hacer modificaciones en el README y hacer un pull reques desde la rama de cada una. 