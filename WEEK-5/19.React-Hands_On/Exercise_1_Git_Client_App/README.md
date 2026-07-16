# Git Client App

## Objective

To develop a React application that consumes the GitHub REST API using Axios and performs unit testing using Jest by mocking API responses.

## Features

- Fetch GitHub repositories of a user.
- Display repository names in the browser.
- Use Axios to make REST API calls.
- Create a reusable GitClient module.
- Perform unit testing using Jest.
- Mock Axios requests to avoid real API calls during testing.

## Prerequisites

- Node.js
- npm
- Visual Studio Code

## Project Structure

```
gitclientapp
│
├── public
├── src
│   ├── App.js
│   ├── App.css
│   ├── App.test.js
│   ├── GitClient.js
│   ├── GitClient.test.js
│   ├── index.js
│
├── package.json
└── README.md
```

## Technologies Used

- React
- JavaScript (ES6)
- Axios
- Jest
- GitHub REST API

## API Used

```
https://api.github.com/users/{username}/repos
```

## Steps to Run

1. Open the project in Visual Studio Code.
2. Install the dependencies:

```bash
npm install
```

3. Install Axios:

```bash
npm install axios
```

4. Start the application:

```bash
npm start
```

5. Open the browser:

```
http://localhost:3000
```

## Running the Tests

Execute:

```bash
npm test
```

Press **`a`** to run all tests if prompted.

## Expected Output

### Browser

- Displays the heading:
  ```
  Git repositories of User - TechieSyed
  ```
- Lists all repositories retrieved from the GitHub API.

### Test Output

```
PASS src/GitClient.test.js
PASS src/App.test.js

Test Suites: 2 passed, 2 total
Tests:       2 passed, 2 total
```

## Learning Outcome

- Consumed REST APIs using Axios.
- Implemented reusable service modules in React.
- Mocked HTTP requests using Jest.
- Performed unit testing without making actual API calls.
- Verified API responses and application behavior using mocked data.