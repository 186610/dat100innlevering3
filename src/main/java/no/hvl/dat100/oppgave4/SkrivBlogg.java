package no.hvl.dat100.oppgave4;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		try {
            Path path = (mappe == null || mappe.isBlank())
                    ? Paths.get(filnavn)
                    : Paths.get(mappe, filnavn) ;

            if (path.getParent() != null) {
                Files.createDirectories(path.getParent());
            }
            try(BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
                bw.write(samling.toString());

            }
            return true;
        } catch (IOException E) {
            return false;
        }
	}
}
