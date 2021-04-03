import { Link } from "react-router-dom"

import Header from "../../core/components/Header"
import { ReactComponent as BookIcon } from '../../core/assets/images/book.svg';
import { ReactComponent as MainImage } from '../../core/assets/images/main.svg';
import './styles.css'



const Home = () => {
  return (
    <>
      <Header>
        <Link to='/cadastro' className="ir-para-doacao">
          <BookIcon />
          <span>Cadastrar ponto de doação</span>
        </Link>
      </Header>

      <div className="home-container">
        <div className="home-left">
         <h1> Colabore na educação de uma criança </h1>
         <p>
         Esta é uma Campanha para ajudar crianças que não tem condições de comprar seus materias escolares. 
Você pode colaborar com materiais novos ou usados levando nos pontos de coleta. Saiba mais sobre a campanha
         </p>
      
        </div>

        <div className="home-right">
        <MainImage />
      </div>
      </div>
    </>
  )
}

export default Home