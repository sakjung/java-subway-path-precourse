package subway.controller;

import subway.view.InputView;
import subway.view.Options;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class PathController {
	private static final Map<String, Consumer<Scanner>> options = new HashMap<>();

	static {
		options.put(Options.OPTION_1.getOption(), PathController::findLeastDistance);
		options.put(Options.OPTION_2.getOption(), PathController::findLeastTimeConsumed);
		options.put(Options.QUIT.getOption(), (scanner) -> {});
	}

	private static void findLeastDistance(Scanner scanner) {
		// TODO
		String start = InputView.inputStartStation(scanner);
		String end = InputView.inputEndStation(scanner, start);
	}

	private static void findLeastTimeConsumed(Scanner scanner) {
		// TODO
		String start = InputView.inputStartStation(scanner);
		String end = InputView.inputEndStation(scanner, start);
	}

	private static void controlByOption(String option, Scanner scanner) {
		options.get(option).accept(scanner);
		if (option.equals(Options.BACK.getOption())) {
			return;
		}
		run(scanner);
	}

	public static void run(Scanner scanner) {
		// TODO
		try {
			String option = InputView.inputScreenOption(scanner, options);
			controlByOption(option, scanner);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println();
			run(scanner);
		}
	}
}