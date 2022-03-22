import React from 'react';
import './App.css';
import {Link} from 'react-router-dom';
function App(){
  return(
    <div id='signupBox'>
    <form id='submain'>
      <h1 id='heading'>SIGN UP</h1>
      <input id="email"type='Email' placeholder='Enter Email'required></input><br></br>
      <input id="password"type='password' placeholder='Enter Password'Size="8-13"required></input><br></br>
      <input id="mobilenumber"type='text' placeholder='Enter Mobile Number'
        pattern="[0-9]{10}" required></input><br></br>
      <select id="userrole" >
        <option>User</option>
        <option>Admin</option>
      </select><br></br>
      <input id='username'type='text' placeholder='Enter Username'required></input><br></br>
      <input id='age'type='number' placeholder='Enter Age'required></input><br></br>
      <input id='submitButton'type='Submit'></input>
      <p id='link'>Go to Login<Link id="loginLink"to='/login'>Click Here</Link></p>
    </form> 
  </div>
  )
}
export default App;