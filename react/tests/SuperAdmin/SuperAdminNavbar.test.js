import { render, screen } from '@testing-library/react';
import React from 'react';
import { MemoryRouter } from 'react-router';
import SuperAdminNavbar from '../../components/SuperAdmin/SuperAdminNavbar/SuperAdminNavbar';

describe('Test SuperAdminNavbar', () => {

    test('feSuperAdminNavbar1', () => {
        const { container } = render(<MemoryRouter><SuperAdminNavbar /></MemoryRouter>);

        const superAdminNavbar = screen.queryByTestId('superAdminNavbar');
        const superAdminBookingLink = screen.queryByTestId('superAdminBookingLink');
        const superAdminLogoutButton = screen.queryByTestId('superAdminLogoutButton');
        const superAdminDashboardLink = screen.queryByTestId('superAdminDashboardLink');

        expect(superAdminBookingLink).toBeTruthy();
        expect(superAdminDashboardLink).toBeTruthy();
        expect(superAdminLogoutButton).toBeTruthy();
        expect(superAdminNavbar).toBeTruthy();
        
    })

})