import React from 'react';
import { fireEvent, render, screen } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect';
import Login from '../../components/Auth/Login/Login';
import { MemoryRouter } from 'react-router';

describe('<Login />', () => {
  test('feLogin1', () => {
    render(<MemoryRouter><Login /></MemoryRouter>);

    const loginBox = screen.getByTestId('loginBox');
    const email = screen.getByTestId('email');
    const password = screen.getByTestId('password');
    const userTab = screen.getByTestId('userTab');
    const submitButton = screen.getByTestId('submitButton');
    const userSignupLink = screen.getByTestId('userSignupLink');

    expect(loginBox).toBeTruthy();
    expect(email).toBeTruthy();
    expect(password).toBeTruthy();
    expect(userTab).toBeTruthy();
    expect(submitButton).toBeTruthy();
    expect(userSignupLink).toBeTruthy();

    fireEvent.change(email, {target : {value : 'test email'}})
    expect(email.value).toBe('test email');
    
    fireEvent.change(password, {target : {value : 'test password'}})
    expect(password.value).toBe('test password');
    
  });
});