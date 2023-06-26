package pl.lublin.wsei.java.cwiczenia.console;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestNioCopy {

    public static void main(String[] args) throws IOException {

//        long startTimeM = System.currentTimeMillis();
        long startTimeN = System.nanoTime();

        Path original = Paths.get("sample_1920×1280.tiff");
        Path copy = Paths.get("img_copy2.tiff");

//        Files.copy(original, copy, StandardCopyOption.REPLACE_EXISTING);
        Files.copy(original, copy);

//        System.out.println("Czas kopiowania: " + (System.currentTimeMillis() - startTimeM) + " ms");
        System.out.println("Czas kopiowania: " + (float)(System.nanoTime() - startTimeN) / 1_000_000 + " ms");
    }
}
