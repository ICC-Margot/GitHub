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
public class Bombo extends Percusion {
    void Tocar (String tono){
        super.Tocar(tono);
        System.out.println("Bombo -> "+ tono);
    }
}
