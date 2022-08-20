import './compra.css';
import { useState } from 'react';
import axios from "axios";

function Pedidos() {
  
  const [cpf, setCpf] = useState([]);
  const [enderecoCompleto, setEndereco] = useState([]);
  const [formaDePagamento, setFormaPgto] = useState([]);
  const [nomeCompleto, setNome] = useState([]);
  const [quantidadeDeExemplares, setQuantidadeExemplares] = useState([]);

  async function novoPedido(e) {
    e.preventDefault();

    const data = {
      cpf,
      enderecoCompleto,
      formaDePagamento,
      nomeCompleto,
      quantidadeDeExemplares
  };
    
    try {

        axios.post('http://localhost:8085/pedidos',
            data);
        alert("Pedido realizado!");
    } catch (err) {
        alert('Não foi possivel cadastrar a compra' + err)
    }
};

  return (
    <div className='container'>
      <h1>BEM VINDO À PAGINA DE COMPRAS</h1>
      <form onSubmit={novoPedido}>
        <label>Nome Completo:</label>
        <input type="text" value={nomeCompleto} onChange={e => setNome(e.target.value)}/> <br/>
        <label>CPF:</label>
        <input type="text" value={cpf} onChange={e => setCpf(e.target.value)}/> <br/>
        <label>Endereço Completo:</label>
        <input type="text" value={enderecoCompleto} onChange={e => setEndereco(e.target.value)}/> <br/>
        <label>Quantidade de exemplares:</label>
        <input type="text" value={quantidadeDeExemplares} onChange={e => setQuantidadeExemplares(e.target.value)}/> <br/>
        <label>Formas de Pagamento:</label>
        <select onChange={(e)=> setFormaPgto(e.target.value)}>
          <option value="CARTAO_DE_CREDITO">Cartão de Crédito</option>
          <option value="CARTAO_DE_DEBITO">Cartão de Débito</option>
          <option value="BOLETO_BANCARIO">Boleto Bancário</option>
        </select>
        <button href="/compraEfetuada" class="btn"type="submit">Compra Efetuada</button>
        
      </form>
    </div>
  )
}

export default Pedidos;