import './header.css';
import { Link } from 'react-router-dom'

function Header(){
  return(
    <header>
      <Link className="logo" to="/">Livraria Foco em Saúde </Link>
    </header>
  )
}

export default Header;