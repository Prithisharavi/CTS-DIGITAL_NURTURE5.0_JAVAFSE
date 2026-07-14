function ListofIndianPlayers() {

  const T20Players = [
    "First Player",
    "Second Player",
    "Third Player"
  ];

  const RanjiPlayers = [
    "Fourth Player",
    "Fifth Player",
    "Sixth Player"
  ];

  const IndianPlayers = [...T20Players, ...RanjiPlayers];

  return (
    <ul>
      {IndianPlayers.map((player, index) => (
        <li key={index}>
          Mr. {player}
        </li>
      ))}
    </ul>
  );
}

export default ListofIndianPlayers;