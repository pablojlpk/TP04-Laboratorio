/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04.laboratorio;

import java.util.HashSet;

/**
 *
 * @author sistema
 */
public class Colegio {
      HashSet <Materia> lmateria=new HashSet();
      

      
    public void altaMateria(Materia m) {
        lmateria.add(m);
        
    }

    public HashSet<Materia> getLmateria() {
        return lmateria;
    }

 
    
   
    
}
