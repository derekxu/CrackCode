package designQuestions;

import java.util.*;
class Thresh{
	static final int minNumSingleCage = 1000;
}
class Animal{
	public int size;
	Set<Animal> preyList;
	public Animal(int size, Set<Animal> preys){
		this.size = size;
		preyList = new HashSet<Animal>(preys);
	}
	public boolean isPrey(Animal animal){
		return preyList.contains(animal);
	}
	public boolean needSingleCage(){
		if(preyList.size()>=Thresh.minNumSingleCage){
			return true;
		}
		
		return false;
	}
}


class Cage{
	int capacity;
	int curSize;
	Map<Animal, Integer> cagedAnimals;
	
	public boolean add(Animal animal){
		if(animal.needSingleCage()||curSize+animal.size>capacity)
			return false;
		if(cagedAnimals.containsKey(animal)){
			cagedAnimals.put(animal, cagedAnimals.get(animal)+1);
			curSize+=animal.size;
			return true;
		}
		
		for(Animal caged:cagedAnimals.keySet()){
			if(caged.isPrey(animal)){
				return false;
			}
		}
		
		curSize+=animal.size;
		cagedAnimals.put(animal, 1);
		return true;
	}
}

class SingleCage extends Cage{
	
	
	
	@Override
	public boolean add(Animal animal){
		if(!animal.needSingleCage()||curSize+animal.size>capacity||!cagedAnimals.isEmpty())
			return false;
		
		curSize+=animal.size;
		cagedAnimals.put(animal,1);		
		return true;
	}
}

public class AnimalZoo {
	List<Cage> cages;
	
}
