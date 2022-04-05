import React, {useEffect, useState} from "react";
import AdminNavbar from '../admin-navbar/AdminNavbar.js';
import './AdminBookings.css';
import axios from 'axios';
export default function AdminBookings(){

    const [data, setData] = useState([]);

     useEffect(() => {
        axios.get("https://localhosr:4200/user/hallDetails")
        .then(res => {
        
            setData(res.data)
        })
        .catch(err => {
            console.log(err)
        })
    })

    return(
        <><AdminNavbar />
        <div id='adminBookings'>
            <table id='bookingList'>
                <tr id='adminbookings-tr'>
                    <th id='adminbookings-th'>Booking ID</th>
                    <th id='adminbookings-th'>User ID</th>
                    <th id='adminbookings-th'>Event Date</th>
                    <th id='adminbookings-th'>Hall Price</th>
                    <th id='adminbookings-th'>Days</th>
                    <th id='adminbookings-th'>Total Price</th>
                </tr>
                <tbody>
                {
                    data.map(post => (
                        <><tr id='adminbookings-tr'><td id='adminbookings-td'>{post.bookingid}</td>
                        <td id='adminbookings-td'>{post.userid}</td>
                        <td id='adminbookings-td'>{post.date}</td>
                        <td id='adminbookings-td'>{post.hallPrice}</td>
                        <td id='adminbookings-td'>{post.days}</td>
                        <td id='adminbookings-td'>{post.totalPrice}</td>
                        </tr></>
                    ))
                }
                 
                </tbody>
            </table>
        </div></>
    )
}