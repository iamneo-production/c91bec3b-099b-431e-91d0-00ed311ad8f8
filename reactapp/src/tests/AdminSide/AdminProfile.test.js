import { getByTestId, queryByTestId, render, screen } from '@testing-library/react';
import React from 'react';
import { MemoryRouter } from 'react-router';
import AdminProfile from '../../components/AdminSide/AdminProfile/AdminProfile';

describe('Admin Profile Component', () => {
    render(<MemoryRouter><AdminProfile /></MemoryRouter>);

    test('feAdminProfile1', () => {
        const adminProfile = screen.queryByTestId('adminProfile');
        const editAdminProfile = screen.queryByTestId('editAdminProfile');

        expect(adminProfile).toBeTruthy();
        expect(editAdminProfile).toBeTruthy();
    })
    
})