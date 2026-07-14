function Scorebelow70(props) {

  const result = props.players.filter(player => player.score <= 70);

  return (
    <ul>
      {result.map((item, index) => (
        <li key={index}>
          Mr. {item.name} {item.score}
        </li>
      ))}
    </ul>
  );
}

export default Scorebelow70;