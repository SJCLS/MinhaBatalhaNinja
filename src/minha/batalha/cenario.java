package minha.batalha;

public class cenario {
    
    // atributos encapsulados
    
    private String tipo;
   
    
    // construtor

    public cenario(String tipo) {
        this.tipo = tipo;
       
    }
    
    
    //metodo

    public String getFogo() {
        return tipo;
    }

    public void setFogo(String tipo) {
        this.tipo = tipo;
    }

   

    
    public void calculocenario(){
        switch(this.tipo){
            case  "fogo":
                this.ataque=100;
                this.defesa=30;
                this.chakra=50;
            break;
            
            case  "doton":
                this.ataque=40;
                this.defesa=90;
                this.chakra=70;
            break;
            
            case  "suiton":
                this.ataque=70;
                this.defesa=50;
                this.chakra=60;
            break;
            
            case  "fuuton":
                this.ataque=70;
                this.defesa=20;
                this.chakra=60;
            break;
            
            case  "raiton":
                this.ataque=85;
                this.defesa=40;
                this.chakra=70;
            break;}

        }
    
}
    
    
    
    

    
    
    
     
       

    
    
    
    
 
