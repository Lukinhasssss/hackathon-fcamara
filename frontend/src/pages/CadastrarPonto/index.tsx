import BackButton from '../../core/components/BackButton'
import Header from '../../core/components/Header'
import './styles.css'

const CadastrarPonto = () => {
  return (
    <>
      <Header>
        <BackButton />
      </Header>

      <form className="cadastro-container">
        <div className="cadastro-content">
          <h1>Cadastre aqui o ponto de coleta</h1>

          <h2>Dados do local</h2>

          <span>Nome do local</span>
          <input type="text" className="coleta-w100" />

          <span>URL da imagem</span>
          <input type="text" className="coleta-w100" />

          <div className="coleta-column-2">
            <div>
              <span>Logradouro</span>
              <input type="text" className="coleta-w100" />
            </div>

            <div className="coleta-column-number">
              <span>Número</span>
              <input type="text" className="coleta-w100" />
            </div>
          </div>

          <span>Bairro</span>
          <input type="text" className="coleta-w100" />

          <div className="coleta-column-2">
            <div>
              <span>Cidade</span>
              <input type="text" className="coleta-w100" />
            </div>

            <div className="coleta-column-estado">
              <span>Estado</span>
              <input type="text" className="coleta-w100" />
            </div>
          </div>

          <div className="submit-button">
            <button>
              <p>Cadastrar ponto de coleta</p>
            </button>
          </div>
        </div>
      </form>
    </>
  )
}

export default CadastrarPonto