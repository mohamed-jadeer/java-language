package advanced;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p3 = Paths.get ("D:\\Temp\\Foo\\Bar");
		Path p4 = Paths.get ("D:\\Temp");
		System.out.format ("%s%n", p4.relativize(p3)); // Foo\Bar
		Path p5 = p3.relativize(p3);
		System.out.println(p5);
		System.out.println(p3);
		System.out.println(p4);

	}

}
