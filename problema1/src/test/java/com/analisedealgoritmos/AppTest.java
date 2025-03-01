package com.analisedealgoritmos;

import javax.management.InstanceNotFoundException;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.analisedealgoritmos.model.Pedido;
import com.analisedealgoritmos.model.Produto;
import com.analisedealgoritmos.model.entrega.EncomendaPAC;
import com.analisedealgoritmos.model.entrega.RetiradaLocal;
import com.analisedealgoritmos.model.entrega.Sedex;

/**
 * Unit test for simple App.
 */
public class AppTest {


    @Test
    public void CalcularEntrega_EncomendaPAC_1ProdutoMenosDe1kg() throws InstanceNotFoundException {
        Produto produto1 = new Produto("livro1", 50, 400);
        Pedido pedido = new Pedido();
        pedido.incluirItem(produto1, 1);
        pedido.setTipoEntrega(new EncomendaPAC());

        double valorEntrega = pedido.calcularEntrega();

        assertEquals(10.0, valorEntrega, 0.0);
    }

    @Test
    public void CalcularEntrega_EncomendaPAC_2ProdutoMenorDe2kg() throws InstanceNotFoundException {
        Produto produto1 = new Produto("livro1", 20, 600);
        Pedido pedido = new Pedido();
        pedido.incluirItem(produto1, 2);
        pedido.setTipoEntrega(new EncomendaPAC());

        double valorEntrega = pedido.calcularEntrega();

        assertEquals(15.0, valorEntrega, 0.0);
    }

    @Test
    public void CalcularEntrega_EncomendaPAC_2ProdutosMenosDe2kg() throws InstanceNotFoundException {
        Produto produto1 = new Produto("livro1", 50, 550);
        Produto produto2 = new Produto("livro2", 50, 650);

        Pedido pedido = new Pedido();
        pedido.incluirItem(produto1, 1);
        pedido.incluirItem(produto2, 1);
        pedido.setTipoEntrega(new EncomendaPAC());

        double valorEntrega = pedido.calcularEntrega();

        assertEquals(15.0, valorEntrega, 0.0);
    }

    @Test
    public void CalcularEntrega_EncomendaPAC_2ProdutosMenosDe3kg() throws InstanceNotFoundException {
        Produto produto1 = new Produto("livro1", 50, 2000);
        Produto produto2 = new Produto("livro1", 50, 500);
        
        Pedido pedido = new Pedido();
        pedido.incluirItem(produto1, 1);
        pedido.incluirItem(produto2, 1);
        pedido.setTipoEntrega(new EncomendaPAC());

        double valorEntrega = pedido.calcularEntrega();

        assertEquals(20.0, valorEntrega, 0.0);
    }

