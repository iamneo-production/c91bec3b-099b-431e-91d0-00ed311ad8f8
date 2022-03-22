import React from 'react';
import App from './App';
import ReactDOM from 'react-dom';
import {BrowserRouter}from 'react-router-dom';
const routing=(
  <BrowserRouter>
  <App />
  </BrowserRouter>
)
ReactDOM.render(routing,document.getElementById('root'))
