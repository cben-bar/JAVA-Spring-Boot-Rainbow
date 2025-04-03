package com.example.beni.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.example.beni.demo.services.Door;
import com.example.beni.demo.services.Planet;
import com.example.beni.demo.services.Bloc;
import com.example.beni.demo.services.BlocManager;
import com.example.beni.demo.services.Rampart;
import com.example.beni.demo.services.Wall;

import lombok.var;

import com.example.beni.demo.services.TerminalColor;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("==============================START==============================");
		Wall firstWall = null;
		try {
			firstWall = new Wall(100, 10, 10, "first Wall", true);

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
			System.out.println(firstWall.getName() + firstWall.displayLoadBearing() + " He's made with"
					+ firstWall.displayTexture());
			firstWall.displayDensity();
		} catch (IllegalArgumentException e) {
			System.out.println("ERROR. Bloc can't be create: " + e.getMessage());
		}
		System.out.println(
				TerminalColor.BLUE_BOLD.getCode() + "==========================Door==========================");
		Door firstDoor = new Door(100, 5, 7, "first door", true);
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
		firstDoor.displayDensity();
		firstDoor.displayTexture();

		System.out.println(
				TerminalColor.YELLOW.getCode() + "==========================Rampart==========================");
		Rampart firstRampart = new Rampart(firstWall);
		System.out.println(firstRampart.toString());

		System.out.println("==========================Planet(Record)==========================");
		var earth = new Planet("Earth", 400.017, 510067420);
		System.out.println(earth.getName());

		System.out.println(
				TerminalColor.PURPLE_BOLD.getCode() + "==========================MAP==========================");
		Map<Bloc, Integer> quantityBloc = new HashMap<Bloc, Integer>();
		quantityBloc.put(new Wall(1, 1, 1, "MapWall", false), 16);
		quantityBloc.put(new Door(1, 1, 1, "MapDoor", false), 4);

		Set<Bloc> keys = quantityBloc.keySet();
		for (Bloc key : keys) {
			Integer value = quantityBloc.get(key);
			System.out.println(key.getClass().getName() + " : " + value);
		}

		System.out.println(
				TerminalColor.CYAN_BOLD.getCode() + "==========================LINKEDLIST==========================");
		BlocManager managerBloc = new BlocManager();
		Door doorA = new Door(105, 5, 5, "DoorA", false);
		Door doorB = new Door(102, 5, 5, "DoorB", false);
		Door doorC = new Door(103, 5, 5, "DoorC", true);
		Door doorD = new Door(107, 5, 5, "DoorD", false);
		Door doorE = new Door(105, 4, 5, "DoorE", true);
		Door doorF = new Door(105, 1, 1, "DoorF", false);
		managerBloc.addBloc(doorA);
		managerBloc.addBloc(doorB);
		managerBloc.addBloc(doorC);
		managerBloc.addBloc(doorD);
		managerBloc.addBloc(doorE);
		managerBloc.addBloc(doorF);

		System.out.println(TerminalColor.CYAN_BOLD.getCode()
				+ "==========================LINKEDLIST WITH ADD OF MANAGER=========================="

		);
		managerBloc.addWall(70, 50, 100, "Wall" + "i", true);

		managerBloc.displayAllBlocs();
		System.out.println("Nom du Wall récupéré : " + ((Wall) firstWall).getName());

		Bloc foundBloc = managerBloc.getBlocByName("DoorA");
		if (foundBloc instanceof Wall || foundBloc instanceof Door) {
			System.out.println("Bloc found: ");
			foundBloc.displayDescription();
		} else {
			System.out.println(TerminalColor.RED_BOLD.getCode() + "Error: Bloc Not found." + TerminalColor.reset());
		}

		Bloc foundBloc1 = managerBloc.getBlocByName("DoorZ");
		if (foundBloc1 instanceof Wall || foundBloc1 instanceof Door) {
			System.out.println("Bloc found: ");
			foundBloc1.displayDescription();
		} else {
			System.out.println(
					TerminalColor.RED_BOLD.getCode() + "Error: Bloc Not found." + TerminalColor.CYAN_BOLD.getCode());
		}

		int sizeBlocManager = managerBloc.getSize();
		System.out.println("managerBloc size: " + sizeBlocManager);
		managerBloc.displayInt(managerBloc.getSize());
		System.out.println(managerBloc.getSize());

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