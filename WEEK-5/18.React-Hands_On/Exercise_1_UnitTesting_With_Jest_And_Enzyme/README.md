# Cohort Tracker - Unit Testing with Jest and Enzyme

## Objective

To perform unit testing on the Cohort Tracker React application using Jest and Enzyme by testing the CohortDetails component.

## Features

- Configure Enzyme for React unit testing.
- Create unit test cases using Jest.
- Test component rendering.
- Test component props.
- Verify cohort code rendering.
- Generate and validate component snapshots.

## Prerequisites

- Node.js
- npm
- Visual Studio Code

## Project Structure

```
cohortstracker
│
├── public
├── src
│   ├── App.js
│   ├── Cohort.js
│   ├── CohortDetails.js
│   ├── CohortDetails.test.js
│   ├── setupTests.js
│   ├── index.js
│
├── package.json
└── README.md
```

## Technologies Used

- React
- Jest
- Enzyme
- React Test Renderer
- JavaScript (ES6)

## Steps to Run

1. Open the project in Visual Studio Code.
2. Install the dependencies:

```bash
npm install
```

3. Install Enzyme:

```bash
npm install --save-dev enzyme enzyme-adapter-react-16 react-test-renderer@16.14.0 --legacy-peer-deps
```

4. Run the test cases:

```bash
npm test
```

5. Press **`a`** to run all tests if prompted.

## Test Cases

- Create the CohortDetails component.
- Initialize the component props.
- Display the cohort code inside the `<h3>` element.
- Verify the snapshot of the component.

## Expected Output

```
PASS src/CohortDetails.test.js

Test Suites: 1 passed, 1 total
Tests:       4 passed, 4 total
Snapshots:   1 passed, 1 total
```

## Learning Outcome

- Configured Jest and Enzyme for React testing.
- Wrote unit test cases using `describe()` and `test()`.
- Used Enzyme's `shallow()` and `mount()` methods.
- Performed snapshot testing.
- Verified component rendering and props using Jest matchers.