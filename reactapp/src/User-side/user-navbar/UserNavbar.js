import React from "react";

import './UserNavbar.css';
export default function UserNavbar(){

  


        return(
          <div>
          <nav id='userNavbar'>
            
                <p id='user-logo'>Krypto-Party</p>
                 <a id='userDashboardLink' href='dashboard'>Dashboard</a>
                <a id='userProfileLink' href="profile">Profile</a>
                <a id='userBookingLink' href="bookings">My Bookings</a>
                <a id='userLogoutButton' href="/" >Logout</a>
          </nav>
        
          </div>
  )
}