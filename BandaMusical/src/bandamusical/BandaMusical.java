/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandamusical;

/**
 *
 * @author MARGOT
 */
public class BandaMusical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instrumentos t[]= new Instrumentos [3];
        t[0]=new Flauta ();
        t[1]=new Corneta ();
        t[2]=new Guitarra();
        
        for (int i=0; i<3; i++){
            t[i].Tocar("fa");
        }
        
    }
    
}
