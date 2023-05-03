# UD6 - Práctica 2 - Documentar el código con JavaDoc

* [1. Modifica la clase `Calculadora.java`](#1-modifica-la-clase-calculadorajava)
* [2. **Documenta** el código de la clase `Calculadora` usando comentarios `JavaDoc`:](#2-documenta-el-código-de-la-clase-calculadora-usando-comentarios-javadoc)
* [3. **Genera** en **eclipse** la documentación **JavaDoc** del proyecto.](#3-genera-en-eclipse-la-documentación-javadoc-del-proyecto)
* [4. Haz una captura del **código fuente** documentado resultante de la clase `Calculadora`](#4-haz-una-captura-del-código-fuente-documentado-resultante-de-la-clase-calculadora)
* [5. Muestra el **resultado** de la documentación:](#5-muestra-el-resultado-de-la-documentación)
* [6. Añade 3 **nuevos métodos** a la clase `Calculadora`](#6-añade-3-nuevos-métodos-a-la-clase-calculadora)

Realiza un *fork* del proyecto que se encuentra en: <https://github.com/Cami500/Practica2_UD6>. Una vez ralizado, crea una nueva rama que se llame **tu_nombre+apellido** y comprueba que puedes ejecutarlo con **eclipse**. Cuando lo tengas, realita las siguientes tareas:

> Cada tarea debe estar como máximo enu ncommit diferente y la rama **tu_nombrea+pellido** debe subirse a tu repositorio nuevo creado.
> La entrega se realiza adjuntando el enlace al repositorio de la actividad y adjuntando la carpeta con el original y el pdf con las capturas solicitadas/texto de la tarea.

Realiza todas las capturas necesarias para indicar que has realizado la tarea

## 1. Modifica la clase `Calculadora.java`

* Renombra el paquete `ed.izan` a `ed.<tu_nombre>`

## 2. **Documenta** el código de la clase `Calculadora` usando comentarios `JavaDoc`:

* Para la **clase**:
  * Debe tener: una descripción corta que explique **claramente** para qué sirve esta clase. Añade en otro parrafo una descripción *más larga*.
  * Añade los **tags** *JavaDoc* necesarios para documentar:
    * El **autor** (pon tu nombre completo)
    * La **versión** actual de la clase (3.7)
    * Que está **disponible desde** la versión 2.1, junio de 2022.
* Para cada uno de los métodos, documenta:
  * **Descripción** explicando que hace el método.
  * **Parámetros** con la descripción más adecuada.
  * Valor que **devuelve** con una descripción adecuada.
  * Si el método genera una **excepción** (error de ejecución), pon el tipo de excepción y la descripción de la misma (por ejemplo, el caso de la división por cero)

## 3. **Genera** en **eclipse** la documentación **JavaDoc** del proyecto.

* Arregla los posibles **errors/warnings** que aparezcan. Fijate en la descripción del error y vuelve a generar la documentación hasta que funcione correctamente.
* Haz una captura de la **Consola**: debe verse todo el proceso de generación completo.
* Haz una captura en la vista **Package Explorer** del directorio **doc** resultante.

> Revisa si la documentación se ha añadido correctamente a git, en caso contrario, revisa el fichero .gitignore. 

## 4. Haz una captura del **código fuente** documentado resultante de la clase `Calculadora`

(En este caso, es posibleque no sea necesario un commit)

## 5. Muestra el **resultado** de la documentación: 

* Muestra elfichero ***index.html*** en el **Navegador** integrado en **Eclipse** y muestra capturas de **TODO** su contenido. Fijate enla correspondencia entre las descripciones y tags de las páginas web (*html*) generadas.

## 6. Añade 3 **nuevos métodos** a la clase `Calculadora`

```java

public int oper1 ( int a , int n ){

    int t = 1;

    for ( int i = 0; i < n ; i++ ){
        t = t * a;
    }

    return t; 
}


public boolean oper2 ( int a ){

    boolean r;

    if ( a % 2 == 0) {
        r = true;
    } else {
        r = false;
    }

    return r;
}


public String oper3(int a){

    String r = "";
    int v = a;
    int v1;

    while ( v > 0) {
        v1 = v % 2;
        r = v1 + r;
        v = v / 2;
    }
}

```

* **Investiga** que cálculo realiza cada uno (ayudate del debugger).
* **Cambia** el nombre de los métodos y sus variables para que correspondan a un nombre más representativo de acuerdo con su funcionamiento(**Usa Refactoring -> Rename**)
* **Documenta** los nuevos métodos adecuadamente con comentarios *JavaDoc*.
* **Genera** la documentación en *JavaDoc*
* Muestra **capturas** de:
  * **código documentado** (fomatea el código si es necesario)
  * directorio Doc y
  * la documentación resultante en el navegador

> Para realizar los commits a git, puede ser una buena estrategia realizarlos por partes, es decir, primero el código, después el código formateado, después el código documentado, etc.
