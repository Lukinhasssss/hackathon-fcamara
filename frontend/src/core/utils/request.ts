import axios, { AxiosRequestConfig } from 'axios';

const BASE_URL = "http://localhost:8080"

export const makeRequest = (params: AxiosRequestConfig) => {
  return axios({
    ...params,
    baseURL: BASE_URL
  })
}

// type RequestParams = {
//   method?: Method
//   url: string
//   data?: object
//   params?: object
// }

// export const makeRequest = ({ method = 'GET', url, data, params }:RequestParams) => {
//   return axios({
//     method,
//     url: `${BASE_URL}${url}`,
//     data,
//     params
//   })
// }