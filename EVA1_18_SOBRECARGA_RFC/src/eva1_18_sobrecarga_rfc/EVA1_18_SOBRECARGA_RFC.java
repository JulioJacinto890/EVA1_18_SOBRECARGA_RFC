/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_sobrecarga_rfc;

/**
 *
 * @author hp
 */
public class EVA1_18_SOBRECARGA_RFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String rfc = generarRFC ("Julio","Jacinto","Cruz",2004,11,22);
        System.out.println(rfc);
    }
    public static String generarRFC(String nombre,String apPat,String apMat,int año,int mes,int dia){
        String apP = apPat.charAt(0) + apPat.charAt(1) + "";
        String apP2 =  apPat.charAt(1) + "";
        String apM = apMat.charAt(0) + "";
        String nom = nombre.charAt(0) + "";
        String rfc = apP + apP2 + apM + nom + año + mes+ dia + "";
        return rfc;
        
            
    }
}
