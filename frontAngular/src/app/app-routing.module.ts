import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastrarEscolaComponent } from './cadastrar-escola/cadastrar-escola.component';
import { HomeComponent } from './home/home.component';
import { PontoColetaComponent } from './ponto-coleta/ponto-coleta.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'cadastrar-escola', component: CadastrarEscolaComponent },
  { path: 'ponto-coleta', component: PontoColetaComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
