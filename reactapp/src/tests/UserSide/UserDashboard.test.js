import { queryByTestId, render, screen } from '@testing-library/react';
import React from 'react';
import { MemoryRouter } from 'react-router';
import UserDashboard from '../../components/UserSide/UserDashboard/UserDashboard';


describe('User Dashboard Component', () => {
    
    render(<MemoryRouter><UserDashboard /></MemoryRouter>)

    test('feUserDashboard1', () => {
       const  userDashboard = screen.queryByTestId('userDashboard');

       expect(userDashboard).toBeTruthy();
    })

})