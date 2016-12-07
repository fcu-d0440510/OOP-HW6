package fcu.iecs.oop.pokemon;

public class Player {

	private String playerName;
	private Pokemon[] pokemons=new Pokemon[3];
	private int level;
	
	public Player(String playerName){
		this.level=1;
		this.playerName=playerName;
	}
	
	public String get_playerName(){
		return playerName;
	}
	
	public void save_playerName(String playerName){
		this.playerName=playerName;
	}
	
	public void save_Pokemon(Pokemon[] pokemons){
		this.pokemons=pokemons;
	}
	
	public Pokemon[] get_Pokemon(){
		return pokemons;
	}
	
	public void save_Level(int level){
		this.level=level;
	}
	
	public int get_Level(){
		return level;
	}

}
