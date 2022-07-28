import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AnimeHomeComponent } from './anime-home/anime-home.component';

const routes: Routes = [
  {
    path: '', redirectTo: 'week-list', pathMatch: 'full'
  },
  {
    path: 'week-list', component: AnimeHomeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
