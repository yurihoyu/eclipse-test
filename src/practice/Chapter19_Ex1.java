package practice;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Chapter19_Ex1 {


	static Path path = Paths.get("C:\\pleiades\\workspace\\input.csv");
	static Path path2 = Paths.get("C:\\pleiades\\workspace\\output.csv");
  	static Charset charset = Charset.forName("UTF-8"); //文字コード



	public static void main(String[] args) {
		try {
            String text = Files.readString(path, StandardCharsets.UTF_8);
            List<String> split = Arrays.asList(text.split("\n"));

            Files.write(path2,split,charset,
            		StandardOpenOption.TRUNCATE_EXISTING);
//            System.out.println(split);

        } catch (IOException e) {
            System.out.println("ファイル読み込みに失敗");
        }


	}

}
