# Blogger App

## Objective

To develop a React application that demonstrates conditional rendering, rendering multiple components, lists, keys, and the `map()` function by displaying Book Details, Blog Details, and Course Details.

## Features

- Display **Book Details** using the `map()` function.
- Display **Blog Details** using the `map()` function.
- Display **Course Details** using the `map()` function.
- Render multiple React components on a single page.
- Use **keys** while rendering lists.
- Arrange all components side by side using CSS.

## Prerequisites

- Node.js
- npm
- Visual Studio Code

## Project Structure

```
bloggerapp
│
├── public
├── src
│   ├── App.js
│   ├── App.css
│   ├── index.js
│   ├── Data.js
│   ├── BookDetails.js
│   ├── BlogDetails.js
│   └── CourseDetails.js
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

- Display **Course Details**.
- Display **Book Details**.
- Display **Blog Details**.
- All three sections are displayed side by side.
- Data is rendered dynamically using the `map()` function.
- Each list item is assigned a unique **key**.

## Learning Outcome

- Implemented list rendering using React.
- Used the `map()` function to render multiple items.
- Assigned unique keys while rendering lists.
- Created reusable React components.
- Applied CSS for layout and styling.