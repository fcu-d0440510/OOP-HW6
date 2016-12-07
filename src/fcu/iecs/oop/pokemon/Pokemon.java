package fcu.iecs.oop.pokemon;

public class Pokemon {
	private String name;
	private int cp;
	private PokemonType type;
	
	public enum PokemonType{
		FIRE,WATER,GRASS
	}
	
	public Pokemon(String name,PokemonType type,int cp){
		this.name=name;
		this.cp=cp;
		this.type=type;
	}
	
	public String get_name(){
		return name;
	}
	
	public int get_cp(){
		return cp;
	}
	
	public void svae_cp(int cp){
		this.cp=cp;
	}
	
	public PokemonType get_PokemonType(){
		return type;
	}

}
