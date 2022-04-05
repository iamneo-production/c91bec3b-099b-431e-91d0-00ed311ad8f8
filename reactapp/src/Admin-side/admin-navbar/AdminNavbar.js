import React from "react";

import './AdminNavbar.css';
export default function AdminNavbar(){




        return(
          <div>
          <nav id='adminNavbar'>
            
                <p id='admin-logo'>Krypto-Party</p>
                 <a id='adminDashboardLink' href='dashboard'>Dashboard</a>
                <a id='adminProfileLink' href="profile">Profile</a>
                <a id='adminBookingLink' href="bookings">My Bookings</a>
                <a id='adminLogoutButton' href="/admin/login">Logout</a>
          </nav>
        
          </div>
  )
}