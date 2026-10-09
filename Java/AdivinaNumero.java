package Java;

import javax.swing.JOptionPane;

public class AdivinaNumero {
    public static void main(String[] args) {
    int numAleatorio;
    int contador = 0;
    int num1;

    numAleatorio = (int) (Math.random()*100);

    //System.out.println(numAleatorio);


    do{
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
  
        if (numAleatorio > num1){
            System.out.println("Digite un numero mayor");

                } else{
                    System.out.println("Digite un numero menor");

                }
                contador++;
                
    
                }while (num1 !=numAleatorio);
                System.out.println("Felicidades, Ganaste" + "\n Numero intentos: " + " " + contador);


        }
    
        
}
