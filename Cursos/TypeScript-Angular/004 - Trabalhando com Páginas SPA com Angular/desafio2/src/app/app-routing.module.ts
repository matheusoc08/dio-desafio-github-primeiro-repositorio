import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AnimeFormComponent } from './anime-form/anime-form.component';
import { AnimeIndexComponent } from './anime-index/anime-index.component';
import { Error404Component } from './error404/error404.component';

const routes: Routes = [
  {
    path: '', component: AnimeIndexComponent
  },
  {
    path: 'config', component: AnimeFormComponent
  },
  {
    path: 'config/: id', component: AnimeFormComponent
  },
  {
    path: '**', component: Error404Component
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
