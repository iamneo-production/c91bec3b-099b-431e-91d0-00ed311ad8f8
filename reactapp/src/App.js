import React from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import AdminDashboard from "./Admin-side/admin-dashboard/AdminDashboard";
import AdminBookings from "./Admin-side/admin-bookings/AdminBookings";

import Admin from "./auth/login/Admin";
import User from "./auth/login/User";

import UserDashboard from "./User-side/user-dashboard/UserDashboard"

import UserBookings from "./User-side/user-bookings/UserBookings"
import UserCompanyDetails from "./User-side/user-dashboard/UserCompanyDetails"

function App(){

    return(
     
             <BrowserRouter> 
              <Routes>
                <Route exact path='/' element={<User/>} />
                <Route path='/admin/login' element={<Admin/>} />
                <Route path='/user/dashboard' element={<UserDashboard/>}/>
                
                <Route path='/user/bookings' element={<UserBookings/>} />
                <Route path='/admin/dashboard' element={<AdminDashboard/>}/>
                
                <Route path='/admin/bookings' element={<AdminBookings/>}/>
                <Route path='/user/companyDetail' element={<UserCompanyDetails/>} />
              </Routes>
          
            </BrowserRouter>
            
          
    )
  
}
export default App;