    @Test
    public void CalcularEntrega_EncomendaPAC_1ProdutoIgualA5kg() throws InstanceNotFoundException {
        Produto produto1 = new Produto("livro1", 20, 5000);
        Pedido pedido = new Pedido();
        pedido.incluirItem(produto1, 1);
        pedido.setTipoEntrega(new EncomendaPAC());

        double valorEntrega = pedido.calcularEntrega();

        assertEquals(30.0, valorEntrega, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalcularEntrega_EncomendaPAC_1ProdutoMaisDe5kg() throws InstanceNotFoundException, IllegalArgumentException {
        Produto produto1 = new Produto("livro1", 20, 5500);
        Pedido pedido = new Pedido();
        pedido.incluirItem(produto1, 1);
        pedido.setTipoEntrega(new EncomendaPAC());

        double valorEntrega = pedido.calcularEntrega();
    }

    @Test
    public void CalcularEntrega_Sedex_1ProdutoMenosDe400g() throws InstanceNotFoundException {
        Produto produto1 = new Produto("livro1", 50, 400);
        Pedido pedido = new Pedido();
        pedido.incluirItem(produto1, 1);
        pedido.setTipoEntrega(new Sedex());

        double valorEntrega = pedido.calcularEntrega();

        assertEquals(12.5, valorEntrega, 0.0);
    }

    @Test
    public void CalcularEntrega_Sedex_1ProdutoMenosDe750g() throws InstanceNotFoundException {
        Produto produto1 = new Produto("livro1", 45, 740);
        Pedido pedido = new Pedido();
        pedido.incluirItem(produto1, 1);
        pedido.setTipoEntrega(new Sedex());

        double valorEntrega = pedido.calcularEntrega();

        assertEquals(20.0, valorEntrega, 0.0);
    }

    @Test
    public void CalcularEntrega_Sedex_1ProdutoMenosDe1200g() throws InstanceNotFoundException {
        Produto produto1 = new Produto("livro1", 45, 1000);
        Pedido pedido = new Pedido();
        pedido.incluirItem(produto1, 1);
        pedido.setTipoEntrega(new Sedex());

        double valorEntrega = pedido.calcularEntrega();

        assertEquals(30.0, valorEntrega, 0.0);
    }

    @Test
    public void CalcularEntrega_Sedex_1ProdutoMenorDe2kg() throws InstanceNotFoundException {
        Produto produto1 = new Produto("livro1", 20, 1200);
        Pedido pedido = new Pedido();
        pedido.incluirItem(produto1, 1);
        pedido.setTipoEntrega(new Sedex());

        double valorEntrega = pedido.calcularEntrega();

        assertEquals(45.0, valorEntrega, 0.0);
    }
    
    @Test
    public void CalcularEntrega_Sedex_2ProdutosMenosDe2kg() throws InstanceNotFoundException {
        Produto produto1 = new Produto("livro1", 50, 550);
        Produto produto2 = new Produto("livro2", 50, 650);

        Pedido pedido = new Pedido();
        pedido.incluirItem(produto1, 1);
        pedido.incluirItem(produto2, 1);
        pedido.setTipoEntrega(new Sedex());

        double valorEntrega = pedido.calcularEntrega();

        assertEquals(45.0, valorEntrega, 0.0);
    }

    @Test
    public void CalcularEntrega_Sedex_1ProdutoMaisDe2kg() throws InstanceNotFoundException {
        Produto produto1 = new Produto("livro1", 20, 5500);
        Pedido pedido = new Pedido();
        pedido.incluirItem(produto1, 1);
        pedido.setTipoEntrega(new Sedex());

        double valorEntrega = pedido.calcularEntrega();

        assertEquals(99.0, valorEntrega, 0.0);
    }

    @Test
    public void CalcularEntrega_Sedex_2ProdutosMaisDe5kg() throws InstanceNotFoundException {
        Produto produto1 = new Produto("livro1", 50, 2000);

        Pedido pedido = new Pedido();
        pedido.incluirItem(produto1, 2);
        pedido.setTipoEntrega(new Sedex());

        double valorEntrega = pedido.calcularEntrega();

        assertEquals(76.5, valorEntrega, 0.0);
    }

    @Test
    public void CalcularEntrega_RetiradaLocal_1Produto() throws InstanceNotFoundException {
        Produto produto1 = new Produto("livro1", 50, 400);
        Pedido pedido = new Pedido();
        pedido.incluirItem(produto1, 1);
        pedido.setTipoEntrega(new RetiradaLocal());

        double valorEntrega = pedido.calcularEntrega();

        assertEquals(0.0, valorEntrega, 0.0);
    }

    @Test
    public void CalcularEntrega_RetiradaLocal_3Produtos() throws InstanceNotFoundException {
        Produto produto1 = new Produto("livro1", 50, 400);
        Produto produto2 = new Produto("livro2", 50, 450);

        Pedido pedido = new Pedido();
        pedido.incluirItem(produto1, 1);
        pedido.incluirItem(produto2, 2);
        pedido.setTipoEntrega(new RetiradaLocal());

        double valorEntrega = pedido.calcularEntrega();

        assertEquals(0.0, valorEntrega, 0.0);
    }
}
