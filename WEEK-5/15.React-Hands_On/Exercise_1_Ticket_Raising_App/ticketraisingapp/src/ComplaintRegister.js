import React, { useState } from "react";

function ComplaintRegister() {
  const [formData, setFormData] = useState({
    ename: "",
    complaint: ""
  });

  const [numberHolder] = useState(
    Math.floor(Math.random() * 1000)
  );

  const handleChange = (event) => {
    setFormData({
      ...formData,
      [event.target.name]: event.target.value
    });
  };

  const handleSubmit = (event) => {
    event.preventDefault();

    const msg =
      "Thanks " +
      formData.ename +
      "\nYour Complaint was Submitted.\nYour Reference ID is: " +
      numberHolder;

    alert(msg);
  };

  return (
    <div className="container">

      <h1>Register your complaints here!!!</h1>

      <form onSubmit={handleSubmit}>

        <table>
          <tbody>

            <tr>
              <td>Name:</td>
              <td>
                <input
                  type="text"
                  name="ename"
                  value={formData.ename}
                  onChange={handleChange}
                  required
                />
              </td>
            </tr>

            <tr>
              <td>Complaint:</td>
              <td>
                <textarea
                  name="complaint"
                  value={formData.complaint}
                  onChange={handleChange}
                  required
                ></textarea>
              </td>
            </tr>

            <tr>
              <td></td>
              <td>
                <button type="submit">
                  Submit
                </button>
              </td>
            </tr>

          </tbody>
        </table>

      </form>

    </div>
  );
}

export default ComplaintRegister;