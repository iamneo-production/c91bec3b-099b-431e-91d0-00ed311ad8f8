import React,{useState,useEffect} from "react"; 
import axios from "axios";
import UserNavbar from '../user-navbar/UserNavbar'
import './UserDashboard.css';
import {Link} from 'react-router-dom';




export default function Dashboard(){
    const [posts,setPosts] = useState([]);

    
    

    useEffect(() => {
        axios.get("https://localhost:4200/admin/addHall")
        .then(res => {
            setPosts(res.data)
        })
        .catch(err => {
            console.log(err)
        })
    })

    return(
        <><UserNavbar />
                <div id='userDashboard'>
                    <table id='dashboard-table'>
                        <tbody>
                            {posts.map(post => (
                                <><Link to={'companyDetail'}>
                                    <tr id='dashboard-tr'>
                                        <td id='dashboard-td'>{post.name}</td>
                                        <td id='dashboard-td'>{post.companyAddress}</td>
                                        <td id='dashboard-td'>{post.mobileNumber}</td>
                                    </tr>
                                  </Link>
                                </>
                            ))}
                        </tbody>
                    </table>
                </div></>
    )
}