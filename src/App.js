import React from 'react';
import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter as Router, Route } from "react-router-dom";
import TicketingManager from './pages/TicketingManager'
import TicketingResident from './pages/TicketingResident'

function App() {
  return (
  <Router basename={'/'}>
      <Route exact path='/' render={() =>
        <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <p>
            Edit <code>src/App.js</code> and save to reload.
          </p>
          <a
            className="App-link"
            href="https://reactjs.org"
            target="_blank"
            rel="noopener noreferrer"
          >
            Learn React
          </a>
        </header>
        </div>
      }/>
      <Route exact path='/TicketingResident' render={() =>
        <TicketingResident/>
      }/>
      <Route exact path='/TicketingManager' render={() =>
        <TicketingManager/>
      }/>
    </Router>
  );
}

export default App;