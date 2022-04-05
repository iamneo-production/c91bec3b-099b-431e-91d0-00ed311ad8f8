import { render } from '@testing-library/react';
import React from 'react';
import { MemoryRouter } from 'react-router';
import UserProfile from '../../components/UserSide/UserProfile/UserProfile';

describe ('User Profile Component' ,() => {
    test('feUserProfile1', () => {
        const {  container } = render(<MemoryRouter><UserProfile /></MemoryRouter>) ;
        expect(container).toBeInTheDocument();
    })
})