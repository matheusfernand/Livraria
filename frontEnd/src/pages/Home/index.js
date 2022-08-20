import './home.css';
import {Link} from 'react-router-dom';
import axios from "axios";
import { useState } from 'react';

function Home(){
  
  const [livros, setlivros] = useState([]);

  const listaLivrosAxios = axios.get('http://localhost:8085/livros/lista/todos').then(resp => {
    setlivros(resp.data);
});

    return(
      <div className="container">
      <h1>GALERIA DE LIVROS</h1>
      <main>
        {livros.map((item)=>{
          return(
          <div className="card">
              <h3>Título: {item.titulo} </h3>
              <p>Autor: {item.autor}</p>
              <p>Editora: {item.editora}</p>
              <p>Ano de publicação: {item.anoDePublicacao}</p>
              <p>Preço:<strong>R$ {item.preco}</strong></p>
             <div className='areaimagem'>
             <img src={`${process.env.PUBLIC_URL}${item.imagem}`}/>
              </div> 
              <Link to="/comprar" class='btn'>Comprar</Link>
          </div>
          )
        })}
              
      </main>
      <footer>
        <p><span class="bold"> Livraria Foco em Saúde</span> &copy; 2022</p>
        <p><span class='bold'>Criado por Katymilla Girotto</span> &copy; 2022</p>
      </footer>
    </div>
  )
}

export default Home;