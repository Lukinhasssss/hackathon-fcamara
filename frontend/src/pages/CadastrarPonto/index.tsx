import { useForm } from 'react-hook-form'
import { useHistory } from 'react-router'
import { toast } from 'react-toastify';

import Header from '../../core/components/Header'
import BackButton from '../../core/components/BackButton'
import { makeRequest } from '../../core/utils/request'

import './styles.css'

type FormData = {
  nome: string
  imgUrl: string
  logradouro: string
  numero: string
  bairro: string
  cidade: string
  estado: string
}

const CadastrarPonto = () => {
  const { handleSubmit, register } = useForm<FormData>()
  const history = useHistory()

  const onSubmit = (data: FormData) => {
    makeRequest({
      url: '/pontosdecoleta',
      method: 'POST',
      data: data
    }).then(() => {
      toast.info('Ponto cadastrado com sucesso')
      history.push('/')
    })
  }

  return (
    <>
      <Header>
        <BackButton />
      </Header>

      <form onSubmit={ handleSubmit(onSubmit) } className="cadastro-container">
        <div className="cadastro-content">
          <h1>Cadastre aqui o ponto de coleta</h1>

          <h2>Dados do local</h2>

          <span>Nome do local</span>
          <input
            {...register("nome")}
            type="text"
            className="coleta-w100"
          />

          <span>URL da imagem</span>
          <input
            {...register("imgUrl")}
            type="text"
            className="coleta-w100"
          />

          <div className="coleta-column-2">
            <div>
              <span>Logradouro</span>
              <input
                {...register("logradouro")}
                type="text"
                className="coleta-w100"
              />
            </div>

            <div className="coleta-column-number">
              <span>Número</span>
              <input
                {...register("numero")}
                type="number"
                className="coleta-w100"
              />
            </div>
          </div>

          <span>Bairro</span>
          <input
            {...register("bairro")}
            type="text"
            className="coleta-w100"
          />

          <div className="coleta-column-2">
            <div>
              <span>Cidade</span>
              <input
                {...register("cidade")}
                type="text"
                className="coleta-w100"
              />
            </div>

            <div className="coleta-column-estado">
              <span>Estado</span>
              <input
                {...register("estado")}
                type="text"
                className="coleta-w100"
              />
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