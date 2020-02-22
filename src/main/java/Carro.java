import java.util.*;

public class Carro {

    public Object Porta;
    private  double velocidade;

    private  int marcha;

    private  double velocidadeMaxima;

    private  List<Porta>  portaList ;
    
    public  Carro(int numero_portas)
    {
      portaList = new ArrayList<Porta>() ;
      for( int i= 1 ; i < numero_portas ; i++){
          Porta porta= new Porta();
          porta.SetTrava(false);
          porta.SetVidro(false);
         portaList.add(porta);
      }

    }

    public List<Carro.Porta> getPortaList() {
        return portaList;
    }

    public void SetPorta(int corrente_porta, boolean vidro, boolean trava)
   {
            portaList.get(corrente_porta).SetVidro(vidro);
            portaList.get(corrente_porta).SetTrava(trava);
   }

   public boolean GetPortaVidro(int corrente_porta)
   {
       if(portaList.isEmpty()) return  false;
       return portaList.get(corrente_porta).GetVidro();
   }

   public boolean GetPortaTrava(int corrente_porta)
   {
       if(portaList.isEmpty()) return  false;
        return portaList.get(corrente_porta).GetTrava();
   }

   public  void setVelocidadeMaxima(double velocidadeMaxima)
   {
        if(velocidadeMaxima > 0) {
            this.velocidadeMaxima = velocidadeMaxima;
        }
        else
        {
            this.velocidadeMaxima = 220;
        }
    }
    public  double getVelocidade()
    {
        return  this.velocidade;
    }
    public  double getVelocidadeMaxima()
    {
        return  this.velocidadeMaxima;
    }

    public  double acelerar(double velocidade)
    {
        if(this.velocidade + velocidade <= this.velocidadeMaxima) {
            this.velocidade += velocidade;
        }
        else
        {
            this.velocidade = velocidadeMaxima;
        }


        return  this.velocidade;
    }

    public int trocarMarcha()
    {

        if(velocidade == 0)
        {
            marcha = 0;
        }
        else if(velocidade > 0 && velocidade <= 30 )
        {
            marcha = 1;
        }
        else if(velocidade > 30 && velocidade <= 60)
        {
            marcha = 2;
        }
        else if(velocidade > 60 && velocidade <= 110)
        {
            marcha = 3;
        }

        else if(velocidade > 110 && velocidade <= 140) {
            marcha = 4;
        }
        else if( velocidade > 140)
        {
            marcha = 5;
        }

        return  marcha;
    }


    public void freiar()
    {
        if(this.velocidadeMaxima - 30 <= 0) {
            this.velocidade += 30;
        }

    }

    public class  Porta
    {
        private  boolean vidro;
        private  boolean trava;

        public  void  SetVidro(boolean vidro)
        {
            this.vidro = vidro;
        }

        public  void  SetTrava(boolean trava)
        {
            this.trava = vidro;
        }

        public boolean GetVidro() {return  this.vidro;}
        public boolean GetTrava(){return  this.trava;}
    }



}
