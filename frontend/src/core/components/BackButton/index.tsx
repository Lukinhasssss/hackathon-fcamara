import { Link } from 'react-router-dom'
import { ReactComponent as BackIcon } from '../../assets/images/arrow-left.svg'
import './styles.css'

const BackButton = () => {
  return (
    <div>
      <Link to='/' className="back-button-content">
        <BackIcon />
        <span className="d-none">Voltar para a página inicial</span>
      </Link>
    </div>
  )
}

export default BackButton