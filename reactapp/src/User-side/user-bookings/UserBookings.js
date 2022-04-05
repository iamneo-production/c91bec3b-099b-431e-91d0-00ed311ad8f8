import React, {useEffect, useState} from "react";
import UserNavbar from "../user-navbar/UserNavbar";
import './UserBookings.css';
import axios from 'axios';
export default function UserBookings(){

    const [data, setData] = useState([]);

     useEffect(() => {
        axios.get("https://localhost:4200/user/hallDetail")
        .then(res => {
            
            setData(res.data)
        })
        .catch(err => {
            console.log(err)
        })
    })

    return(
        <><UserNavbar />
        <div id='userBookingBody'>
            <table id='bookings-table'>
                <tr id='bookings-tr'>
                    <th id='bookings-th'>Company Name</th>
                    <th id='bookings-th'>Event Date</th>
                    <th id='bookings-th'>Hall Price</th>
                    <th id='bookings-th'>Days</th>
                    <th id='bookings-th'>Total Price</th>
                </tr>
                <tbody>
                {
                    data.map(post => (
                        <><tr id='bookings-tr'><td id='bookings-td'>{post.name}</td>
                        <td id='bookings-td'>{post.date}</td>
                        <td id='bookings-td'>{post.hallPrice}</td>
                        <td id='bookings-td'>{post.days}</td>
                        <td id='bookings-td'>{post.totalPrice}</td>
                        </tr></>
                    ))
                }
                 
                </tbody>
            </table>
        </div></>
    )
}