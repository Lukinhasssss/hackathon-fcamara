import { ColetaContext } from './ColetaContext';
import { useState } from 'react';
import { ToastContainer } from 'react-toastify'
import 'react-toastify/dist/ReactToastify.css'

import Routes from './Routes';

import './App.css'

const App = () => {
  const [cidade, setCidade] = useState('')

  return (
    <ColetaContext.Provider value={{ cidade, setCidade }} >
      <>
      <Routes />
      <ToastContainer />
      </>
    </ColetaContext.Provider>
  )
}

export default App;