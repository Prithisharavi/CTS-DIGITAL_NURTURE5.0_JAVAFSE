# Fetch User App

## Objective

To develop a React application that consumes a REST API and displays the details of a randomly generated user using the Random User API.

## Features

- Fetch user data from the Random User API.
- Display the user's:
  - Title
  - First Name
  - Last Name
  - Profile Picture
- Use React Hooks (`useState` and `useEffect`) to retrieve and display API data.
- Display a loading message while data is being fetched.

## Prerequisites

- Node.js
- npm
- Visual Studio Code

## Project Structure

```
fetchuserapp
│
├── public
├── src
│   ├── App.js
│   ├── App.css
│   ├── GetUser.js
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
- Fetch API
- Random User REST API

## API Used

```
https://api.randomuser.me/
```

## Steps to Run

1. Open the project in Visual Studio Code.
2. Open the integrated terminal.
3. Install the required dependencies:

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

- Fetches a random user's details from the REST API.
- Displays:
  - User Title
  - First Name
  - Last Name
  - Profile Image
- Displays a loading message until the data is retrieved.

> **Note:** The displayed user details change every time the page is refreshed because the application retrieves a random user from the API.

## Learning Outcome

- Consumed a REST API using the Fetch API.
- Used React Hooks (`useState` and `useEffect`) for asynchronous data fetching.
- Parsed JSON responses and displayed the retrieved data.
- Implemented API integration in a React application.