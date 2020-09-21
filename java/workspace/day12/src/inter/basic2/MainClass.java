package inter.basic2;

public class MainClass {
	public static void main(String[] args) {
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();
		
		// 1. Animal 배열을 생성해서 baduk, nabi, hodol을 저장
		Animal[] animals = new Animal[3];
		animals[0] = baduk;
		animals[1] = nabi;
		animals[2] = hodol;
		
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].eat();
		}
		
		// 2. IPet 배열을 생성한 후에 baduk, nabi, 금붕어를 저장하고, 향상된 포문으로 IPet의 기능을 사용
		
		IPet goldFish = new GoldFish();
		IPet[] pets = {(IPet)baduk, (IPet)nabi, goldFish};
		
		for(IPet pet : pets) {
			pet.play();
		}
		
		System.out.println("---------------------------------");
		// 3.
		PetShop petShop = new PetShop();
		petShop.carePet(pets[0]);
		petShop.carePet((IPet)nabi);
		petShop.carePet(new GoldFish());
		
		
		petShop.petInfo(pets);
	}
}
