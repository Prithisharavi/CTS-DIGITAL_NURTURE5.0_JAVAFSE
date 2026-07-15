import React from "react";
import { blogs } from "./Data";

function BlogDetails() {

  const content = (
    <ul style={{ listStyleType: "none", padding: 0 }}>
      {blogs.map((blog) => (
        <div key={blog.id}>
          <h2>{blog.title}</h2>
          <h4>{blog.author}</h4>
          <p>{blog.content}</p>
        </div>
      ))}
    </ul>
  );

  return (
    <div>
      <h1>Blog Details</h1>
      {content}
    </div>
  );
}

export default BlogDetails;