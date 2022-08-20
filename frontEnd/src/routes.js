import { BrowserRouter, Routes, Route } from 'react-router-dom';

import Home from './pages/Home';
import Comprar from './pages/Comprar';
import Header from './components/Header';

function RoutesApp(){
  return(
    <BrowserRouter>
      <Header/>
      <Routes>
        <Route path="/" element={ <Home/> } />
        <Route path="/comprar" element={ <Comprar/> } />
      </Routes>
    </BrowserRouter>
  )
}

export default RoutesApp;