import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(CarroMock.class)


public class CarroMockTest {

    private  double  velocidadeMaxima;
    private  double  velocidade;
    private  double  velocidadeFreio;


    @Before
    public void prepareTests(){
        velocidadeMaxima = 240;
        velocidade = 100;
        velocidadeFreio = 30;
    }

    @Test
    public void testAcelerarValorMenorQueMaximo() throws Exception {

        //arrange
        CarroMock contaMock =  new CarroMock();
        final String METHOD="getVelocidade";

        CarroMock spy = PowerMockito.spy(contaMock);

        PowerMockito.when(spy, METHOD)
                .thenReturn( (Double) 2000.00);

        double expect = 100;
        double actual = 0;

        //act
        actual = spy.acelerar(velocidade);

        //assert
        Assert.assertEquals(expect, actual, 0);

        PowerMockito.verifyPrivate(spy, Mockito
                .times(1))
                .invoke("getVelocidade");

    }

    @Test
    public void testFreio() throws Exception {

        //arrange
        CarroMock contaMock =  new CarroMock();
        final String METHOD="getVelocidade";

        CarroMock spy = PowerMockito.spy(contaMock);
        PowerMockito.when(spy, METHOD)
                .thenReturn( (Double) 2000.00);

        double expect = 30;

        spy.setVelocidadeMaxima(velocidadeFreio);
        spy.freiar();
        //act
        double actual = spy.getVelocidade();

        //assert
        Assert.assertEquals(expect, actual, 0);

        PowerMockito.verifyPrivate(spy, Mockito
                .times(1))
                .invoke("getVelocidade");

    }

}
