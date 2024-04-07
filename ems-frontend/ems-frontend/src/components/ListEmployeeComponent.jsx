import React, {useEffect, useState} from 'react'
import { listEmployees } from '../services/EmployeeService'

const ListEmployeeComponent = () => {

   const [employees, setEmployees] = useState([])
   
   useEffect(() => {
    listEmployees().then((response) => {
        setEmployees(response.data);
    }).catch(error => {
        console.log(error);
    })
   } , [])

  return (
    <div className='container'>
        <h2>List of Employees</h2>
        <table className='text-center table table-striped table-bordered'>
            <thead>
                <th>Employee Id</th>
                <th> Employee First Name</th>
                <th> Employee Last Name</th>
                <th> Employee ID</th>
            </thead>
            <tbody>
                {
                    employees.map(employee => 
                        <tr key={employee.id}>
                            <td>{employee.id}</td>
                            <td>{employee.firstName}</td>
                            <td>{employee.lastName}</td>
                            <td>{employee.email}</td>
                        </tr>    
                    )
                }
                
            </tbody>
        </table>
    </div>
  )
}

export default ListEmployeeComponent