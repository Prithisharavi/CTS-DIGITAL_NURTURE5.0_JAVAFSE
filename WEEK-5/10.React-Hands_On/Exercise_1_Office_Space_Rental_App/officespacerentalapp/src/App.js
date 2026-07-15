import React from "react";
import officeImg from "./office.jpg";

function App() {

  const office = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  return (
    <div style={{ marginLeft: "60px", marginTop: "40px" }}>

      <h1>Office Space , at Affordable Range</h1>

      <img
        src={officeImg}
        alt="Office Space"
        width="200"
        height="150"
      />

      <h2>Name: {office.Name}</h2>

      <h3
        style={{
          color: office.Rent <= 60000 ? "red" : "green"
        }}
      >
        Rent: Rs. {office.Rent}
      </h3>

      <h3>Address: {office.Address}</h3>

    </div>
  );
}

export default App;