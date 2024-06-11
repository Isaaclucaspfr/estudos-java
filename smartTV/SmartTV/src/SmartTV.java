public class SmartTV {
    boolean ligada=false;
    int canal=1;
    int volume=10;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void AumentarVolume(){
        if(volume<100)
        volume++;
        
    }

    public void DiminuirVolume(){
        if(volume>0)
        volume--;
        
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
   
    }

