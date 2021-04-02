import { Link } from "react-router-dom"

import Header from "../../core/components/Header"
import { ReactComponent as BookIcon } from '../../core/assets/images/book.svg';
import './styles.css'

const Home = () => {
  return (
    <Header>
      <Link to='/cadastro' className="ir-para-doacao">
        <BookIcon />
        <span>Cadastrar ponto de doação</span>
      </Link>
    </Header>
  )
}

export default Home