package edu.rodrigo.exercicio1.mensagem;

public class Mensagem {

   public void verificar(int horario){
       if(horario >= 5 && horario <= 12){
           dia();
       }
       else{
           if(horario >= 13 && horario <= 18){
               tarde();
           }
           else{
               if((horario >= 1 && horario < 5) || (horario >=19 && horario <= 24)){
                   noite();
               }
               else{
                   invalido();
               }
           }
       }
   }

   public void invalido(){
       System.out.println("Horário Inválido!!");
   }

    public void dia(){
        System.out.println("Bom dia!");
    }

    public void tarde(){
        System.out.println("Boa tarde!");
    }

    public void noite(){
        System.out.println("Boa noite!");
    }
}
