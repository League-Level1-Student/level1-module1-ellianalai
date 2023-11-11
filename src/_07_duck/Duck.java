package _07_duck;

class Duck {
	int numberOfFriends;
	String favoriteFood;
	String name;
	
	void quack() {
		System.out.println(name + " quacks at its " + numberOfFriends + " friends");
		
	}
	void waddle() {
		System.out.println(name + " waddles to the " + favoriteFood );
	}
	
	Duck(String name, String food, int friends){
		this.name = name;
		this.favoriteFood = food;
		this.numberOfFriends = friends;
	}
	
}

class Pig {
	int numberOfFriends;
	String favoriteFood;
	String name;
	
	void squeals() {
		System.out.println(name + " squeals at its " + numberOfFriends + " friends");
		
	}
	void roll() {
		System.out.println(name + " rolls to the trough of " + favoriteFood );
	}
	void oink(Duck d) {
		System.out.println(name + " oinks \"hello\" to " + d.name);
	}
	
	Pig(String name, String food, int friends){
		this.name = name;
		this.favoriteFood = food;
		this.numberOfFriends = friends;
	}
	
}