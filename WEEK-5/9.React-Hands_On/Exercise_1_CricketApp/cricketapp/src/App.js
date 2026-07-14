import ListofPlayers from "./ListofPlayers";
import Scorebelow70 from "./Scorebelow70";
import { OddPlayers, EvenPlayers, IndianTeam } from "./IndianPlayers";
import ListofIndianPlayers from "./ListofIndianPlayers";

function App() {

  const players = [
    { name: "Jack", score: 50 },
    { name: "Michael", score: 70 },
    { name: "John", score: 40 },
    { name: "Ann", score: 61 },
    { name: "Elisabeth", score: 61 },
    { name: "Sachin", score: 95 },
    { name: "Dhoni", score: 100 },
    { name: "Virat", score: 84 },
    { name: "Jadeja", score: 64 },
    { name: "Raina", score: 75 },
    { name: "Rohit", score: 80 }
  ];

  let flag = false;

  if (flag === true) {
    return (
      <div style={{ marginLeft: "20px" }}>
        <h1>List of Players</h1>

        <ListofPlayers players={players} />

        <hr />

        <h1>List of Players having Scores Less than 70</h1>

        <Scorebelow70 players={players} />
      </div>
    );
  }

  return (
    <div style={{ marginLeft: "20px" }}>
      <h1>Odd Players</h1>

      <OddPlayers IndianTeam={IndianTeam} />

      <hr />

      <h1>Even Players</h1>

      <EvenPlayers IndianTeam={IndianTeam} />

      <hr />

      <h1>List of Indian Players Merged</h1>

      <ListofIndianPlayers />
    </div>
  );
}

export default App;