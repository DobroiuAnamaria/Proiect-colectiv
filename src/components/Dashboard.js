
import React, { useState, useEffect } from 'react';
import { useLocation, useParams, useNavigate } from 'react-router-dom';
import './Dashboard.css';
import MainPage from './MainDashboard/MainPage';
import Login from './Login';



function Dashboard() {
    let { id } = useParams();
    const [users, updateUsers] = useState([]);
    const { state, pathname } = useLocation();
    const navigation = useNavigate();
    const pageName = pathname.split('dashboard/');

    console.log(pageName);
    console.log(pathname);
    console.log(state);
    
    useEffect(function effectFunction() {
        async function fetchUsers() {
            const response = await fetch('http://localhost:3600/users/whoami', {
                method: 'GET', headers: {
                    "Authorization": state.token,
                }
            });

            const json = await response.json();
            console.log(json);
            updateUsers(json);
            console.log(users);
            //console.log(match);
        }
        if (!state) {
            return navigation("/login");
        }
        fetchUsers();
    }, []);
    
    
};
export default Dashboard;