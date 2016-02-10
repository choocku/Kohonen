/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohonen;

import java.io.IOException;

/**
 *
 * @author choocku
 */
public class Kohonen {

    /**
     * @param args the command line arguments
     */
    static int numberInput = 16;
    static int gridSize = 10;
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ReadData test = new ReadData("animal.txt", numberInput, gridSize*gridSize);
    }
    
}
