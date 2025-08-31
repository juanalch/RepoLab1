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


**Texto realizado para la primera parte del laboratorio:**
prueba 1
esta es la prube de aleja para ver que sucede si  Owner y Colaborador editan el archivo README.md al mismo tiempo e intentan subir los cambios al mismo tiempo.

Repositorio para el lab1 
Integrantes: Juana lozano Chaves y Laura Alejandra Venegas Piraban
Fecha: 8 de agosto de 2025

Prueba 2 Intento de resolución mediante intellij

Prueba 3 
Las dos intentamos hacer modificaciones en el README y hacer un pull reques desde la rama de cada una. 