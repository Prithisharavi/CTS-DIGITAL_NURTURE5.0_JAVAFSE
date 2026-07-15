# Employees App - React Context API

## Objective

To convert an existing React application from props drilling to React Context API by creating a shared theme context for child components.

## Features

- Create a ThemeContext using `createContext()`.
- Provide the theme value using `ThemeContext.Provider`.
- Consume the theme using the `useContext()` hook.
- Switch between **Light** and **Dark** themes.
- Apply the selected theme to the Edit and Delete buttons.
- Eliminate props drilling by using React Context API.

## Prerequisites

- Node.js
- npm
- Visual Studio Code

## Project Structure

```
employeesapp
│
├── public
├── src
│   ├── App.js
│   ├── App.css
│   ├── Employee.js
│   ├── EmployeesList.js
│   ├── EmployeeCard.js
│   ├── EmployeeCard.module.css
│   ├── ThemeContext.js
│   ├── index.js
│
├── package.json
└── README.md
```

## Technologies Used

- React
- React Context API
- JavaScript (ES6)
- JSX
- CSS Modules

## Steps to Run

1. Open the project in Visual Studio Code.
2. Open the integrated terminal.
3. Install the dependencies:

```bash
npm install
```

4. Start the application:

```bash
npm start
```

5. Open the browser and navigate to:

```
http://localhost:3000
```

## Expected Output

- Displays a list of employees.
- Provides a dropdown to select **Light** or **Dark** theme.
- Updates the **Edit** and **Delete** buttons based on the selected theme.
- Shares the theme using React Context API without passing props through intermediate components.

## Learning Outcome

- Created and used a React Context.
- Implemented `ThemeContext.Provider`.
- Consumed context using the `useContext()` hook.
- Replaced props drilling with React Context API.