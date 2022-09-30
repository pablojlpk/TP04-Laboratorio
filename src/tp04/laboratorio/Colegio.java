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
    
    Materia mat1=new Materia(1,"INGLES PRIMER AÑO",1);
    Materia mat2=new Materia(2,"MATEMATICA PRIMER AÑO",1);
    Materia mat3=new Materia(3,"LABORATORIO 1 PRIMER AÑO",1);
    
 
    Alumno al1 =new Alumno (1001,"López Martín","1001");
    Alumno al2=new Alumno (1002,"Martinez Brenda","1002");
    
    
    
    private HashSet <Materia> lmateria=new HashSet();
    private HashSet <Alumno> lalumno=new HashSet();
    

    @Override
    public String toString() {
        return "Colegio{" + "lmateria=" + lmateria + ", lalumno=" + lalumno + '}';
    }
    
    
            
    public Colegio() {
    this.lmateria=lmateria;
    }
      
    
      
    public void altaMateria(Materia m) {
        lmateria.add(m);
        
    }

        
    public HashSet<Materia> getLmateria() {
    
        return lmateria;
    }
public void altaAlumno(Alumno a){
    lalumno.add(a);
    System.out.println(lalumno);
}

  
 
   
   
    
}
