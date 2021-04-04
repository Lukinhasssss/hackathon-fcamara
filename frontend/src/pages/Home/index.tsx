import { Link } from "react-router-dom"
import { useContext } from "react";

import Header from "../../core/components/Header"
import { ColetaContext } from "../../ColetaContext";

import { ReactComponent as BookIcon } from '../../core/assets/images/book.svg';
import { ReactComponent as SearchIcon } from '../../core/assets/images/search.svg';
import { ReactComponent as MainImage } from '../../core/assets/images/main.svg';
import './styles.css'

const Home = () => {
  const { cidade, setCidade } = useContext(ColetaContext)

  const handleOnChangeCidadeDigitada = (event: any) => {
    setCidade(event.target.value)
  }

  return (
    <>
      <Header>
        <Link to='/cadastro' className="ir-para-doacao">
          <BookIcon />
          <span>Cadastrar ponto de doação</span>
        </Link>
      </Header>

      <div className="home-container">
        <div className="home-content-left">
          <div className="center-content">
            <h1 className="home-title">
              Colabore na educação <br /> de uma criança
            </h1>
          </div>

          <div className="center-content">
            <p className="home-description">
              Esta é uma Campanha para ajudar crianças que não tem condições <br /> de comprar seus materias escolares.
              <br />Você pode colaborar com materiais novos ou usados levando nos <br /> pontos de coleta.
            </p>
          </div>

          <div className="input-container">
            <span className="home-input-text">Digite a cidade</span>
            <input
              type="text"
              value={ cidade }
              onChange={ handleOnChangeCidadeDigitada }
              className="home-input"
            />
          </div>

          <div className="center-content">
            <Link to={ `/pontosdecoleta` } className="home-button"  onClick={ () => setCidade(cidade) }>
              <SearchIcon />
              <p>Localizar pontos</p>
            </Link>
          </div>

          <div className="show-on-mobile">
            <p>OU</p>
            <Link to='/pontosdecoleta' className="cadastrar-doacao">
              <BookIcon />
              <span>Cadastre um ponto de doação</span>
            </Link>
          </div>
        </div>

        <div className="home-content-right">
          <MainImage className="home-content-img" />
        </div>
      </div>
    </>
  )
}

export default Home