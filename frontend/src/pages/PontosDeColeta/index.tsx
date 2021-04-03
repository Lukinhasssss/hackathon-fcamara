import BackButton from '../../core/components/BackButton'
import Header from '../../core/components/Header'
import PontoDeColeta from '../../core/components/PontoDeColeta'
import './styles.css'

const PontosDeColeta = () => {
  return (
    <>
      <Header>
        <BackButton />
      </Header>

      <div className="coleta-container">
        <div className="escolas-encontradas">
          <span>3</span>
          <p>escolas encontradas</p>
        </div>

        <div className="ponto-de-coleta">
          <PontoDeColeta />
          <PontoDeColeta />
          <PontoDeColeta />
        </div>
      </div>
    </>
  )
}

export default PontosDeColeta