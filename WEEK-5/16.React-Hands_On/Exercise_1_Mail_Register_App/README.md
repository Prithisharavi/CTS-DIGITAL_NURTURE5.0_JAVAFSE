# Mail Register App

## Objective

To develop a React application that demonstrates React Form Validation using controlled components. The application validates the user's name, email, and password before submitting the registration form.

## Features

- Register a user using a React form.
- Accept the following inputs:
  - Full Name
  - Email
  - Password
- Validate the form fields:
  - Name must contain at least **5 characters**.
  - Email must contain a valid email format (`@` and `.`).
  - Password must contain at least **8 characters**.
- Display appropriate validation messages using alerts.
- Display **"Valid Form"** when all validations pass.

## Prerequisites

- Node.js
- npm
- Visual Studio Code

## Project Structure

```
mailregisterapp
│
├── public
├── src
│   ├── App.js
│   ├── App.css
│   ├── Register.js
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

## Validation Rules

- **Full Name:** Minimum 5 characters.
- **Email:** Must be in a valid email format.
- **Password:** Minimum 8 characters.

## Expected Output

- Displays the heading **"Register Here!!!"**.
- Validates the user inputs when the **Submit** button is clicked.
- Displays an alert message for invalid inputs.
- Displays **"Valid Form"** if all validations are successful.

## Learning Outcome

- Implemented React Forms using controlled components.
- Managed form state using the `useState` hook.
- Performed client-side validation for form fields.
- Used regular expressions to validate email addresses.
- Handled form submission and displayed validation messages using event handlers.