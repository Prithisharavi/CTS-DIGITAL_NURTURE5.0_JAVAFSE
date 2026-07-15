# Event Examples App

## Objective

To develop a React application that demonstrates event handling using React events, event handlers, synthetic events, and form handling.

## Features

- Increment and Decrement counter using button click events.
- Increment button invokes multiple methods:
  - Increases the counter value.
  - Displays **"Hello! Member!"** alert.
- Display a welcome message using a button with an argument.
- Handle a synthetic event to display **"I was clicked"**.
- Create a Currency Convertor component.
- Convert the entered Euro amount to Indian Rupees when the **Submit** button is clicked.
- Handle form submission using React event handling.

## Prerequisites

- Node.js
- npm
- Visual Studio Code

## Project Structure

```
eventexamplesapp
│
├── public
├── src
│   ├── App.js
│   ├── App.css
│   ├── CurrencyConvertor.js
│   ├── index.js
│
├── package.json
└── README.md
```

## Technologies Used

- React
- JavaScript (ES6)
- JSX
- CSS

## Steps to Run

1. Open the project in Visual Studio Code.
2. Open the terminal.
3. Install the required packages:

```bash
npm install
```

4. Start the React application:

```bash
npm start
```

5. Open the browser and navigate to:

```
http://localhost:3000
```

## Expected Output

- Counter value is displayed.
- **Increment** button increases the counter and displays **"Hello! Member!"**.
- **Decrement** button decreases the counter.
- **Say welcome** button displays **"welcome"**.
- **Click on me** button displays **"I was clicked"**.
- Currency Convertor accepts the amount and currency.
- Clicking **Submit** converts the entered Euro amount to Indian Rupees and displays the result.

## Learning Outcome

- Implemented React event handling.
- Used event handlers and synthetic events.
- Passed arguments to event handler functions.
- Handled form submission in React.
- Performed simple currency conversion using React components.