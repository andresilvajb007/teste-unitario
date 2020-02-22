import org.junit.Assert;
import org.junit.Test;

public class CarroTest {

    @Test
    public void testAcelerarValorMenorQueMaximo(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(220);
        double actual;
        double expect = 200;

        //act
        actual = carro.acelerar(200);

        //assert
        Assert.assertEquals(expect,actual, 0);
    }

    @Test
    public void testAcelerarValorMaiorQueMaximo(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(220);
        double actual;
        double expect = 220;

        //act
        actual = carro.acelerar(240);

        //assert
        Assert.assertEquals(expect,actual, 0);
    }

    @Test
    public void testAcelerarValorIgualQueMaximo(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(220);
        double actual;
        double expect = 220;

        //act
        actual = carro.acelerar(220);

        //assert
        Assert.assertEquals(expect,actual, 0);
    }


    @Test
    public void testVelocidadeMaximaMaiorQueZero(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(180);

        double actual;
        double expect = 180;

        //act
        actual = carro.getVelocidadeMaxima();

        //assert
        Assert.assertEquals(expect,actual, 0);
    }

    @Test
    public void testVelocidadeMaximaIgualAZero(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(0);

        double actual;
        double expect = 220;

        //act
        actual = carro.getVelocidadeMaxima();

        //assert
        Assert.assertEquals(expect,actual, 0);
    }

    @Test
    public void testVelocidadeMaximaMenorQueZero(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(-100);

        double actual;
        double expect = 220;

        //act
        actual = carro.getVelocidadeMaxima();

        //assert
        Assert.assertEquals(expect,actual, 0);
    }



    @Test
    public void testTrocarDeMarchaVelocidadeMenorQueZero(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(220);
        carro.acelerar(-10);


        int actual;
        int expect = 0;

        //act
        actual = carro.trocarMarcha();

        //assert
        Assert.assertEquals(expect,actual, 0);
    }

    @Test
    public void testTrocarDeMarchaVelocidadeZero(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(220);
        carro.acelerar(0);


        int actual;
        int expect = 0;

        //act
        actual = carro.trocarMarcha();

        //assert
        Assert.assertEquals(expect,actual, 0);
    }
    @Test
    public void testTrocarDeMarchaVelocidadeDez(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(220);
        carro.acelerar(10);


        int actual;
        int expect = 1;

        //act
        actual = carro.trocarMarcha();

        //assert
        Assert.assertEquals(expect,actual, 0);
    }

    @Test
    public void testTrocarDeMarchaVelocidadeTrinta(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(220);
        carro.acelerar(30);


        int actual;
        int expect = 1;

        //act
        actual = carro.trocarMarcha();

        //assert
        Assert.assertEquals(expect,actual, 0);
    }


    @Test
    public void testTrocarDeMarchaVelocidadeQuarenta(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(220);
        carro.acelerar(40);


        int actual;
        int expect = 2;

        //act
        actual = carro.trocarMarcha();

        //assert
        Assert.assertEquals(expect,actual, 0);
    }

    @Test
    public void testTrocarDeMarchaVelocidadeSessenta(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(220);
        carro.acelerar(60);


        int actual;
        int expect = 2;

        //act
        actual = carro.trocarMarcha();

        //assert
        Assert.assertEquals(expect,actual, 0);
    }

    @Test
    public void testTrocarDeMarchaVelocidadeSetenta(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(220);
        carro.acelerar(70);


        int actual;
        int expect = 3;

        //act
        actual = carro.trocarMarcha();

        //assert
        Assert.assertEquals(expect,actual, 0);
    }

    @Test
    public void testTrocarDeMarchaVelocidadeCentoEDez(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(220);
        carro.acelerar(110);


        int actual;
        int expect = 3;

        //act
        actual = carro.trocarMarcha();

        //assert
        Assert.assertEquals(expect,actual, 0);
    }


    @Test
    public void testTrocarDeMarchaVelocidadeCentoEVinte(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(220);
        carro.acelerar(120);


        int actual;
        int expect = 4;

        //act
        actual = carro.trocarMarcha();

        //assert
        Assert.assertEquals(expect,actual, 0);
    }

    @Test
    public void testTrocarDeMarchaVelocidadeCentoEQuarenta(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(220);
        carro.acelerar(140);


        int actual;
        int expect = 4;

        //act
        actual = carro.trocarMarcha();

        //assert
        Assert.assertEquals(expect,actual, 0);
    }


    @Test
    public void testTrocarDeMarchaVelocidadeCentoECinquenta(){
        //arrange
        Carro carro = new Carro();
        carro.setVelocidadeMaxima(220);
        carro.acelerar(150);


        int actual;
        int expect = 5;

        //act
        actual = carro.trocarMarcha();

        //assert
        Assert.assertEquals(expect,actual, 0);
    }



}
