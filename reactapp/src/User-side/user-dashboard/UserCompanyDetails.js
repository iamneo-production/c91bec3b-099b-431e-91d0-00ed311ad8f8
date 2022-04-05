import React,{useState,useEffect} from "react";
import axios from "axios";
import UserNavbar from '../user-navbar/UserNavbar'
import './UserCompanyDetails.css';



export default function UserCompanyDetails(){
    const [posts,setPosts] = useState([]);

    useEffect((props) => {
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
                <div id='userCompanyDetail'>
                    <table id='userCompanyDetail-table1'>
                        <tbody>
                            {posts.map(post => (
                                <><tc id='userCompanyDetail-tc'><td id='userCompanyDetail-td-name'>{post.name}</td><br />
                                    <td id='userCompanyDetail-td1'>{post.companyAddress}</td><br />
                                    <td id='userCompanyDetail-td1'>{post.mobileNumber}</td><br /></tc></>
                            ))}
                        </tbody>
                    </table>
                </div>


                <div id='userCompanyDetail2'>
                    <table id='userCompanyDetail-table2'>
                        <tbody>
                            {posts.map(post => (
                                <><tr id='userCompanyDetail-tr'><td id='userCompanyDetail-td2'>Event Date: {post.date}</td>
                                    <td id='userCompanyDetail-td2'>{post.hallPrice}</td>
                                    <td id='userCompanyDetail-td2'>{post.hallType}</td>

                                    <td id='userCompanyDetail-td2'>{post.availability}</td></tr></>
                            ))}
                        </tbody>
                    </table>
                </div></>
    )
}