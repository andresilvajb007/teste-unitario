public class CarroMock {

    private  double velocidade;

    private double valor;

    private  int marcha;

    private  double velocidadeMaxima;


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
            this.velocidade -= 30;
        }

    }


}
