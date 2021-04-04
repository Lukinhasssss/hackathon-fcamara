import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { CadastrarEscolaComponent } from './cadastrar-escola/cadastrar-escola.component';
import { PontoColetaComponent } from './ponto-coleta/ponto-coleta.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CadastrarEscolaComponent,
    PontoColetaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
