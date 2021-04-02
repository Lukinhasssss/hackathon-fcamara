import { Route, Switch } from "react-router";
import { BrowserRouter } from "react-router-dom";
import CadastrarPonto from "./pages/CadastrarPonto";
import Home from "./pages/Home";
import PontosDeColeta from "./pages/PontosDeColeta";

const Routes = () => (
  <BrowserRouter>
    <Switch>
      <Route path="/" exact>
        <Home />
      </Route>

      <Route path="/pontosdecoleta">
        <PontosDeColeta />
      </Route>

      <Route path="/cadastro">
        <CadastrarPonto />
      </Route>
    </Switch>
  </BrowserRouter>
)

export default Routes