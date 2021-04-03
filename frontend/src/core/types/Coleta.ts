export type RespostaColeta = {
  content: Coleta[]
  totalElements: number
}

export type Coleta = {
  id: number
  nome: string
  imgUrl: string
  logradouro: string
  numero: string
  bairro: string
  complemento: string
  cep: string
  cidade: string
  estado: string
}