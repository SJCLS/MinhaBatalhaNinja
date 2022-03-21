package minha.batalha;
import java.util.Scanner;

public class ninja {
 Scanner scanner = new Scanner(System.in);
    
 // atributos ecapsulado
    
    private String nome;
    private String elemento;
    private int ataque;
    private int defesa;
    private int level;
    private int chakra;
    
    //construtor

    public ninja(String nome, String elemento,  int level) {
        this.nome = scanner.nextLine();
        this.elemento = scanner.nextLine();
        this.level = scanner.nextInt();
        calculoatributos();
        calculobonus();
        imprimeninja();
    }

    //metodo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getelemento() {
        return elemento;
    }

    public void setTipo(String elemento) {
        this.elemento = elemento;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getchakra() {
        return chakra;
    }

    public void setVida(int chakra) {
        this.chakra = chakra;
    }
  
   public void imprimeninja(){     
       System.out.println("Nome: " + nome +" | " +
                                       "Elemento de Chakra: " + elemento + " | " +
                                       "Level: " +level + " | " +
                                       "Chakra: " + chakra + " | " +
                                       "Ataque: " + ataque + " | " +
                                       "Defesa: " + defesa + " | ");
    }
   public void calculoatributos(){
        switch(this.elemento){
            case  "katon":
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
            break;
            
        }
        
        }
           public void calculobonus(){
               chakra= chakra + level / 2;
               ataque= ataque + level / 3;
               defesa= defesa + level / 4;
           
           }
           

           
           
              
           
           

   }
   
