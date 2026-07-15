# Ticket Booking App

## Objective

To develop a React application that demonstrates conditional rendering by displaying different pages for guest and logged-in users using Login and Logout buttons.

## Features

- Display the Guest page with **"Please sign up."** message.
- Display the **Login** button for guest users.
- Display the User page with **"Welcome back"** message after login.
- Display the **Logout** button for logged-in users.
- Toggle between Guest and User pages using conditional rendering.
- Implement React conditional rendering using state and reusable components.

## Prerequisites

- Node.js
- npm
- Visual Studio Code

## Project Structure

```
ticketbookingapp
│
├── public
├── src
│   ├── App.js
│   ├── App.css
│   ├── index.js
│   ├── Greeting.js
│   ├── GuestGreeting.js
│   ├── UserGreeting.js
│   ├── LoginButton.js
│   └── LogoutButton.js
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
http://localhost:3001
```

## Expected Output

### Guest View

- Displays **"Please sign up."**
- Displays the **Login** button.

### User View

- Clicking **Login** displays **"Welcome back"**.
- Displays the **Logout** button.

### Logout

- Clicking **Logout** returns to the Guest page with the **Login** button.

## Learning Outcome

- Implemented conditional rendering in React.
- Used React state (`useState`) to manage login status.
- Created reusable components for Login, Logout, Guest Greeting, and User Greeting.
- Displayed different UI based on user authentication state.