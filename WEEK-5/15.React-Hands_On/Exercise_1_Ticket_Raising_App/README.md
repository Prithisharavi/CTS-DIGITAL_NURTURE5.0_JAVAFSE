# Ticket Raising App

## Objective

To develop a React application that demonstrates React Forms using controlled components to register employee complaints and generate a reference ID upon successful submission.

## Features

- Register employee complaints using a React form.
- Accept employee name through a text box.
- Accept complaint details through a textarea.
- Use controlled components with React state.
- Handle form submission using the `handleSubmit` event.
- Generate a unique reference ID for each submitted complaint.
- Display a confirmation message using an alert.

## Prerequisites

- Node.js
- npm
- Visual Studio Code

## Project Structure

```
ticketraisingapp
│
├── public
├── src
│   ├── App.js
│   ├── App.css
│   ├── ComplaintRegister.js
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

## Expected Output

- Displays the heading **"Register your complaints here!!!"**.
- Accepts employee name and complaint details.
- Clicking the **Submit** button displays a confirmation alert containing:
  - Employee name
  - Complaint submission confirmation
  - Generated reference ID

## Learning Outcome

- Implemented React Forms using controlled components.
- Managed form data using the `useState` hook.
- Handled input changes with event handlers.
- Processed form submission using `handleSubmit`.
- Generated and displayed a unique reference ID after successful submission.