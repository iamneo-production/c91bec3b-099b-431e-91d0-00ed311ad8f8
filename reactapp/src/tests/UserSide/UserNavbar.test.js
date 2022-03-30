import { queryByTestId, render, screen } from '@testing-library/react';
import React from 'react';
import { MemoryRouter } from 'react-router';
import UserNavbar from '../../components/UserSide/UserNavbar/UserNavbar';


describe('User Navbar Component', () => {
    
    const {container} = render(<MemoryRouter><UserNavbar /></MemoryRouter>)

    test('feUserNavbar1', () => {
       const  userNavbar = screen.queryByTestId('userNavbar');
       const  userProfileLink = screen.queryByTestId('userProfileLink');
       const userDashboardLink = screen.queryByTestId('userDashboardLink')
       const userBookingLink = screen.queryByTestId('userBookingLink');
       const userLogoutButton = screen.queryByTestId('userLogoutButton');
    })

})