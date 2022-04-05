import React from 'react';
import { render, screen } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect';
import AdminDashboard from '../../components/AdminSide/AdminDashboard/AdminDashboard';
import { MemoryRouter } from 'react-router';

describe('<Login />', () => {
  test('feAdminDashboard1', () => {
    render(<MemoryRouter><AdminDashboard /></MemoryRouter>);

    const addHallButton = screen.getByTestId('addHallButton');
    const adminDashboard = screen.getByTestId('adminDashboard');

    expect(addHallButton).toBeTruthy();
    expect(adminDashboard).toBeTruthy();
  });
});