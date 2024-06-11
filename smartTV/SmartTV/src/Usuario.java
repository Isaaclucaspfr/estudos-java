import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SmartTV smartTV = new SmartTV();
        int contador=0;
        String resposta ="Null";
        while (contador <= 90) {
            System.out.println("Você quer aumentar o volume? ");
            resposta = input.next();
            if (resposta =="sim") {
                smartTV.AumentarVolume();
                System.out.println("Volume atual: " + smartTV.volume);
            }
            else if (resposta == "não"|| resposta == "nao") {
                smartTV.DiminuirVolume();;
                System.out.println("Volume atual: " + smartTV.volume);
            }
            else {
                break;
            }
        }

        System.out.println("A tv está ligada? "+smartTV.ligada);
        System.out.println("A tv está no canal: "+smartTV.canal);
        System.out.println("Volume: "+smartTV.volume);


        smartTV.ligar();
        System.out.println("Samsung está ligada?"+smartTV.ligada);
         
        smartTV.desligar();
        System.out.println("Samsung está ligada?"+smartTV.ligada);
        }
    }
        
