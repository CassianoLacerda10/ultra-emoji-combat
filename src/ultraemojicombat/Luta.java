package ultraemojicombat;

import java.util.Random;


public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;
    
    //Metodos Publicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("Luta marcada entre " + this.desafiado.getNome() + " e " + this.desafiante.getNome() + "!");
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
        
    }
    public void Lutar(){
        if (this.getAprovada() == true){
            System.out.println("### DESAFIADO ###");
            this.desafiado.Apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.Apresentar();
            
            System.out.println("");
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch (vencedor){
                case 0:
                    System.out.println("Empatou");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                    
                case 1:
                    System.out.println(this.desafiado.getNome() + " venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                case 2:
                    System.out.println(this.desafiante.getNome() + " venceu!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
        
    }
    
    //Metodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}
