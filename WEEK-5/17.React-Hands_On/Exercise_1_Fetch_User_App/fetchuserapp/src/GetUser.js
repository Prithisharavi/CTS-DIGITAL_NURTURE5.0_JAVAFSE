import React, { useEffect, useState } from "react";

function GetUser() {
  const [user, setUser] = useState(null);

  useEffect(() => {
    fetch("https://api.randomuser.me/")
      .then((response) => response.json())
      .then((data) => {
        setUser(data.results[0]);
      })
      .catch((error) => console.log(error));
  }, []);

  if (!user) {
    return <h2>Loading...</h2>;
  }

  return (
    <div style={{ marginLeft: "120px", marginTop: "80px" }}>
      <h1>
        {user.name.title} {user.name.first} {user.name.last}
      </h1>

      <img
        src={user.picture.large}
        alt="User"
      />
    </div>
  );
}

export default GetUser;