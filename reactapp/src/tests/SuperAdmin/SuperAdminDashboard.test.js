import { render } from '@testing-library/react';
import React from 'react';
import { MemoryRouter } from 'react-router';
import SuperAdminDashboard from '../../components/SuperAdmin/SuperAdminDashboard/SuperAdminDashboard';

describe('Test SuperAdmin Dashboard Component', () => {
    test('feSuperAdminDashboard1', () => {
        const { container } = render(<MemoryRouter><SuperAdminDashboard /></MemoryRouter>);

        expect(container).toBeInTheDocument();
    })
})