package test;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import src.Cliente;
import src.ContaCorrente;
import src.Servico;

import static org.junit.Assert.*;

/**
 *
 * @author jtietjen
 */
public class ContaCorrenteTest {

    public ContaCorrenteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setSaldo method, of class ContaCorrente.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");

        Cliente cliente = new Cliente();
        cliente.setNome("teste");
        cliente.setTelCelular("54545");
        cliente.setTelFixo("54545");
        ContaCorrente co = new ContaCorrente(cliente, 3146, 999, 1500, 1000);
        co.sacar(1000);

        assertEquals(co.getSaldo(), 500);
    }

    @Test
    public void testDepositar() {
        System.out.println("Depositar");

        Cliente cliente = new Cliente();
        cliente.setNome("teste");
        cliente.setTelCelular("54545");
        cliente.setTelFixo("54545");
        ContaCorrente co = new ContaCorrente(cliente, 3146, 999, 1500, 1000);
        co.depositar(1000);

        assertEquals(co.getSaldo(), 2500);
    }

    @Test
    public void testTransferir() {

        Cliente cliente = new Cliente();
        cliente.setNome("teste");
        cliente.setTelCelular("54545");
        cliente.setTelFixo("54545");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("teste2");
        cliente2.setTelCelular("545");
        cliente2.setTelFixo("55");

        ContaCorrente conta1 = new ContaCorrente(cliente, 3146, 999, 300, 1000);
        ContaCorrente conta2 = new ContaCorrente(cliente2, 1111, 22222, 300, 1000);
        conta1.transferir(250, conta2);

        assertEquals(conta1.getSaldo(), 50);
        assertEquals(conta2.getSaldo(), 550);
    }

    @Test
    public void testServicosNovos() {
        Cliente cliente = new Cliente();
        cliente.setNome("teste");
        cliente.setTelCelular("54545");
        cliente.setTelFixo("54545");
        
        ContaCorrente conta1 = new ContaCorrente(cliente, 3146, 999, 300, 1000);
        
        Servico servico = new Servico(conta1, "Serviço em teste");
        conta1.adicionarServico(servico);

    }

}
