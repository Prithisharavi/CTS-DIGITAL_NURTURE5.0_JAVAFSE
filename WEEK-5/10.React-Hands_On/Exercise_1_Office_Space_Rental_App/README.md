# Office Space Rental App

## Objective

To create a React application using JSX that displays office space details with conditional styling.

## Features

- Display the heading **"Office Space, at Affordable Range"**
- Display an office image
- Display office details:
  - Name
  - Rent
  - Address
- Apply inline CSS to display:
  - **Red** color if Rent is below ₹60,000
  - **Green** color if Rent is above ₹60,000

## Prerequisites

- Node.js
- npm
- Visual Studio Code

## Project Structure

```
officespacerentalapp
│
├── public
├── src
│   ├── App.js
│   ├── App.css
│   ├── index.js
│   └── office.jpg
├── package.json
└── README.md
```

## Steps to Run

1. Open the project in Visual Studio Code.
2. Open the terminal.
3. Install dependencies:

```bash
npm install
```

4. Start the React application:

```bash
npm start
```

5. Open the browser and visit:

```
http://localhost:3000
```

## Expected Output

- Heading: **Office Space, at Affordable Range**
- Office image displayed
- Name: **DBS**
- Rent: **Rs. 50000** (Displayed in **Red**)
- Address: **Chennai**

## Technologies Used

- React
- JSX
- JavaScript
- CSS

## Outcome

Successfully created a React application that uses JSX, JavaScript expressions, and inline CSS to display office space details with conditional styling.