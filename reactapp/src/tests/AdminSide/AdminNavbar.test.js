import React from 'react';
import { render, screen } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect';
import AdminNavbar from '../../components/AdminSide/AdminNavbar/AdminNavbar';
import { MemoryRouter } from 'react-router';

describe('<AdminNavbar />', () => {
  test('feAdminNavbar1', () => {
    render(<MemoryRouter><AdminNavbar /></MemoryRouter>);

    const adminNavbar = screen.getByTestId('adminNavbar');
    const adminProfileLink = screen.getByTestId('adminProfileLink');
    const adminDashboardLink = screen.getByTestId('adminDashboardLink');
    const adminBookingLink = screen.getByTestId('adminBookingLink');
    const adminLogoutButton = screen.getByTestId('adminLogoutButton');

    expect(adminNavbar).toBeTruthy();
    expect(adminProfileLink).toBeTruthy();
    expect(adminDashboardLink).toBeTruthy();
    expect(adminBookingLink).toBeTruthy();
    expect(adminLogoutButton).toBeTruthy();

  });
});