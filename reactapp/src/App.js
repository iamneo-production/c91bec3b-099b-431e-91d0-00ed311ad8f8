import './App.css';
function App() {
  return(
  <div className='main'>
    <form className='submain'>
      <h1 className='heading'>SIGN UP</h1>
      <input className='inputs'type='Email' placeholder='Enter Email'required></input><br></br>
      <input className='inputs'type='password' placeholder='Enter Password'size="8-13"required></input><br></br>
      <input className='inputs'type='text' placeholder='Enter Mobile Number'
        pattern="[0-9]{10}" required></input><br></br>
      <select className='selector' >
        <option>User</option>
        <option>Admin</option>
      </select><br></br>
      <input className='inputs'type='text' placeholder='Enter Username'required></input><br></br>
      <input className='inputs'type='number' placeholder='Enter Age'required></input><br></br>
      <input className='submit'type='Submit'></input>
      <p className='link'>Go to Login <a href='#'>Click Here</a></p>
    </form> 
  </div>
  )
}
export default App;
