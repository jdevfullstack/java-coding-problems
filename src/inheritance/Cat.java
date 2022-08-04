
class Cat extends Animal {
	void meow(){
		System.out.print("meow");
	}

	public static void main(String[] args) {

		Cat mingming = new Cat();

		//family is coming from Animal class
		System.out.print("call from Animal class, family is : `");
		System.out.print(mingming.family);
		System.out.println("`");

		//meuw method is from Cat class
		System.out.print("call from Cat class, method will `");
		mingming.meow();
		System.out.println("`");

	}

}
 


            

