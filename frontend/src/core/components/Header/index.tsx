import { Link } from 'react-router-dom'
import { ReactComponent as Logo } from '../../assets/images/logo.svg'
import './styles.css'

type Props = {
  children: React.ReactNode
}

const Header = ({ children }: Props) => {
  return (
    <div className="header-container">
      <Link to='/'>
        <Logo />
      </Link>

      { children }
    </div>
  )
}

export default Header