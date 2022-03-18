import React from 'react';
import { fireEvent, render, screen } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect';
import Signup from '../../components/Auth/Signup/Signup';
import { MemoryRouter } from 'react-router';

describe('<Signup />', () => {
  test('feSignup1', () => {
    render(<MemoryRouter><Signup /></MemoryRouter>);
    
    const signupBox = screen.queryByTestId('signupBox');
    const email = screen.queryByTestId('email');
    const password = screen.queryByTestId('password');
    const mobilenumber = screen.queryByTestId('mobilenumber');
    const userrole = screen.queryByTestId('userrole');
    const username = screen.queryByTestId('username');
    const age = screen.queryByTestId('age');
    const submitButton = screen.queryByTestId('submitButton');
    const loginLink = screen.queryByTestId('loginLink');

    expect(signupBox).toBeTruthy();
    expect(email).toBeTruthy();
    expect(password).toBeTruthy();
    expect(mobilenumber).toBeTruthy();
    expect(userrole).toBeTruthy();
    expect(username).toBeTruthy();
    expect(age).toBeTruthy();
    expect(submitButton).toBeTruthy();
    expect(loginLink).toBeTruthy();

    fireEvent.change(email, {target : {value : 'test email'}})
    expect(email.value).toBe('test email');
    
    fireEvent.change(password, {target : {value : 'test password'}})
    expect(password.value).toBe('test password');

    fireEvent.change(mobilenumber, {target : {value : '1234567890'}})
    expect(mobilenumber.value).toBe('1234567890');

    fireEvent.change(age, {target : {value : '17'}})
    expect(age.value).toBe('17');

    fireEvent.change(username, {target : {value : 'test name'}})
    expect(username.value).toBe('test name');
    
  });
});