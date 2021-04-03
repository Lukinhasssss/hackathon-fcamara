import { Coleta } from '../../types/Coleta'
import './styles.css'

type Props = {
  coleta: Coleta
}

const PontoDeColeta = ({ coleta }:Props) => {
  return (
    <div className="ponto-de-coleta-container">
      <div className="ponto-de-coleta-img-container">
        <img src={ coleta.imgUrl } alt={ coleta.nome } />
      </div>

      <h2>{ coleta.nome }</h2>
      
      <p>{ coleta.cidade }, { coleta.estado }</p>
      <p>{ coleta.logradouro }, { coleta.bairro }</p>
      <p>Nº { coleta.numero }</p>
    </div>
  )
}

export default PontoDeColeta