import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';

@NgModule({
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
    // Removed AppComponent and DashboardComponent from imports, as they are standalone and should not be imported here
  ],
  // Removed bootstrap: [AppComponent] as AppComponent is standalone and should be bootstrapped via bootstrapApplication
})
export class AppModule { }
