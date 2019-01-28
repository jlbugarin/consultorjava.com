package leerdirectorio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestBuscaArchivoEspecifico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Stream<Path> walk = Files.walk(Paths.get("g:\\instaladores"))) {

			List<String> result = walk.filter(Files::isDirectory)
					.map(x -> x.toString()).collect(Collectors.toList());

			result.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
