import React,{useState} from "react";
import {NavLink , useNavigate} from "react-router-dom";
import axios from "axios";

import './Admin.css';
function Admin (){

    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [emailError, setEmailError] = useState('');
    const [passwordError, setPasswordError] = useState('');
    const [data,setData] = useState({
      username : '',
      password : ''
    });
    
    let navigate = useNavigate();
    
    const changeHandler=(e)=>{
      setEmailError('');
      setPasswordError('');
      setEmail(e.target.value);
      setPassword(e.target.value);
      setData({...data,[e.target.name]:[e.target.value]})
    }
  
    const handleFormSubmit=(e)=>{
      e.preventDefault();
      if(email===''){
          setEmailError("Email Required")
      }
      if(password===''){
          setPasswordError("Password Required")
      }
      if(email!=='' && password!==''){
        console.log(data);
        axios.post("http://localhost:4200/admin/login",{
          username: email,
          password: password
        })
        .then(res=>{
          navigate('./admin/dashboard')
        })
      }
    }
    
        return(
          <div id="container">
            <div id="loginBox">
              <center>
                <form onSubmit={handleFormSubmit}>
                  <ul>
                    <li>
                      <NavLink to='/' id='userTab' style={({ isActive }) => ({
                        cursor: "context-menu",
                        background: isActive ? "rgb(240,240,240)" : "lightgrey"
                        })}>User</NavLink>
                    </li>
                    <li>
                      <NavLink to='/admin/login' id='adminTab' style={({ isActive }) => ({
                        cursor: "context-menu",
                        background: isActive ? "rgb(240,240,240)" : "lightgrey"
                        })}>Admin</NavLink>
                    </li>
                  </ul>
                  <h2>Login</h2>
                  <input type='email' 
                       placeholder="Enter Email"
                       id="email" 
                       name="username"
                       onChange={changeHandler}
                       />
                       <p id='emailerrorMessage'>{emailError}</p><br/>
                  <input type ='password'
                       placeholder="Enter Password" 
                       id="password" 
                       name="password"
                       onChange={changeHandler}
                       />
                       <p id='passworderrorMessage'>{passwordError}</p><br/>
                  <input type='submit' 
                       id="submitButton" 
                       value="Submit" 
                       /><br/>
                 <p>New for Booking? <NavLink to='/admin/signup' id='userSignupLink'>Click Here</NavLink></p>
                </form>
              </center>
            </div>
         </div>
        );
        
}
export default Admin