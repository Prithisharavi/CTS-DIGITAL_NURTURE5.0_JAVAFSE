import React, { useState } from "react";
import "./App.css";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {
  const [count, setCount] = useState(0);

  // Increment counter
  const increment = () => {
    setCount(count + 1);
  };

  // Display Hello message
  const sayHello = () => {
    alert("Hello! Member!");
  };

  // Invoke multiple methods
  const handleIncrement = () => {
    increment();
    sayHello();
  };

  // Decrement counter
  const handleDecrement = () => {
    setCount(count - 1);
  };

  // Welcome button
  const welcome = (message) => {
    alert(message);
  };

  // Synthetic event
  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div style={{ margin: "20px" }}>
      <h3>{count}</h3>

      <button onClick={handleIncrement}>Increment</button>
      <br />
      <br />

      <button onClick={handleDecrement}>Decrement</button>
      <br />
      <br />

      <button onClick={() => welcome("welcome")}>
        Say welcome
      </button>
      <br />
      <br />

      <button onClick={handleClick}>
        Click on me
      </button>

      <br />
      <br />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
