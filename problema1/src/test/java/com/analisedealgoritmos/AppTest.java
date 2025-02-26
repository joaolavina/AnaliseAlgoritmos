package com.analisedealgoritmos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    ProcessamentoPedido processamento;
    Pedido pedido;

    @Before
    public void Init() {
        processamento = new ProcessamentoPedido();
        pedido = new Pedido();
    }

    @Test
    public void Teste1() {
        pedido.addProduto(new Produto("livro1", 50, 400));
        Map<String, Double> valoresEntrega = processamento.processarPedido(pedido);

        Object[] valores = valoresEntrega.values().toArray();

        assertEquals(valores[0], 10.0);
        assertEquals(valores[1], 12.5);
        assertEquals(valores[2], 0.0);

    }

    @Test
    public void Teste2() {
        pedido.addProduto(new Produto("livro2", 45, 740));
        Map<String, Double> valoresEntrega = processamento.processarPedido(pedido);

        Object[] valores = valoresEntrega.values().toArray();

        assertEquals(valores[0], 10.0);
        assertEquals(valores[1], 20.0);
        assertEquals(valores[2], 0.0);

    }
    
    @Test
    public void Teste3() {
        pedido.addProduto(new Produto("livro3", 20, 5500));
        Map<String, Double> valoresEntrega = processamento.processarPedido(pedido);

        Object[] valores = valoresEntrega.values().toArray();

        assertEquals(valores[0], 99.0);
        assertEquals(valores[1], 0.0);
    }
    
    @Test
    public void Teste4() {
        pedido.addProduto(new Produto("livro4", 20, 5000));
        Map<String, Double> valoresEntrega = processamento.processarPedido(pedido);

        Object[] valores = valoresEntrega.values().toArray();

        assertEquals(valores[0], 30.0);
        assertEquals(valores[1], 91.5);
        assertEquals(valores[2], 0.0);

    }

    @Test
    public void Teste5() {
        pedido.addProduto(new Produto("livro5", 20, 1200));
        Map<String, Double> valoresEntrega = processamento.processarPedido(pedido);

        Object[] valores = valoresEntrega.values().toArray();

        assertEquals(valores[0], 15.0);
        assertEquals(valores[1], 45.0);
        assertEquals(valores[2], 0.0);

    }

    @Test
    public void Teste6() {
        pedido.addProduto(new Produto("livro5", 20, 550));
        pedido.addProduto(new Produto("livro5", 20, 650));
        Map<String, Double> valoresEntrega = processamento.processarPedido(pedido);

        Object[] valores = valoresEntrega.values().toArray();

        assertEquals(valores[0], 15.0);
        assertEquals(valores[1], 45.0);
        assertEquals(valores[2], 0.0);

    }

    @Test
    public void Teste7() {
        pedido.addProduto(new Produto("livro5", 20, 2000));
        pedido.addProduto(new Produto("livro5", 20, 500));
        Map<String, Double> valoresEntrega = processamento.processarPedido(pedido);

        Object[] valores = valoresEntrega.values().toArray();

        assertEquals(valores[0], 20.0);
        assertEquals(valores[1], 54.0);
        assertEquals(valores[2], 0.0);

    }
}
