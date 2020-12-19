package subway.view;

import java.util.Arrays;

public class OutputView {
	private static final int MAIN_SCREEN_OPTION_LENGTH = 3;
	private static final int PATH_SCREEN_OPTION_LENGTH = 4;

	public static void printMainScreen() {
		Arrays.stream(MainMessages.values())
				.limit(MAIN_SCREEN_OPTION_LENGTH)
				.forEach(value -> System.out.println(value.getMessage()));
		System.out.println();
	}

	public static void printPathScreen() {
		Arrays.stream(MainMessages.values())
				.limit(PATH_SCREEN_OPTION_LENGTH)
				.forEach(value -> System.out.println(value.getMessage()));
		System.out.println();
	}
}