import Routes from './Routes';
import './App.css'
import { ColetaContext } from './ColetaContext';
import { useState } from 'react';

const App = () => {
  const [cidade, setCidade] = useState('')

  return (
    <ColetaContext.Provider value={{ cidade, setCidade }} >
      <Routes />
    </ColetaContext.Provider>
  )
}

export default App;