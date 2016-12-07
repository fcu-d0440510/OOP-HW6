package fcu.iecs.oop.pokemon;

import fcu.iecs.oop.pokemon.Pokemon.PokemonType;

public class GYM {

	public static Player fight(Player player1,Player player2){
		Pokemon[] p1=player1.get_Pokemon();
		Pokemon[] p2=player2.get_Pokemon();
		
		int win1=0,win2=0,t;
		
		for(int i=0;i<3;i++){
			if(p1[i].get_PokemonType()==PokemonType.FIRE){
				if(p2[i].get_PokemonType()==PokemonType.FIRE){
					if(p1[i].get_cp()>p2[i].get_cp()){
						win1++;
					}
					else if(p1[i].get_cp()<p2[i].get_cp()){
						win2++;
					}
					else{
						t=(int)(Math.random()*2);
						if(t==0){
							win1++;
						}
						else{
							win2++;
						}
					}
				}
				else if(p2[i].get_PokemonType()==PokemonType.GRASS){
					win1++;
				}
				else{
					win2++;
				}
			}
			else if(p1[i].get_PokemonType()==PokemonType.GRASS){
				if(p2[i].get_PokemonType()==PokemonType.GRASS){
					if(p1[i].get_cp()>p2[i].get_cp()){
						win1++;
					}
					else if(p1[i].get_cp()<p2[i].get_cp()){
						win2++;
					}
					else{
						t=(int)(Math.random()*2);
						if(t==0){
							win1++;
						}
						else{
							win2++;
						}
					}
				}
				else if(p2[i].get_PokemonType()==PokemonType.WATER){
					win1++;
				}
				else{
					win2++;
				}
			}
			else{
				if(p2[i].get_PokemonType()==PokemonType.WATER){
					if(p1[i].get_cp()>p2[i].get_cp()){
						win1++;
					}
					else if(p1[i].get_cp()<p2[i].get_cp()){
						win2++;
					}
					else{
						t=(int)(Math.random()*2);
						if(t==0){
							win1++;
						}
						else{
							win2++;
						}
					}
				}
				else if(p2[i].get_PokemonType()==PokemonType.FIRE){
					win1++;
				}
				else{
					win2++;
				}
			}
		}
		
		if(win1==2){
			player1.save_Level(player1.get_Level()+1);
			System.out.println("Winner is "+player1.get_playerName()+",and his/her level becomes "+player1.get_Level());
			return player1;
		}
		else{
			player2.save_Level(player2.get_Level()+1);
			System.out.println("Winner is "+player2.get_playerName()+",and his/her level becomes "+player2.get_Level());
			return player2;
		}
	}
}