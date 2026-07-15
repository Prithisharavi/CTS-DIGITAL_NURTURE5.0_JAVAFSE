import React from "react";
import { books } from "./Data";

function BookDetails() {

  const bookdet = (
    <ul style={{ listStyleType: "none", padding: 0 }}>
      {books.map((book) => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </ul>
  );

  return (
    <div>
      <h1>Book Details</h1>
      {bookdet}
    </div>
  );
}

export default BookDetails;