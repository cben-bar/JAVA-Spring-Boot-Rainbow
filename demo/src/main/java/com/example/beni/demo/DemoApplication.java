package com.example.beni.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.example.beni.demo.services.Door;
import com.example.beni.demo.services.Bloc;
import com.example.beni.demo.services.Rampart;
import com.example.beni.demo.services.Wall;
import com.example.beni.demo.services.TerminalColor;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("==============================START==============================");
		Wall firstWall = new Wall(10, 10, 10, "first Wall", true);
		Door firstDoor = new Door(2, 5, 7, "first door", true);

		System.out.println(
				TerminalColor.PURPLE_BOLD.getCode() + "==========================Wall==========================");
		firstWall.displayBloc();
		firstWall.displayDescription();
		firstWall.displayDescription("I am a fucking sweety wall!");
		boolean loadB = firstWall.isLoadBearing();
		System.out.println("Boolean of load-birng of " + firstWall.getName() + " is " + loadB);
		System.out.println(firstWall.getName() + firstWall.displayLoadBearing());
		firstWall.setLoadBearing(false);
		loadB = firstWall.isLoadBearing();
		System.out.println("Boolean of load-birng of " + firstWall.getName() + " is " + loadB);
		firstWall.texture();
		System.out.println(
				firstWall.getName() + firstWall.displayLoadBearing() + " He's made with" + firstWall.displayTexture());
		System.out.println(TerminalColor.BLUE_BOLD.getCode()
				+ "==========================Door==========================");
		firstDoor.displayBloc();
		firstDoor.displayDescription();
		firstDoor.displayDescription("I am a nice door!");
		System.out.println(firstDoor.verboseGetName());
		System.out.println(firstDoor.getName() + firstDoor.displayOpenable());
		firstDoor.setOpenable(false);
		System.out.println(firstDoor.getName() + firstDoor.displayOpenable());
		System.out.println(
				firstDoor.getName() + firstDoor.displayOpenable() + " She's made with" + firstDoor.displayTexture());
		System.out.println(firstDoor.isOpenable());
		firstDoor.setOpenable(true);
		System.out.println(firstDoor.isOpenable());
		String whoIAm = firstDoor.toString();
		System.out.println(whoIAm);

		System.out
				.println(
						TerminalColor.YELLOW.getCode() + "==========================Rampart==========================");
		Rampart firstRampart = new Rampart(firstWall);
		System.out.println(firstRampart.toString());

		// System.out.println("==========================Planet
		// (Record)==========================");
		// var earth = new Planet("Earth", 400.017, 510067420);
		// System.out.println(earth.getName());

		System.out.println(
				TerminalColor.PURPLE_BOLD.getCode() + "==========================MAP==========================");
		Map<Bloc, Integer> quantityBloc = new HashMap<Bloc, Integer>();
		quantityBloc.put(new Wall(1, 1, 1, "MapWall", loadB), 16);
		quantityBloc.put(new Door(1, 1, 1, "MapDoor", false), 4);

		Set<Bloc> keys = quantityBloc.keySet();
		for (Bloc key : keys) {
			Integer value = quantityBloc.get(key);
			System.out.println(key.getClass().getName() + " : " + value);
		}

		System.out.println(TerminalColor.reset());

	}

}

// import java.util.List;

// @SpringBootApplication
// public class DemoApplication {

// public static void main(String[] args) {
// SpringApplication.run(DemoApplication.class, args);

// DemoApplication.display();

// Utils.freeStringDisplay(null);
// Utils.freeStringDisplay("----an other class's function was called------");

// Utils.recursiveFunction(5);

// Utils.isRank(1);
// Utils.isRank(5);
// Utils.isRank(10);
// Utils.isRank(15);

// List<String> lst = ListOfString.parsList("I", "am", "sentence");
// ListOfString.displayList(lst);

// ListOfString externStringGenerate = Test.listStringInTest();

// System.out.println("Description from externStringGenerate before setting: " +
// externStringGenerate.getDescription());

// externStringGenerate.setDescription("This is my description!");

// System.out.println("Description after setting: " +
// externStringGenerate.getDescription());
// }

// public static void display() {
// System.out.println("----a function was called------");
// }

// }
// }