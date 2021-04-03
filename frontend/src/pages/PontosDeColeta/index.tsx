import { useState } from 'react'
import BackButton from '../../core/components/BackButton'
import Header from '../../core/components/Header'
import PontoDeColeta from '../../core/components/PontoDeColeta'
import { RespostaColeta } from '../../core/types/Coleta'
import { makeRequest } from '../../core/utils/request'
import './styles.css'

const PontosDeColeta = () => {
  const [respostaColeta, setRespostaColeta] = useState<RespostaColeta>()

  makeRequest({ url: '/pontosdecoleta', method: 'GET' })
    .then(resposta => setRespostaColeta(resposta.data))

  return (
    <>
      <Header>
        <BackButton />
      </Header>

      <div className="coleta-container">
        <div className="escolas-encontradas">
          <span>{ respostaColeta?.totalElements }</span>
          <p>escolas encontradas</p>
        </div>

        <div className="ponto-de-coleta">
          { respostaColeta?.content.map(coleta => (
            <PontoDeColeta key={ coleta.id } coleta={ coleta } />
          )) }
        </div>
      </div>
    </>
  )
}

export default PontosDeColeta