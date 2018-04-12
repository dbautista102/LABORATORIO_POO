/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selftestanswerscapitulo02;

/**
 *
 * @author bautista
 */

import java.util.*;
 interface Klakker { }
 class Jammer { Set<Quizel> q; }
 class Quizel implements Klakker { }
 public class Ejercicio14 extends Jammer { List<Floozet> f; }
 interface Floozet { }


 class Floozet2 { }
 class Quizel2 implements Klakker2 { }
 class Jammer2 { List<Quizel> q; }
 interface Klakker2 { }
 class Floozel extends Jammer { List<Floozet> f; }


/*
You’re designing a new online board game in which Floozels are a type of Jammers, Jammers can
have Quizels, Quizels are a type of Klakker, and Floozels can have several Floozets. Which of the
following fragments represent this design? (Choose all that apply.)

LAS RESPUESTAS SON LOS DOS BLOQUES DE CODIGO SIENDO LOS INCISOS A Y C
*/